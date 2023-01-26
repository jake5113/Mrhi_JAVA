
public class Person {

	// 멤버변수는 private 접근제한을 권장
	private String name; // 기본값 부여 : null
	private int age; // 기본값 부여 : 0

	// 멤버함수는 public 접근제한을 권장

	// 멤버변수에 값을 대입해주는 기능 메소드
	public void setMembers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 멤버변수값을 출력하는 기능 메소드
	public void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println();
	}

	// 생성자 메소드
	// 가급적 public 접근제한을 권장
	public Person() {
		System.out.println("Person 객체 생성!");
		// 멤버변수에 전달할 값이 없을때의 초기값을 설정
		name = "익명";
		age = 0;
	}

	// 생성자 오버로딩
	public Person(String name, int age) {
		// 생성자의 목적은 멤버값의 초기화를 위해서 존재함.
		// 그러니 전달받은 겂들을 멤버변수에 대입해줘야 함.
		this.name = name;
		this.age = age;
		System.out.println("Person 객체 생성!! String, int");
	}
	
	// 오버로딩은 개수 제한이 없기에 몇개라도 추가로 만들 수 있음.
	public Person(String name) {
		this.name = name;
		age = 0;
		System.out.println("Person 객체 생성!!! String");
	}
	
	public Person(int age) {
		name = "익명";
		this.age = age;
		System.out.println("Person 객체 생성!!!! int");
	}
	
	
	

}