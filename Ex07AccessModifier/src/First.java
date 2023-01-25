
public class First {

	// 4가지 유형의 접근제한자가 적용된 멤버변수들
	private int a;
	int b; // 아무 명시가 없을때 default
	protected int c;
	public int d;

	// 멤버함수
	void aaa() {
		// 같은 클래스안에 있는 멤버변수들은 접근제한자와 상관없이 그냥 사용
		a = 30;
		b = 20;
		c = 10;
		d = 40;
	}

}
