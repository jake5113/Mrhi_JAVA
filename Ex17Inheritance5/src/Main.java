
public class Main {

	public static void main(String[] args) {
		
		// 어떤 대학교의 정보제공 앱 제작 - 회원가입 기능
		// 회원 종류 : 일반, 학생, 교수, 근로학생
		
		// 1. 일반    : 이름, 나이 
		// 2. 학생    : 이름, 나이, 전공
		// 3. 교수    : 이름, 나이, 연구과제
		// 4. 근로학생 : 이름, 나이, 전공, 업무 

		//일반회원
		Person p = new Person("Jenny", 25);
		p.show();
		System.out.println();

		//학생회원
		Student stu = new Student("Paul", 23, "Android");
		stu.show();
		System.out.println();
		
		//교수회원
		Professor pro = new Professor("Park", 45, "mobile optimization");
		pro.show();
		System.out.println();

		//근로학생 회원
		AlbaStudent alba = new AlbaStudent("Hong", 27, "ios", "pc management"); 
		alba.show();
		System.out.println();
		
	}

}
