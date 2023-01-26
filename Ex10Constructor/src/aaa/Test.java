package aaa;

public class Test {
	public int a;
	int b; // default(package) 접근제한 - 같은 패키지에서만 접근 가능
	
	// default 접근제한 생성자메소드 - 같은 패키지에서만 호출 가능
	Test(){
		System.out.println("Test 객체 생성!");
	}
	
}
