
// interface : 추상메소드만 가진 추상클래스
// interface == abstract class
public interface Test {
	//인터페이스는 오로지 추상메소드만 가지는 클래스임.
	abstract void aaa(); // 기능의 이름만 정함.
	
	//인터페이스 안에서는 모든 메소드가 abstract 이므로 자동 적용됨
	void bbb();

	// 일반메소드는 정의 불가능
	//void show() {} //error
	
	
}
