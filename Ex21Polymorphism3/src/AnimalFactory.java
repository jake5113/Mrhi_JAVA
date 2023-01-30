
public class AnimalFactory {

	// 애니멀(Dog, cat, Pig) 객체를 생성하여 리턴해주는 기능메소드

	Animal makeAnimal(int n) {

		Animal ani = null;

		switch (n) {
		case 1:
			ani = new Dog(); // up casting
			break;

		case 2:
			ani = new Cat();
			break;

		case 3:
			ani = new Pig();
			break;
		}

		return ani;

	}

}
