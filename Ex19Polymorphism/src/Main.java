
public class Main {

	public static void main(String[] args) {

		// 제대로 된 캐스팅
		First f = new First();
		Second s = new Second();

		// 다른 class의 객체를 참조하면 에러
		// 단, 상속관계의 클래스라면..
		f = new Second(); // 부모참조변수로 자식객체를 참조할 수 있음. [UP casting]

		// 부모참조변수로 자식객체를 참조하여 제어 가능
		f.a = 10;
		f.showFirst();
		// 참조는 할 수 있지만..자식객체의 고유기능은 사용 불가능
		// f.b = 20;// error
		// f.showSecond(); // error

		// 그럼 실제로 자식객체의 고유 기능을 사용하고 싶다면
		// 자식객체를 참조하는 참조변수가 필요할 수 밖에 없음
		// 새로운 자식참조변수를 만들고 Second객체를 참조하던 First참조변수 f의
		// 참조값(주소)를 대입해주기 - 객체 공유하기
		Second s2;
		// s2 = f;// error - why? 자식(Second)가 부모(First)를 참조한다고 오해함.
		// f가 참조하는 것이 Second객체라고 알려주면 대입 가능 (형변환)
		s2 = (Second) f; // DOWN casting
		s2.b = 20;
		s2.showSecond();
		
		// 업캐스팅이 되어 있지 않은 상태에서 다운캐스팅만 시도하면 에러
//		First f2 = new First();// 제대로 된 casting
//		Second s3 = (Second) f2; // Down casting 시도
//		s3.showFirst();
//		s3.showSecond();
		
		// 이런 up, down 캐스팅을 왜 하는가?
		// 이걸 알려면 오버라이드 된 메소드일때를 살펴봐야 함 
		First ff = new Second(); // 업캐스팅
		ff.show(); // 실제 참조하고 있는 객체의 오버라이드 된 show()가 발동함
		
		// 업캐스팅이 되어도 자식객체의 기능 메소드를 사용할 수 있는 경우가 있음.
		// 이 기술을 이용하여 다양하게 활용할 수 있음.
		
		System.out.println();
		
		// 실제 활용형태 실습
		// 부모참조변수 1개로 자식객체 모두를 제어할 수 있음.
		First obj;
		obj = new First();
		obj.show();
		
		obj = new Second();
		obj.show();
		
		obj = new Test();
		obj.show();
		
		
		// 조부모참조변수로 손주객체 참조가능
		// First - Second - Third
		obj = new Third();
		obj.show();
		
		// 이렇게 obj.show(); 라는 글씨는 같은데
		// 결과가 다르게 나온다고 하여 "다형성" 이라고 부름
		
		// 다형성을 어떨 때 사용하는지?
		
		
		
		
		
	}

}
