
public class Test {

	final int USER_NUM = 100; // final 멤버변수

	// static 변수 - 클래스변수
	public static final int COUNT = 100;

	void aaa() {
		// USER_NUM = 200; // error - final 변수는 변경불가!
		bbb(10);
	}

	void bbb(final int n) { // 매개변수도 final 가능함
		// n = 20;// error
		System.out.println(n);
	}

	// 메소드에도 final 키워드
	// 이 메소드의 기능이 마지막이니 개선하지 마라
	// override를 하지 못하는 메소드를 만들때
	final void show() {
		System.out.println("TEST");
	}

}
