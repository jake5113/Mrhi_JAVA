
public class Second extends First {
	// 아무것도 없어보이지만 First를 상속했기에 이미 First의
	// 멤버를 보유한 상태

	// 본인만의 멤버변수 추가
	int b;

	void showSecond() {
		System.out.println("b: " + b);
	}

	// 상속받은 멤버 a와 본인 멤버 b 모두를 출력하는 기능메소드
	void show() {
		// System.out.println("a: " + a); --> showFirst();
		// 객체지향은 객체의 멤버제어는 객체 스스로 하도록 권장.
		// a 변수를 가진 First객체가 스스로 출력하도록 요청하는 것이 좀 더 바람직한 코드
		// 부모객체의 멤버를 내것인양 사용할 수 있기에 부모의 메소드도 그냥 호출가능
		showFirst();

		System.out.println("b: " + b);
		System.out.println();
	}

	// 멤버변수에 값을 대입해주는 기능 메소드
	void setMembers(int a, int b) {
		// 매개변수의 값을 멤버변수에 대입
		// this.a = a;
		// this. 는 Second를 의미하므로 First의 멤버인 a를 사용하기에는
		// 적합하지 않아보임.
		// 부모객체를 지칭하는 특별한 키워드 : super
		//super.a = a;
		//객체지향은 니껀 니가
		// super의 멤버값입력은 First가 직접하도록 요청
		setA(a);
		this.b = b;
	}

}
