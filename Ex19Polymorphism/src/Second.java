
public class Second extends First{
	int b;

	void showSecond() {
		System.out.println("Show Second!");
	}
	
	@Override
	void show() {
		System.out.println("Second 클래스의 show method");
	}
}
