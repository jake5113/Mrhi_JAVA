
public class Test {
	
	public int a; 			//멤버변수			 
							//--객체마다 변수가 존재함
							//인스턴스 변수 라고도 부름
	
	public static int b; 	//정적(static) 멤버변수 
							//--Test클래스에 1개만 존재함 
							//클래스 변수 라고도 부름
	
	// 생성자
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 일반 메소드 - instance method
	void aaa() {
		System.out.println("일반 메소드");
		System.out.println("a : " + a); // 일반변수
		System.out.println("b : " + b); // static 변수
	}
	
	// static 메소드 - class method : 객체생성과 상관없이 호출 가능한 메소드
	static void bbb() {
		System.out.println("static method");
      // static 메소드 안에서는 static 멤버변수만 사용가능!!
		//System.out.println("a : " + a); // 일반변수 - error
		System.out.println("b : " + b); // static 변수
		
		
		ccc();// 다른 메소드를 호출할 수 있음.
		//ddd();//error - 다른 일반 메소드는 호출 할 수 없음.
	}
	
	static void ccc() {
		System.out.println("ccc method..");
	}
	
	void ddd() {
		System.out.println("ddd method");
	}
	
}
