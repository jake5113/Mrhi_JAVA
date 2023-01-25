import java.util.Scanner;

public class Ex04_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int[] count = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("정수" + (i + 1) + "번의값을입력하세요(1~100) : ");
			num[i] = scan.nextInt();

			if (num[i] < 0 || num[i] > 100) {
				System.out.println("\"잘못된값입니다. 다시입력하시오.");
				i--;
				continue;
			}
			for (int j = 0; j < 10; j++) {
				if (10 * j < num[i] && num[i] < 10 * j + 11) {
					count[j]++;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			String ss = String.format("%03d ~ %03d :", 10 * i + 1, 10 * i + 10);
			System.out.print(ss);

			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
