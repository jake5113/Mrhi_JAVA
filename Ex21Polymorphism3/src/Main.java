import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// 동물캐릭터 3종류[Dog, Cat, Pig]를 만들어내는 기능을 가진
		// 애니멀공장 객체 생성
		AnimalFactory af = new AnimalFactory();
		Dog d = (Dog) af.makeAnimal(1);
		d.say(); // 오버라이드 된 기능
		d.guardHouse(); // 고유 기능

		Cat c = (Cat) af.makeAnimal(2);
		c.say();
		c.handleButler();

		Pig p = (Pig) af.makeAnimal(3);
		p.say();
		p.eatAndEat();

		System.out.println();
		// Animal 참조변수 1개로 여러객체 제어하기 가능.. 나중에 배열로 적용
		Animal ani = null;

		ani = af.makeAnimal(1);
		ani.say();
		// 자식객체의 고유기능을 사용불가
		// ani.guardHouse(); //error
		// 자식객체의 고유기능을 사용하려면 down casting 해야만 함
		Dog dog = (Dog) ani;
		dog.guardHouse();

		ani = af.makeAnimal(2);
		ani.say();
		((Cat) ani).handleButler();

		ani = af.makeAnimal(3);
		ani.say();
		((Pig) ani).eatAndEat();

		System.out.println();
		// 마지막 응용

		// 동물캐릭터 5마리를 랜덤하게 만들어서 공통기능과 고유기능을 사용해보기

		// 랜덤값을 만들어내는 능력을 가진 객체 생성
		Random rnd = new Random();

		// 둥물참조변수 5개를 가진 배열만들기
		Animal[] anis = new Animal[5];
		for (int i = 0; i < anis.length; i++) {

			anis[i] = af.makeAnimal(rnd.nextInt(3) + 1);

		}

		// 각 객체들의 기능 호출
		for (int i = 0; i < anis.length; i++) {
			// 동물들의 공통기능
			anis[i].say(); // 오버라이드된 메소드 발동

			// 동물들의 고유기능
			// anis[i] 참조변수가 어떤 클래스의 객체인지부터 알아야
			// 다운캐스팅을 하고 고유기능을 사용할 수 있음.
			// 참조변수가 어떤 클래스의 객체를 참조하고 있는지를 알려주는 연산자 : instanceof
			if (anis[i] instanceof Dog) {
				Dog ddd = (Dog) anis[i];
				ddd.guardHouse();

			} else if (anis[i] instanceof Cat) {
				((Cat) anis[i]).handleButler();

			} else if (anis[i] instanceof Pig) {
				((Pig) anis[i]).eatAndEat();

			}

		}

		// Animal 클래스는 객체생성용이 아니라 오로지 상속을 위해서만 존재하는
		// 추상적인 개념의 클래스. 즉, 객체를 만들면 안되는 클래스.
		// 하지만, 그냥 class로 만들어버리면 실수로 객체를 생성시키는 오류를 범할 수 있음.
		// 그래서 이렇게 객체를 생성하지 않도록 설계한 클래스를 실수로 new 하지 못하도록
		// 문법적으로 막는 문법이 등장함. : 추상클래스 abstract class
		
		//Animal animal = new Animal(); //error
		//animal.say();
		
		// 추상클래스에 대한 문법적 학습을 위해 다음프로젝트
		
		
		
		

	}

}
