import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 팀장이 인터페이스를 설계하고 추상메소드의 이름을 정하면
		// 팀원들은 그 이름을 토대로 기능을 구현하여 클래스를 설계함.
		// 팀장 : Unit 인터페이스 설계
		// 팀원1 : Marine 클래스 정의 및 Unit 구현..Unit 이라면 가져야할 기본 기능 구현(메소드의 이름 통일)
		// 팀원2 : Tank 클래스 정의 및 Unit 구현
		// 팀원3 : Race 클래스 정의 및 Unit 구현

		// Marine, Tank, Race 객체는 attack(), move() 기능이 있음을 확신함

		// 팀장은 만들어진 클래스를 이용하여 객체 생성 및 게임 알고리즘 구현

		// 캐릭터별 참조변수 사용할 수도 있지만
		// 부모참조변수로 자식객체들을 모두 참조할 수 있으니
		// 차라리 Unit 참조변수 타입으로 모든 객체들을 제어하는 것이 보다 효과적임
		// --배열로 묶을 수 있음.
		// Unit[] us = new Unit[200];

		// 단, 실제 게임에서는 캐릭터들이 생성과 제거가 빈번하게 일어남
		// 배열을 한 번 만들면 개수를 변경할 수 없음. 요소를 제거할 수도 없다.
		// 그래서 실제 이렇게 대량의 객체를 다룰 때는 유동적 배열을 더 선호함.
		// 마치, 기차처럼 객체를 끌고다니는 클래스 : ArrayList
		ArrayList<Unit> units = new ArrayList<Unit>();

		// 요소의 개수 확인해보기
		int num = units.size();
		System.out.println("유닛개수 : " + num);

		// 유닛종류 객체들 생성하여 추가해주기
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Tank());
		units.add(new Race());
		units.add(new Tank());
		units.add(new Tank());
		units.add(new Tank());
		units.add(new Marine());

		System.out.println("유닛개수 : " + units.size());
		System.out.println();

		// 유닛의 기능들을 사용해보기
//		for (int i = 0; i < units.size(); i++) {
//			Unit unit = units.get(i);
//			unit.move();
//			unit.attack();
//			} 아래의 foreach 문으로 더 깔끔하고 안전하게!!

		for (Unit unit : units) {
			unit.move();
			unit.attack();

			// 레벨업이 가능한 캐릭터들은 레벨업하기
			// unit 참조변수가 참조하는 객체가 Marine, Tank 인지 확인
			if (unit instanceof LevelUpAble) {
				((LevelUpAble) unit).levelUp();
			}

			// 고유스킬을 사용하기
			if (unit instanceof Marine) {
				Marine m = (Marine) unit;
				m.steamPack();
			} else if (unit instanceof Tank) {
				((Tank) unit).seizeMode();
			} else if (unit instanceof Race) {
				((Race) unit).ghostMode();
			}
			System.out.println();
		}
		System.out.println();
	}

}
