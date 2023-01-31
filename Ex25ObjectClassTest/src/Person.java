
public class Person {

	private String name;
	private int age;
	private String address;

	// 멤버변수 하나하나의 값을 별도로 설정하는 기능메소드들 필요
	// setter method 라고 부름 - 가급적 만들어 놓을 것을 권장!
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 멤버변수 하나하나의 값을 리턴해주는 기능 메소드들
	// getter method
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	// 생성자 : 객체가 생성될때 자동으로 발동하는 특별한 메소드
	public Person() {
		System.out.println("Person 객체 생성자");
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println("Person 객체 생성자 2");
	}

}
