import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		// Java의 2차원배열 - 1차원배열 참조변수를 여러개 가진 배열객체

		// 2차원 배열객체 생성
		int[][] aaa = new int[3][]; // 1차원배열 참조변수 3개짜리 배열객체
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);

		aaa[0] = new int[4];
		aaa[1] = new int[2];
		aaa[2] = new int[5];

		// 1차원 배열객체들의 요소(int형 변수)에 정수값 대입
		aaa[0][0] = 10;
		aaa[0][1] = 20;
		aaa[0][2] = 30;
		aaa[0][3] = 40;

		aaa[1] = new int[] { 100, 200 };

		aaa[2] = new int[] { 1000, 2000, 3000, 4000, 5000 };

		// 반복문을 이용하여 출력
		System.out.println(aaa.length);
		System.out.println(aaa[0].length);
		System.out.println(aaa[1].length);
		System.out.println(aaa[2].length);

		// 반복문을 사용해서 요소값들 출력해보기
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[i].length; j++) {
				System.out.print(aaa[i][j] + ", ");
			}
			System.out.println();
		}

		for (int[] t : aaa) {
			for (int e : t) {
				System.out.print(e + ", ");
			}
			System.out.println();
		}

		// 만약 2차원 배열이 가진 참조변수들이 모두 같은 갯수의 배열객체를 참조한다면
		int[][] bbb = new int[2][3];// 1차원배열객체들도 모두 만들어줌.
		for (int i = 0; i < bbb.length; i++) {
			for (int j = 0; j < bbb[i].length; j++) {
				System.out.print(bbb[i][j] + ", ");
			}
			System.out.println();
		}

		// 2차원 배열의 초기화
		int[][] ccc = new int[][] { new int[] { 10, 20 }, new int[] { 10, 20, 30, 40 } };

		// 초기화의 축약표현문법 허용.
		int[][] ddd = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int[] t : ddd) {
			for (int e : t) {
				System.out.print(e + ", ");
			}
			System.out.println();
		}
		System.out.println();

		// 2차원배열의 길이값을 변수로 지정해보기..키보드로 입력받은 개수 크기로
		Scanner scan = new Scanner(System.in);

		System.out.print("층수 입력 : ");
		int a = scan.nextInt();
		int[][] eee = new int[a][];

		// 입력된 층수만큼 1차원배열 참조변수들에 객체 대입
		for (int i = 0; i < eee.length; i++) {
			System.out.print("호수 입력 : ");
			int b = scan.nextInt();
			eee[i] = new int[b];
		}

		// 입력된 층수, 호실 수 만큼 배열이 잘 만들어졌는지 확인
		for (int[] t : eee) {
			for (int e : t) {
				System.out.print(e + ", ");
			}
			System.out.println();
		}
		
		
		
		//3차원 배열도..2차원 배열 참조변수를 여러개 가진 배열객체
		int[][][] abc = new int[2][][];
		abc[0] = new int[3][];
		abc[1] = new int[4][];
		
		abc[0][0] = new int[5];
		abc[0][1] = new int[3];
		abc[0][2] = new int[2];

		abc[0][1][1] = 3;
		
		
		
		System.out.println();
		System.out.println("=====================");
		System.out.println();
		
		
		//배열은 한번 만들어진 요소의 개수를 변경할 수 없음!!!
		//실무환경에서는 대량의 데이터 개수가 유동적인 경우가 더 많다.
		
		//그래서 등장한 유동적 배열용 클래스가 존재함. [마치 기차같은 모양]
		//ArrayList 클래스
		
		ArrayList<String> list = new ArrayList<String>();
		
		//요소의 개수 확인하는 기능(메소드)
		System.out.println("리스트의 개수: "+ list.size());
		
		//요소 추가
		list.add(new String("aaa"));
		list.add(new String("bbb"));
		System.out.println("리스트의 개수: "+ list.size());
		
		//요소값 출력해보기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		list.remove(0);
		System.out.println("리스트의 개수: "+ list.size());
		System.out.println(list.get(0));
		
	}
}
