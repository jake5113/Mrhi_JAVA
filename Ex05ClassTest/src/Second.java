// 사용자 정의 클래스
public class Second {
	// 클래스는 멤버변수(필드)와 멤버함수(메소드)로 구성

	// 멤버변수(필드)
	int a;

	// 멤버함수(메소드)
	void aaa() {
		System.out.println("Second aaa method");

		// 함수안에 다른 class 설계
		// 지역 class 라고 부름 ===================
		class Nice {
			int a;

			void show() {
				System.out.println("Nice show method");
			}
		}// =====================

	}// aaa method

	// 다른 클래스 설계하기 //////////////////////////
	// inner class 라고 부름
	class Hello {
		int a;

		void show() {
			System.out.println("Hello show method");

		}
	}////////////////////////////////

}// Second class

// 또 다른 class를 선언할 수 있음.
class Third {
	int a;

	void show() {
		System.out.println("Third show method");
	}
}
