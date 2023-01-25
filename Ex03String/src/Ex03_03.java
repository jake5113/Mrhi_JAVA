import java.util.Scanner;

public class Ex03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("영단어 입력:");
		String string = scanner.nextLine();
		String[] arr = string.split("");
		String max;
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max.compareTo(arr[i]) <= 0) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
