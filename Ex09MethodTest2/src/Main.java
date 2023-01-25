
public class Main {
	public static void main(String[] args) {

		// 메소드가 왜 필요한지에 대해 알아봤으니
		// 클래스의 메소드를 정의하는 4가지의 문법적 모습 [ 리턴타입 O/X, 파라미터 O/X ]
		Test t = new Test();

		t.aaa(); // 1)

		t.aaa(5); // 2)

		int k = t.bbb(); // 3)
		System.out.println(k);

		int n = t.bbb(5); // 4)
		System.out.println(n);

		System.out.println();

		// 사칙연산을 해주는 계산기 객체 생성(기능[메소드]만 있는 클래스)
		Calculator cal = new Calculator();

		int a = 10;
		int b = 5;

		int sum = cal.sum(a, b);
		int sub = cal.subtract(a, b);
		int mul = cal.multiply(a, b);
		int div = cal.divide(a, b);

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);

		// 실수형 숫자들의 사칙연산 의뢰
		double c = 3.5;
		double d = 4.6;

		System.out.println(cal.sum(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multiply(c, d));
		System.out.println(cal.divide(c, d));

		// 이런식으로 같은 기능인데 자료형이 다를 때 활용하는 문법 - 오버로딩

		// 좀 더 확장하면 GUI 환경에서는 모든 데이터가 문자열 타입임.
		System.out.println(cal.sum("245", "487"));
		System.out.println();

		// 가변인자 ... 연산자
		cal.add();
		cal.add(5);
		cal.add(5, 3);
		cal.add(5, 3, 6);
		cal.add(5, 3, 8, 7);

	}
}
