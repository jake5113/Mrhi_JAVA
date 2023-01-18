import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int[] num = new int[3];
		int num1, num2, num3, number;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		// 중복값 제거
		for (int i = 0; i < 3; i++) {
			num[i] = random.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					continue;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			int strike = 0, ball = 0;
			System.out.print(i + 1 + "회: ");
			number = scan.nextInt();
			num1 = number / 100;
			num2 = number / 10 - num1 * 10;
			num3 = number % 10;
			
			if (num1 == num[0]) {
				strike++;
			}
			if (num2 == num[1]) {
				strike++;
			}
			if (num3 == num[2]) {
				strike++;
			}
			if (num1 == num[1] || num1 == num[2]) {
				ball++;
			}
			if (num2 == num[0] || num2 == num[2]) {
				ball++;
			}
			if (num3 == num[0] || num3 == num[1]) {
				ball++;
			}
			if (strike == 3) {
				System.out.println("정답!!");
				break;
			}
			System.out.println("S" + strike + " " + "B" + ball);
		}
		System.out.println(num[0] * 100 + num[1] * 10 + num[2]);
	}
}
