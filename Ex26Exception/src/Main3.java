import java.io.UncheckedIOException;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// throw : 코드를 통해 강제로 예외를 발생시키는 문법
		try {
			System.out.println("aaa");

			// 억지로 예외발생 - 억지로 catch문으로 이동시키기
			throw new Exception();

			// System.out.println("bbb");

		} catch (Exception e) {
			System.out.println("예외발생");
		}
		System.out.println();

		// 활용 예]
		// 메소드에 계산을 요청할 때 그 결과가 음수가 나오는 것이 싫어!!
		// 즉, 음수가 나오면 예외라고 인지 했으면한다.
		// java 언어에서 연산 결과가 음수라고 예외로 보지 않는다. 이럴 때 사용
		int n;
		
		try {
		n = aaa(10, 5);
		n = aaa(10, 15);
		System.out.println("n: " + n);
		}catch (Exception e) {
			System.out.println("예외 : 계산결과가 음수임!");
			System.out.println("예외메세지 : " + e.getMessage());
		}
	}

	static int aaa(int a, int b) throws Exception{

		// 음수가 나오면 에러라고 하고 싶을 때
		if (a < b) {
			throw new MyException("Hi"); // 강제로 예외를 발생시키기
			
		}
		return a - b;

	}

}

// 나만의 Exception 클래스
class MyException extends Exception {
	//생성자
	public MyException(String msg) {
		super(msg);
		
	}
	
}

