import java.util.Scanner;

public class Ex03_02 {
	public static void main(String[] args) {
		String a;
		Scanner scanner = new Scanner(System.in);
		System.out.print("영단어 입력:");
		a = scanner.nextLine();
		
		StringBuffer b = new StringBuffer(a);
        String reverse = b.reverse().toString();
        System.out.println(b);
	}
}
