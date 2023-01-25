import java.util.Random;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		// 랜덤한 값을 만들어내는 능력(기능)을 가진 class : Random
		Random rnd = new Random();

		// 랜덤한 정수값 얻어오기
		int a = rnd.nextInt();
		System.out.println("a: " + a);

		// 0~9 10개의 숫자 중에 하나가 랜덤하게 나오도록
		int b;
		b = rnd.nextInt(10);
		System.out.println("b : " + b);

		// 0~99
		int c;
		c = rnd.nextInt(100);
		System.out.println("c : " + c);

		// 5~15
		int d = rnd.nextInt(11) + 5;
		System.out.println("d : " + d);

		// -5~5
		int e = rnd.nextInt(11) - 5;
		System.out.println("e : " + e);

		// 실수형
		double f = rnd.nextDouble();
		System.out.println("f: " + f);// 0.0 ~ 0.999...99999

		// 0.0 ~ 9.999
		double g = rnd.nextDouble() * 10;
		System.out.println("g : " + g);

		// 0.0 ~ 14.9999
		double h = rnd.nextDouble() * 15;
		System.out.println("h : " + h);

		// 논리값 랜덤
		boolean i = rnd.nextBoolean();
		System.out.println("i: " + i);

		if (i)
			System.out.println("Good");
		else
			System.out.println("Bad");

		System.out.println("=================");

		
		// 컴퓨터가 생성한 랜덤한 숫자를 맞추는 게임 만들기
		int pcNum, userNum;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		pcNum = rand.nextInt(100);

		//10번안에 성공하기
		for (int j = 1; j < 11; j++) {

			System.out.print(j + "번: ");
			userNum = scan.nextInt();

			if (pcNum < userNum) {
				System.out.println("down");
			} else if (pcNum > userNum) {
				System.out.println("up");
			} else {
				System.out.println("정답!" + pcNum);
				break;
			}
		}
	}
}
