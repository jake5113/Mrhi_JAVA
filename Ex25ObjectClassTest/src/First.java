
public class First {

	int num = 100;

	// Object 클래스의 메소드 오버라이드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "내 마음대로 소개글 변경 : " + num;
	}

	// 멤버값끼리 비교하도록 기능을 개선한 기능메소드
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		First t = (First) obj;
		return num == t.num;
	}
}
