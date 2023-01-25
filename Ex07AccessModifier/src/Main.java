import aaa.Second;

public class Main {
	public static void main(String[] args) {

		// OOP는 객체의 멤버들을 외부에서 마음대로 사용하는 것에 대해 제한
		// 그래서 존재하는 접근제한자 라는 문법이 존재함.

		// 멤버접근을 제한하는 제한자의 4가지 종류 [보안 강 --> 약]
		// 1. private : 본인 클래스 안에서만 접근이 가능한 제한자
		// 2. default : 같은 패키지 안에서는 . 연산자로 멤버접근이 가능, 다른 패키지에서는 접근 불가
		// 3. protected : 같은 패키지 안에서는 . 연산자로 멤버접근이 가능, 다른 패키지에서는 접근 불가, 단, 상속관계라면 접근 가능함
		// 4. public : 어디서든 . 연산자만 있으면 접근 가능

		// 같은 패키지의 클래스 객체 생성
		First f = new First();

		// 다른 패키지의 클래스 객체 생성
		Second s = new Second();
		s.d = 40;

		// 멤버함수 호출 - 함수도 멤버에 대한 접근제한영향 받음
		// s.show() // error
		s.output();
	}
}
