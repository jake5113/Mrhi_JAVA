
public class Second extends First {
	// 이미 First의 a변수를 보유한 상태
	private int b;

	// 멤버값을 출력하는 기능메소드 [상속받은 a변수도 출력할 의무 있음]
	public void show() {
		super.show();
		System.out.println("b : " + b);
	}

}
