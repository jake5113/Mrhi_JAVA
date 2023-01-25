import java.util.Scanner;

public class Ex03_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string;
		while (true) {
			System.out.printf("메일 주소 입력(@포함) : ");
			string = scan.next();
			if (string.contains("@")) {
				break;
			}
			System.out.println("[잘못 입력하셨습니다. @포함 메일서버주소까지 모두 입력하셔야 합니다.]\r" + "");
		}
		String[] arr = string.split("@");
		System.out.println("입력된 메일주소명 : "+arr[0]);
		System.out.println("메일서버 이름 : "+arr[1]);
	}
}
