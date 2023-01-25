
// 클래스는 설계도. 클래스가 있다고 그냥 사용 불가.
public class Student {

	// 연관있는 데이터들을 저장할 변수들 정의
	// Field(필드:멤버변수 - 속성)
	String name;
	int kor;
	int eng;
	double aver;

	// 기능을 설계할 수도 있음
	// 멤버변수(필드)들의 값을 출력하는 기능(함수) : Method

	void show() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + aver);
		System.out.println();

	}

	// 평균을 계산하는 기능(함수) : Method
	void calAverage() {
		aver = (double) (kor + eng) / 2;
	}

	// 멤버변수안에 값을 입력하는 기능 메소드

	void setMembers(String name, int kor, int eng) {
		// 멤버변수와 매개변수는 서로 다른 변수이다.
		// 매개변수로 받은 데이터들을 멤버변수에 전달해 줘야 함.
		// 멤버변수를 지칭하는 특별한 키워드 : this
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calAverage();
		show();
	}

}
