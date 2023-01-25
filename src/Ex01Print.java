
public class Ex01Print {
	public static void main(String[] args) {
		// 출력기능(함수 -> method)을 가진 객체에게 출력을 요청!
		System.out.print("Hello");
		System.out.print("Nice\n");

		System.out.print(10 + "\n");
		System.out.print(3.14);

		System.out.print('G');
		System.out.print(true);

		// 자동 줄바꿈 출력기능
		System.out.println(10 + 3);
		System.out.println("10+3");

		// c언어 처럼 서식문자를 이용하여 출력모양을 만들수도 있음.
		System.out.printf("%3d + %3d = %3d\n", 5, 10, 15);

		// 덧셈연산에 대한 특이점
		System.out.println(5 + 3);// 산술연산자
		System.out.println(10 + 3.14);// int + double 작은-->큰것으로 자동형변환
		System.out.println('G' * 2);// 한문자 +1

		// 문자열 데이터의 덧셈연산 [문자열 붙이기]
		System.out.println("aaa" + "bbb");// 결합연산자
		System.out.println("Hello" + " world");
		System.out.println("aaa" + 10); // "aaa" + "10"
		System.out.println("10" + 10);
		System.out.println("bbb"+3.14+10);
		
		// Java는 출력형식을 만들때 문자열의 + 결합연산으로 처리하는 경우가 많음
		System.out.println("5+3="+(5+3));
		System.out.println(10+3 + "hello");
		
		System.out.println();
		System.out.println();
		
		// 자료형(Data Type)과 변수(Variable)
		// 자료형의 2가지 종류
		//1) primitive(원시) 자료형 - boolean byte char short int long float double
		//2) reference(참조) 자료형 - String Scanner Random ... 등 [class로 만든 자료형]
		
		//변수를 만드는 문법 - 자료형 변수명;
		int a = 10;
		//출력기능을 가진 객체에게 출력을 요청
		System.out.println(a);
		
		//c언어와 다르게 값을 대입할 때 주의점.
//		int b = 3.14;
//		System.out.println(b);
		
		//자료형별로 담을 수 있는 값의 크기가 제한됨
		byte c = 127;
		System.out.println(c);
		//c = 128 // error - 범위를 넘어간 숫자는 에러
		
		short d = 32767; // 양수 음수 각 32768개씩 가능
		System.out.println(d);
				 
		long f = 900000000000000000L;//양수/음수 " 각 900경 / 정수형 상수를 Long으로 만드는 L 키워드가 접미어로 있어야 함.
		System.out.println(f);

		float g = 3.14f; //실수형 상수는 기본으로 double형./ 실수형 상수를 float으로 만드는 f 키워드가 접미어로 있어야 함.
		System.out.println(g);
		
		double h = 3.14;
		System.out.println(h);
		
		char i = 'G';
		System.out.println(i);

		i = 65;
		System.out.println(i);
		
		boolean j = true;
		System.out.println(j);

		//작은 값은 큰변수에 대입이 가능함. [자동 형변환]
		double k = 10;
		System.out.println(k);
		
		long m = (long)3.14;//무조건 실수가 정수보다 큰 자료형!
		System.out.println(m);
		
		//long + float 연산하면 long 을 float 으로 변환하여 연산함
		System.out.println(100L + 3.14f);
		
		//byte, short는 별도의 접미어 없이도 int형 상수값을 대입가능함
		byte n = 10;
		short o = 32000;
		
		//byte나 short 변수끼리의 연산은 자동 int로 변환되어 계산됨
		short x = 10;
		short y = 50;
		short t;
		t = (short)(x+y);
		System.out.println(t);
		
		System.out.println();
		System.out.println();
		
		//자바의 상수 - 2가지 종류
		//1. literal 상수 - 값 자체를 의미함. [3.14, 'a', true, 10, "hello"]
		//2. final 상수 - 상수화된 변수
		
		final int z = 10; // final 상수
		//z = 20;//error - 상수는 값 변경 불가
//		final int ZZ;
//		ZZ= 1;
//		System.out.println(ZZ);

		final int USER_MAX = 3;
		System.out.println(USER_MAX);
		
		
		//참조형에 대한 맛보기
		String str = new String("Hello");
		System.out.println(str.toString());
		
		String s = "hello"; // 자동 new String("hello");
		System.out.println(s); // 자동 toString()해줌
		
		char u;
		u = 20729;
		System.out.println(u);
	}
}
/*	
기본형(primitive)
1	boolean
1	byte  2^8 = 256 / -128 ~ 127
2	char
2	short
4	int   
8	long
4	float
8	double
	
참조형(reference) - 주소를 저장 8byte
	String, Scanner, System, Random ... 2000여개 class로 만든 자료형
	Double Float Byte Integer ...
	 
*/




