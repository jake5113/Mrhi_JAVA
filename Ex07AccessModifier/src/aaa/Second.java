package aaa;

public class Second {
	// 접근제한자가 부여된 4개의 멤버변수
	private int a;
	int b;
	protected int c;
	public int d;

	// defalut 접근제한 멤버함수
	void show() {
		a = 100;
		b = 200;
		c = 300;
		d = 400;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	// public 접근제한
	public void output() {
		System.out.println("public 메소드");
	}
}
