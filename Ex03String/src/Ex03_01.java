import java.util.Scanner;

public class Ex03_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("영단어 입력:");
		String string = scan.nextLine();
		for (int i = 0; i < string.length(); i++) {
			System.out.printf("%c\n",(string.charAt(i) + 1));
		}
	}
}
