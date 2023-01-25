import java.util.Scanner;

public class Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String string = scanner.nextLine();
		System.out.println(string.replace(" ", ""));
	}
}
