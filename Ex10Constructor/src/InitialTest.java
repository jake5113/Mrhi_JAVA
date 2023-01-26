
public class InitialTest {

	// 1. 기본값 초기화 - 0에 해당하는 값
	int a;
	int b = 10; // 2. 명시적 초기화
//	a++; //error 
	// 3. 초기화블럭 : 프로그래밍적으로 초기화를 할 수 있다는 장점이 있음.
	{
		a = 20;
		a++;
		if (a < 25)
			a--;
		System.out.println("초기화 블럭");
	}

	// 4. 생성자 메소드를 이용한 초기화 : 파라미터를 전달받아 초기화 할 수 있다는 장점.
	public InitialTest() {
		a = 50;
		System.out.println("생성자 메소드!!");
	}

}




