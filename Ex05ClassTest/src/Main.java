
public class Main {
	public static void main(String[] args) {

		// 객체지향프로그래밍(OOP) - 객체 위주로 프로그래밍을 한다.
		// 객체 : 고유한 기능과 값을 가진 녀석(변수 + 함수)
		// class : 객체의 종류

		// OOP는 이런 객체들을 필요할 때 만들어서 기능을 사용하여 프로그래밍 하는 방식
		// 자바에서는 자주 사용될 기능들을 이미 만들어 설계해 놓았다.
		// 이런 설계도 파일들을 class 라고 부른며..2000여개 정도 존재함.
		// 이런 class들을 Java System Library API 라고 부름.

		// 아무리 2000여개의 클래스가 있더라도 내가 원하는 모든 기능이 모두
		// 있을 수는 없음. 그래서 개발자가 기능을 만들어야 하는 경우도 있음.
		// 이를 사용자 정의 클래스 라고 부른다.

		// class를 만드는 방법 - 4가지 위치.
		// 1) 별도의 .java 문서에 만들기
		// 2) 하나의 .java 문서안에 여러개의 class를 설계하기
		// 3) class안에 또 다른 class 설계하기
		// 4) 함수(메소드)안에 class를 설계하기

		// 개발자가 정의한 class를 이용하여 객체 생성
		Second s = new Second();
		s.a = 10; // 멤버변수 사용
		s.aaa(); // 멤버함수 사용

		Third t = new Third();
		t.a = 100;
		t.show();

		// Second클래스 안에 설계한 Hello inner 클래스
		// Hello h = new Hello(); // 못알아들음
		// Second.Hello h = new Second.Hello(); //이너클래스는 객체 생성 불가

	}
}
