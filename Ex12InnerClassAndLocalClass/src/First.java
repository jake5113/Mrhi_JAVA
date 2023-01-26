
public class First {

	int a = 10;
	static int b = 20;

	// static inner class
	// 아우터객체 없이 생성가능한 이너클래스
	public static class Hello {
		void show() {
			System.out.println("Hello ..show");
		}
	}
}
