import java.util.Scanner;

public class Ex04_01 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print(i+1+"번째 정수:"); 
			array[i] = scan.nextInt();
		}
		int max = array[0];
		int min = array[0];
		int sum = 0;
		for (int i : array) {
			if (i>max) max = i;
			if (i<min) min = i;
			sum += i;
		}
		System.out.println("max: "+ max);
		System.out.println("min: "+ min);
		System.out.println("sum: "+ sum);
	}
}
