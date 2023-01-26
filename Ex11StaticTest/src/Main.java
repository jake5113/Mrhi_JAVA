
public class Main {

	public static void main(String[] args) {

		//지역변수에는 static 키워드 사용불가
		//static int a; // error
		
		Test t1 = new Test(10,20);
		Test t2 = new Test(30,40);
		Test t3 = new Test(50,60);
		
		t1.a = 100;
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		System.out.println();
		
		t1.b = 200;
		
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		
		// 그래서 b라는 변수가 객체마다 존재하지 않고 오직 1개만 존재하는 모습
		// static 멤버변수라는 것은 객체에 있지 않고 클래스에 오직 1개만 있는 형태여서
		// 객체참조변수명.b 라고 쓰는 것이 어색함
		// 그래서 static 멤버변수를 사용할때는 클래스에 1개만 있는 변수이므로
		// 클래스명.b 라고 쓰는 것이 조금 더 합리적으로 보여짐.
		Test.b = 1000;
		System.out.println(Test.b);
		System.out.println(t3.b);
		
		// static 멤버변수는 객체 안에 있는 것이 아니기에
		// 객체생성과 상관없이 존재하는 변수가 됨. [바로 이 특징이 사용하는 이유]
		// 즉, 객체생성 없이 사용하고 싶은 변수가 있을 때 필요한 문법
		
		// 활용 예) 객체가 몇마리인지 카운팅하고 싶을 때
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		
		System.out.println();
		
		// 메소드에 static 키워드 적용
		// 일반 메소드는 객체를 생성하지 않으면 사용 불가능
		//Test.aaa(); //error
		Test tt = new Test(10,20);
		tt.aaa();

		// static method - 객체생성 없이 그냥 클래스명으로 호출 가능
		Test.bbb();
		
		// 대표적인 활용모습..문자열을 정수로 변환하는 기능 사용
		int n  = Integer.parseInt("478");
		
		System.out.println();
		
		// static 초기화 블럭
		// Second 클래스가 처음 사용될 때 한 번 초기화 함
		System.out.println(Second.b);
		
		
		new Second();
		new Second();
		new Second();
		
	}

}
