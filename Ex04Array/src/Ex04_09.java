import java.util.Scanner;

public class Ex04_09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] scores = new int[3][];
		double[] avrgs = new double[3];
		double groupAvrg = 0;

		for (int i = 0; i < scores.length; i++) {

			System.out.print(i + 1 + "반 인원 수 입력 : ");
			scores[i] = new int[scan.nextInt()];
			int sum = 0, avrg = 0;
			for (int j = 0; j < scores[i].length; j++) {

				System.out.print((i + 1) + "반 " + (j + 1) + "번 : ");
				int score = scan.nextInt();
				scores[i][j] = score;
				sum += score;
				avrgs[i] = (double) sum / ++j;
				groupAvrg += avrgs[i];
			}
			System.out.println();
		}

		System.out.println(" --- Java Programming 성적표 ----");

		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "반 : ");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println("[평균 : " + avrgs[i] + "]");
			System.out.println();
		}
		System.out.println("-----------------");
		System.out.println("전체평균 : " + groupAvrg/3);
		double max = avrgs[0];
		int first = 1;
		for (double d : avrgs) {
			if(d>max) {
			max = d;
			first++;
			}
				
		}
		System.out.println("최우수반 " + first + "반");

	}

}
