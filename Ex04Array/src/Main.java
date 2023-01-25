import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Java 언어에서 배열은 객체이다.

		// int형 3개짜리 배열객체를 생성
		int[] aaa = new int[3]; // 배열의 요소들은 자동 0에 해당하는 값으로 초기화

		System.out.println(aaa);// 배열객체의 .toString()이라는 기능이 자동 발동함-해쉬코드값
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		// System.out.println(aaa[3]); // error - 인덱스 범위를 벗어남.

		// 배열요소에 값 대입
		aaa[0] = 10;
		aaa[1] = 20;
		aaa[2] = 30;

		// 반복문을 이용하여 배열 요소값 출력
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
		System.out.println("----------------");

		// 배열객체를 생성하면서 배열 요소값들을 초기화해보기
		int[] bbb = new int[] { 1, 2, 3 }; // 초기화하면 배열개수를 명시하면 안됨!

		// 배열객체 생성 및 초기화할때 축약표현문법
		int[] ccc = { 3, 6, 9 }; // 자동 new int[]
		for (int i = 0; i < ccc.length; i++) {
			System.out.println(ccc[i]);
		}

		// 배열생성할때 개수지정을 상수가 아니라 변수로 지정할 수 있다.
		int n = 5;

		// 배열개수 n의 값을 키보드로 입력받을 수 있다.
		Scanner scan = new Scanner(System.in);
//		System.out.print("배열 개수 입력 : ");
//		n = scan.nextInt();

		int[] ddd = new int[n];
		for (int i = 0; i < ddd.length; i++) {
			ddd[i] += i;
			System.out.print(ddd[i] + ", ");
		}
		System.out.println();

		// 배열객체의 초기화 할 때도 변수로 값 지정 가능함
		int k = 10;
		int[] eee = new int[] { k, k + 1, k + 2 };
		for (int i = 0; i < eee.length; i++) {
			System.out.print(eee[i] + ", ");
		}
		System.out.println();

		// 배열요소의 개수가 0개짜리인 배열객체도 존재할 수 있음.
		int[] fff = new int[0];
		System.out.println("배열길이 : " + fff.length);
		System.out.println();

		// 배열참조변수끼리의 대입
		double[] ggg = new double[] { 3.14, 2.48, 7.23 };
		double[] hhh = ggg; // 객체대입X 주소값 복사ㅇ - 하나의 객체를 공유하게 됨
		for (int i = 0; i < ggg.length; i++) {
			System.out.print(ggg[i] + ", ");
		}
		System.out.println();

		hhh[0] = 1.1;
		for (int i = 0; i < ggg.length; i++) {
			System.out.print(ggg[i] + ", ");
		}
		System.out.println();

		// 배열객체를 copy 해보기 [배열 요소값들을 복사하기]
		int[] mmm = new int[] { 50, 60, 70 };
		int[] nnn = new int[mmm.length]; // mmm배열과 같은 개수의 값이 0인 배열객체 생성
		for (int i = 0; i < nnn.length; i++) {
			nnn[i] = mmm[i];
		} // mmm과 nnn이 참조하는 배열객체는 서로 다른 객체임!

		System.out.println();
		System.out.println("----------------");
		System.out.println();
		// ------------------------------------------------------------------

		// 참조형 자료형의 배열객체 생성해보기
		String[] sss = new String[3]; // String 참조변수 3개짜리 배열
		System.out.println(sss); // 자동 .toString()
		System.out.println(sss[0]);
		System.out.println(sss[1]); // 참조형변수의 기본값은 null
		System.out.println(sss[2]);
		System.out.println("----------------");

		// 배열객체의 요소들(참조변수)에 값(객체) 대입
		sss[0] = new String("sam");
		sss[1] = "robin"; // 자동 new String()
		System.out.println(sss[0]);
		System.out.println(sss[1]);
		System.out.println(sss[2]);
		System.out.println();

		// 각 배열요소(Stirng 참조변수)의 기능메소드 사용해보기
		System.out.println("배열길이: " + sss.length);
		System.out.println("sss[0] String 길이: " + sss[0].length());
		System.out.println(sss[1].length());
		System.out.println();

		char ch = sss[1].charAt(2);
		System.out.println(ch);

		// 참조형 배열객체 생성하면서 배열요소들 초기화 해보기
		int[] xxx = new int[] { 10, 20, 30 };
		String[] uuu = new String[] { new String("android"), "ios", "web" };
		uuu = new String[] { "and", "io" };
		for (int i = 0; i < uuu.length; i++) {
			System.out.println(uuu[i]);
		}

		String[] ttt = { "hello", "bye", "jake" };
		for (int i = 0; i < ttt.length; i++) {
			System.out.println(ttt[i]);
		}
		System.out.println("----------------");

		// 당연히 개발자가 만든 class도 배열로 만들 수 있음.
		Person p = new Person();
		p.name = "sam";
		p.age = 20;
		p.show();

		Person[] people = new Person[3];
		people[0] = new Person();
		people[1] = new Person();
		people[2] = new Person();

		people[0].show();
		people[1].show();
		people[2].show();
		System.out.println();

		// 배열처럼 여러개의 요소를 가진 객체의 요소제어를 위한 반복문을 쉽게 사용하기 위해 등장한 새로운 for 문법
		// 확장된 for문 [다른언어에서는 for each문 이라고도 부름]

		int[] nums = {10, 20, 30};
		
		//반복문 이용하여 요소값들 출력
		for (int i = 0; i < nums.length; i++) {
			int t = nums[i];
			System.out.println(t);
		}
		
		// 확장된 for 문법으로 배열의 요소값을 간결하게 출력 해보기
		for(int t : nums) {
			System.out.println(t);
		}
		System.out.println();
		
		
		double[] www = {3.14,2.56,8.79};
		for (double t : www) {
			System.out.println(t);
		}
		
		
		String[] rrr = {"android", "react", "java"};
		for (String string : rrr) {
			System.out.println(string + ":" + string.length());
		}
		
		
		
		
		
		
		
		
		
		
	}
}

//사용자 정의 class
class Person {
	String name;
	int age;

	void show() {
		System.out.println(name + " : " + age);
	}
}
