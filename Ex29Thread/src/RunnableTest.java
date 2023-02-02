
public class RunnableTest {

	public static void main(String[] args) {

		// Thread 능력을 가지는 2가지 방법
		// 1. Thread 클래스를 상속한(extends) 클래스를 설계하여 사용하는 방법
		// 2. Runnable 인터페이스를 구현한(implements) 클래스를 설계하여 사용하는 방법

		// 왜 2가지 방법이 존재할까?
		// **다중 상속의 효과를 보고 싶어서..
		// **Person 클래스의 능력을 가지면서, Thread의 능력도 있었으면 할 때
		// 자바는 다중상속이 금지되어 있음. 대신 인터페이스의 구현을 다중구현이 가능하기에
		// 여러능력을 동시에 가질 수 있음.

		PersonThread pt = new PersonThread();

		// 스레드를 실행하려면 run()을 자동실행시켜주는 기능이 작성된 .start()메소드를 호출해야함
		// pt.start(); // error - Runnable 인터페이스에는 없는 기능메소드

		// Runnable 인터페이스를 구현한 객체의 run()을 실행시켜주는 별도의 Thread 객체가 필요함
		// Thread 객체를 생성하면서 생성자 메소드의 파라미터로 Runnable을 구현한 객체를 전달하면
		// Thread 객체를 start()할 때 자동 run 됨

		Thread t = new Thread(pt);
		t.start();

		System.out.println("aaa");

		// 다중상속이 아닌 그냥 스레드 객체가 필요할때도 Runnable로 만들기도 함
		// Runnable r = new Runnable();// 인터페이스는 직접 new 생성 불가능
		// 인터페이스는 반드시 추상메소드(run)을 구현한 별도의 클래스를 설계한 후
		// 객체로 생성해야 함.
		// 실제로 코딩해보면 이 별도의 클래스의 이름을 명명하는 것도 은근 스트레스..
		// 이름에 따라서는 이게 Thread인지 잘 인식하지 못하는 이름으로 사용했을수도 있음.
		MyThread mt = new MyThread();
		Clicker c = new Clicker();

		Runnable obj = new MyThread(); // OK - upcasting
		obj = new Clicker();
		obj = new PersonThread();

		// Thread가 작업할 코드는 별도의 class 영역에 작성되어 있어서 start()할 때
		// 어떤 동작을 수행할지 한눈에 보이지 않음.
		// 그래서.. Thread의 작업코드를 작성하는 run()메소드를 스레드객체를 생성하면서
		// 그 자리에서 곧바로 작성하는 문법!
		// 객체를 만들면서 클래스를 설계하는 문법 - 익명 클래스
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("별도 스레드가 작업할 내용...");
			}

		};
		
		new Thread(r).start();
		

	} // main method..

} // Main class..

class Clicker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class Person {
	String name;
	int age;
}

// Person 클래스의 멤버를 상속받으면서 Thread의 역할도 하는 클래스를 설계
class PersonThread extends Person implements Runnable {

	@Override
	public void run() {

		// 1초마다 이름과 나이를 출력하는 기능코드
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " : " + age);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}