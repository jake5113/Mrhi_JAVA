
public class Dog extends Animal {

	@Override
	void say() {
		System.out.println("멍멍");
	}

	// 고유기능
	void guardHouse() {
		System.out.println("겁나 잘지켜!!");
	}

}
