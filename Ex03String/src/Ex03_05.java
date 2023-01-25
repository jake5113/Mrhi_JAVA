import java.util.Scanner;

public class Ex03_05 {
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1, string2, string3;

		do {
			System.out.print("첫번째 자리 입력(3자리): ");
			string1 = scanner.nextLine();
		} while (isInteger(string1) == false || string1.length() != 3);

		do {
			System.out.print("두번째 자리 입력(3~4자리): ");
			string2 = scanner.nextLine();
		} while (isInteger(string2) == false || !(string2.length() == 3 || string2.length() == 4));

		do {
			System.out.print("세번째 자리 입력(4자리): ");
			string3 = scanner.nextLine();

		} while (isInteger(string3) == false || !(string3.length() == 3 || string3.length() == 4));

		System.out.println(string1 + "-" + string2 + "-" + string3);
	}
}
