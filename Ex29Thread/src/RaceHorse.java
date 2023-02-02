
public class RaceHorse {

	public static void main(String[] args) {

		Horse h1 = new Horse("천리안");
		Horse h2 = new Horse("적토마");
		Horse h3 = new Horse("캐논");

		System.out.println("경주 시작!!");

		h1.setPriority(10); // 가장 우선순위가 높음
		h2.setPriority(5);
		h3.setPriority(10);

		h1.start();
		h2.start();
		h3.start();
	}

}

class Horse extends Thread {

	String name;

	public Horse(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println(name + ":" + "다그닥!! 다그닥!!");

			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "도착");

	}
}