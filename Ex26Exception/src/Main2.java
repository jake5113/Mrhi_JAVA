import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// throws : 예외 떠넘기기 문법

		try {
			int num = divide(10, 0);
			System.out.println("num : " + num);
		} catch (Exception e) {
			System.out.println("divide 메소드의 throws 된 예외를 대신 처리");
		}

		System.out.println();

		// 강제로 예외처리를 해야만 하는 Checked Exception 을 던지는 메소드사용
		try {
			aaa();
		} catch (MalformedURLException e) {

		}

		try {
			ccc();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	
	
	static void ccc() throws MalformedURLException {
		bbb();
	}

	// throws 는 폭탄 떠넘기듯 예외도 마구 떠넘길 수 있다.
	static void bbb() throws MalformedURLException {
		aaa();
	}

	static void aaa() throws MalformedURLException {
		// 이 곳에서 해야할 예외처리를 떠넘기기 : throws
		URL url = new URL("https://www.google.com");
	}

	// 두 수를 나눗셈연산하여 결과를 리턴해주는 기능 메소드
	// 경우에 따라서는 예외가 발생하는 코드에서 직접 처리가 애매할 수 있음.
	// 이럴 때 이곳에서 예외를 처리하지 않고..
	// 이 메소드를 호출하는 쪽으로 예외를 던져버리는 문법 : throws [일종의 폭탄 돌리기]
//	static int divide(int x, int y) {
//		try {
//			return x / y;
//		} catch (ArithmeticException e) {
//			return ???
//		}
//	}

	static int divide(int x, int y) throws ArithmeticException {
		return x / y;
	}

}
