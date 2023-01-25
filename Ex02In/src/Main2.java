import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		// 사용자로부터 2개의 정수를 입력받아 덧셈하는 프로그램
		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.print("숫자 입력: ");
		a = scan.nextInt();

		System.out.print("숫자 입력: ");
		b = scan.nextInt();

		System.out.println(a + " + " + b + " = " + (a + b));
		
		//연산자 - C언어와 동일함.
		//새로추가된 연산자 [ 비트연산자 >>> - 부호비트까지 밀어버림]
		
		//주소나 메모리사이즈 보는 연산저 없음.
		
		//제어문 - C언어와 동일함.
		//조건문 : if else, switch case
		//다른점, switch 문에 문자열 변수 사용이 가능.

		//문자열의 비교에 대한 의미파악 - 아주중요!!
		String s1 = "Hello";
		String s2 = new String("Hello");//원래는 이렇게!!

		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);//false : 주소끼리 비교
		System.out.println(s1.valueOf(true) == s2.valueOf(true));
		System.out.println(s1.equals(s2));//String객체의 값비교 기능함수를 사용
		
		//반복문 : while, for, do-while
		//무한반복
		//while(1) {} - error
//		while(true) {} 
		

	
	
	}
}
