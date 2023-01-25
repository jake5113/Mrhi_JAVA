import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요: ");
		int[] score = new int[scan.nextInt()];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print("학생" + (i + 1) + "의 성적을 입력하세요 : ");
			int num = scan.nextInt();
			if (num > 100 || num < 0) {
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--;
				continue;
			}
			sum += num;
		}
		double avrg = (double) sum / score.length;
		System.out.println("성적 평균은 " + avrg + "입니다.");
	}
}
