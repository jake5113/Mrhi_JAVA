import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1자리 숫자 입력받아 보기
//		int a;
//		try {
//			a = System.in.read();
//			System.out.println(a);
//			a -= 48;
//			System.out.println(a);
//			System.out.println("덧셈결과 : " + (a + 50));
//			
//		} catch (Exception e) {
////			TODO: Auto-Generated catch block
//			e.printStackTrace();
//		}

		// 3자리 숫자 입력받아 보기
//		int num = 0;
//
//		try {
//			int n;
//			n = System.in.read();
//			num += (n - 48) * 100;
//			n = System.in.read();
//			num += (n - 48) * 10;
//			n = System.in.read();
//			num += n - 48;
//			System.out.println("num: " + (num + 10));
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 위 처럼 입력받아서 자료형으로 변하는 코드를 직접 작성하는 것은 매우 번거로움.
		// 이 작업을 편히 하기 위해서 만들어진 class 가 Scanner 클래스.
		// Java언어는 모든 객체를 반드시 Heap 메모리 영역에 만들어야만 한다.
		// Heap 메모리에 객체를 생성하는 키워드 사용 : new

		Scanner scan = new Scanner(System.in);

		// 정수형 숫자 입력
		int a;
		System.out.print("정수입력 : ");
		a = scan.nextInt();
		System.out.println("a : " + a);

		// 실수형 숫자 입력
		double b;
		System.out.print("실수입력 : ");
		b = scan.nextDouble();
		System.out.println("b : " + b);

		// 논리값 입력
		System.out.print("논리값 입력: ");
		boolean c = scan.nextBoolean();
		System.out.println("c : " + c);
		
		// 문자열 입력
		System.out.print("문자열 입력: ");
		String s = scan.next();//띄어쓰기 없는 문자열 입력[단어입력기능]
		System.out.println("s : " + s);
		
		// 띄어쓰기 포함한 문자열 입력
		System.out.print("문자열 입력: ");
		String s2 = scan.nextLine();//[문장입력기능]-이전 Enter키를 입력으로 받는 오류.
		s2 = scan.nextLine();		//해결 방법-한 번 더 사용.
		System.out.println("s2 : " + s2);

	}
}