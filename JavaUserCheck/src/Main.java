import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String newNum = scan.nextLine();
		int[] numList = new int[newNum.length()];

		// 공백과 '-' 문자를 빈문자열로 바꾸기
		newNum = newNum.replaceAll("[\\s\\-]", "");

		for (int i = 0; i < newNum.length(); i++) {
			String[] temNum = newNum.split("");

			try {
				numList[i] = Integer.parseInt(temNum[i]);

			} catch (NumberFormatException e) {
				System.out.println("..개인정보가 아닙니다.");
				return;
			}
		}
		isPersonCodeNum(newNum, numList);
	}

	// 주민번호 체크 함수
	static void isPersonCodeNum(String newNum, int[] numList) {
		int checkNum = 0;

		if (newNum.length() == 16) {
			// 카드번호 체크
			System.out.println("...카드번호가 맞습니다.");
			return;
		} else if (newNum.length() == 13) {
			for (int i = 0; i < newNum.length(); i++) {
				int mulNum = i;

				if (i == 12) {
					if (numList[12] == (11 - (checkNum % 11)) % 10) {
						System.out.println("...주민번호가 맞습니다.");
						return;
					} else {
						System.out.println("..개인정보가 아닙니다.");
						return;
					}
				}

				if (i > 7) {
					mulNum -= 8;
				}

				checkNum += (Integer.valueOf(numList[i]) * (mulNum + 2));
			}
		} else {
			System.out.println("..개인정보가 아닙니다.");
			return;
		}
	}
}