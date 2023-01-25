
// bbb 패키지안에 있는 Student클래스를 편하게 사용하도록 미리 불러오기
import java.util.*; //java.util 안에 있는 모든 클래스 
import bbb.Student;

public class Main {
	public static void main(String[] args) {

		// 기본적인 class를 설계하고 객체를 생성하여 사용하는 모습
		Test t = new Test();
		t.a = 10; // 멤버변수 사용
		t.show(); // 멤버함수 호출

		// 같은 이름의 class를 사용하게 되는 문제가 발생할 수도 있음.
		// 이때 사용하는 것이 package 라는 개념임.
		// 물리적인 폴더구분을 통해 같은 이름의 class를 구별

		// 사용자정의 클래스로 Student 객체를 생성해보기
		// 즉, 학생의 정보[이름, 나이, 주소]를 가진 클래스
		aaa.Student stu = new aaa.Student();
		stu.name = "sam";
		// stu.age = 20; //error (public 필요!)

		// 또 다른 학생에 대한 정보가 필요할 수 있음.
		// [이름, 국어, 영어] 데이터를 가진 클래스
		// 이 때도 Student 라는 이름이 적합해 보임.
		bbb.Student stu2 = new bbb.Student();
		stu2.name = "robin";
		stu2.kor = 80;
		stu2.eng = 90;

		// bbb패키지의 Student클래스 객체가 또 필요하다면?
		// 패키지명을 매번 작성하는 것이 귀찮음
		// 그래서 이 .java문서 안에서는 bbb. 패키지를 마음대로 인식할 수 있도록
		// 미리 클래스를 가져오기 - import
		Student stu3 = new Student();
		Student stu4 = new Student();

		// 2000여개의 Java System API 클래스들은 모두 패키지가 있음.
		java.util.Random rnd = new java.util.Random();
		// 즉, Random 클래스 앞에 쓰는 java.util. 이 패키지명 이었던 것임.
		// java.util 패키지명 쓰는 것이 번거로워서 import 했던것임.
		Random rnd2 = new Random();

		java.util.Scanner scan = new java.util.Scanner(System.in);

		// 패키지 중에서 특별한 패키지 하나가 존재함.
		// String, System .. 이런 클래스들이 있는 java.lang 패키지
		// 원래는 패키지명을 같이 써야 하기에 아래처럼 써야 하지만
		java.lang.String s = new java.lang.String("Hello");
		// java.lang은 워낙 기본적인 클래스들만 있어서 자바언어에서 자동 import 함
		String s2 = new String("Nice"); // 자동 import

		aaa.Person p = new aaa.Person();

		// Java System API 클래스들의 패키지명이 모두
		// xxx.xxx 라는 식으로 두 단어 이상으로 구성됨
		// 패키지명을 가급적 유의미한 단어(마치 카테고리 같은)를 사용하고
		// 두 단어 이상으로 사용하기를 권장함.
		// 보통은 클래스를 만든 회사명의 도메인을 역으로 작성함
		// 예) 지도 클래스 Map 클래스
		// 이를 만드는 회사가 3개 Google Naver Kakao
		// com.google.Map
		// com.naver.Map
		// com.kakao.Map

		// kr.or.mrhi.android.Map
		// 이 때 패키지명은 반드시 소문자로만 작성할 것을 강제로 권장함.
		// 여러 단어를 구분할 때 사용하는 . 은 하위폴더를 의미함
		mrhi.dev.First f = new mrhi.dev.First();
		
		mrhi.dev.android.Second ss = new mrhi.dev.android.Second(); 
		
		

	}
}
