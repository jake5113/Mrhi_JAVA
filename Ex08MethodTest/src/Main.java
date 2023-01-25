import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 학생성적관리 프로그램
		// 이름, 국어, 영어, 평균
		String name;
		int kor;
		int eng;
		double aver;

		name = "sam";
		kor = 80;
		eng = 70;
		aver = (double) (kor + eng) / 2;

		// 만약, 이런 학생이 여러명이면..
		// 위 변수 4개를 매번 만드는 작업이 매우 번거로움
		// 여러개의 데이터를 관리하는 배열객체를 이용해보기
		String[] arrName = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		double[] arrAver = new double[10];

		arrName[0] = "sam";
		arrKor[0] = 80;
		arrEng[0] = 70;
		arrAver[0] = (double) (arrKor[0] + arrEng[0]) / 2;

		// 위처럼 자료형별로 배열객체로 묶어서 사용하는 것도
		// 은근 짜증나고 가독성도 떨어짐.
		// 학생 1명의 데이터가 서로 다른 배열객체에 나누어져 있어서..

		// 그래서 서로 연관있는 데이터끼리(이름, 국어, 영어, 평균) 묶어서
		// 관리하는 것이 더 효과적임

		// 연관있는 데이터끼리의 묶음을 설계하는 class 정의
		// 별도의 .java 문서에 새로운 클래스를 설계 해보기

		// 새로 설계한 Student 클래스로 객체를 생성
		Student stu = new Student();
		stu.name = "sam";
		stu.kor = 80;
		stu.eng = 70;
		stu.aver = (double) (stu.kor + stu.eng) / 2;

		Student stu2 = new Student();
		stu2.name = "robin";
		stu2.kor = 90;
		stu2.eng = 95;
		stu2.aver = (double) (stu2.kor + stu2.eng) / 2;

		// 화면 출력
		System.out.println(stu); // 참조변수를 출력하면 자동 .toString()발동 [클래스명@해시코드]
		System.out.println("name: " + stu.name);
		System.out.println("kor : " + stu.kor);
		System.out.println("eng : " + stu.eng);
		System.out.println("aver: " + stu.aver);
		System.out.println();

		System.out.println("name: " + stu2.name);
		System.out.println("kor : " + stu2.kor);
		System.out.println("eng : " + stu2.eng);
		System.out.println("aver: " + stu2.aver);
		System.out.println();

		// 객체 멤버값 변경해보기
		int k = 80;
		stu2.kor = k;
		System.out.println("변경된 국어성적 : " + stu2.kor);
		System.out.println();

		// 3번째 학생의 데이터는 키보드로 입력받아보기
		Scanner scan = new Scanner(System.in);

		Student stu3 = new Student();
//		stu3.name = scan.next();
//		stu3.kor = scan.nextInt();
//		stu3.eng = scan.nextInt();
		stu3.aver = (double) (stu3.kor + stu3.eng) / 2;

		System.out.println("name: " + stu3.name);
		System.out.println("kor : " + stu3.kor);
		System.out.println("eng : " + stu3.eng);
		System.out.println("aver: " + stu3.aver);
		System.out.println();
		// 이런식으로 멤버값을 일일히 출력하는 코드를 작성하는거 비효율적.
		// 그래서 객체라는 녀석이 스스로 본인의 멤버값을 출력하는 기능이 있다면!
		// 편하게 그 기능을 사용하면 되겠다.
		// stu3.출력해(); // 이런 기능이 있다면!

		// 객체가 기능을 가질 수 있도록 class 안에 기능(함수)를 설계하고 사용하기
		// 객체의 기능을 사용하기 - 메소드를 호출!
		stu3.show();

		// 이런식으로 객체안에 기능을 만들면 편하게 코딩할 수 있다.
		Student stu4 = new Student();
		stu4.name = "hong";
		stu4.kor = 75;
		stu4.eng = 77;
		stu4.calAverage();
		stu4.show();

		// 이런식으로 특정한 기능들을 미리 class에 설계해 놓으면
		// 훨씬 코드가 간결해지기 시작함.

		// 매번 학생데이터를 넣을때 멤버값들을 한줄씩 넣기가 번거로움
		// 입력하는 기능도 있다면 코드가 더 간결해진다.
		Student stu5 = new Student();
		stu5.setMembers("park", 50, 40);

		// 결국, 메소드의 존재이유는 코드를 보다 간결하게 하고
		// 객체의 멤버는 객체 스스로 제어하도록 하기 위함.

		// 정리, 객체는 변수 + 메소드를 가진 녀석을 지칭함

		// 메소드만 있는 객체도 있을 수 있음. (사실 많음)

		
		
		
		
	}

}
