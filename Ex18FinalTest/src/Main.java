
public class Main extends First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 지역변수 final을 붙이면 상수화된 변수
		final int a = 10;
		// a = 20; // error : changing value of variable 'a' is impossible

		// 자바의 특이한 점.
		final int b;
		b = 50; // 처음 값을 대입할 때 상수화 됨. - 권장하지 않음
		// b = 30; // error

		// 멤버변수에 final

		//
		System.out.println(Test.COUNT);
		// Test.COUNT = 20; //error

		// final 을 메소드에서 적용 가능 - 오버라이드 금지

		// class에도 final 키워드 적용가능 - 상속이 불가능한 클래스
	
	}

	

}
