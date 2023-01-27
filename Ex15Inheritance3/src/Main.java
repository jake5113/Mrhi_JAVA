
public class Main {

	public static void main(String[] args) {

		Robot r = new Robot();
		r.move();
		r.attack();
		System.out.println();

		
		FlyRobot fr = new FlyRobot();
		fr.move();
		fr.attack();
		fr.fly();
		System.out.println();
		
		SwimmingRobot sr = new SwimmingRobot();
		sr.move();
		sr.attack();
		sr.swimming();
		
		// 상속받은 기능을 수정하는 Override 중에서
		// 기존 기능을 완전히 바꾸는 것만 실습함.
		
		// 기존 기능을 유지하면서 조금만 새로운 기능을 추가하는 형태.
		// 다음 프로젝트
		
	}

}
