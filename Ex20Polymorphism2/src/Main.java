import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// 예) 앱에 동물캐릭터 3종류(Dog, Cat, Pig)

		Dog d = new Dog();
		Cat c = new Cat();
		Pig p = new Pig();

		d.say();
		c.say();
		p.say();
		System.out.println();

		// 만약 이런 동물캐릭터가 여러마리면?
		// Dog 5마리, Cat 10마리, Pig 4마리
		// 하나씩 참조변수를 만드는 것은 미친것 같음
		// 그래서 배운 배열!!
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog();
		dogs[1] = new Dog();
		dogs[2] = new Dog();

		dogs[0].say();
		dogs[1].say();
		dogs[2].say();
		System.out.println();

		// 이런식으로 배열로 만들면 캐릭터 종류별로만 묶을 수 있어서
		// 제어할 때 은근 짜증남.

		// 그래서 동물캐릭터객체 모두를 제어할 수 있는
		// 참조변수만 있다면, 이를 하나의 배열로 묶을 수 있다.

		// Dog, Cat, Pig 의 부모클래스가 있다면,
		// 그 부모클래스 참조변수로 여러 종류의 자식객체들 모두를
		// 참조할 수 있으니 하나의 배열로 묶을 수 있겠다.

		// Dog, Cat, Pig 의 부모클래스로 Animal 이라는 클래스 설계
		Animal ani = new Dog(); // 부모참조변수로 자식객체 참조가능 [업캐스팅]
		ani.say(); // override 된 say가 발동

		Animal ani2 = new Cat();
		ani2.say();

		Animal ani3 = new Pig();
		ani2.say();

		// Animal 참조변수로 Dog, Cat, Pig 모두를 참조할 수 있으니
		// Animal 참조변수를 여러개 가지는 배열을 만들면,
		// 여러 종류의 객체들을 모두 참조할 수 있다!!
		Animal[] anis = new Animal[5]; // Animal 참조변수 5개 짜리 배열 객체
		System.out.println(anis[0]);

		System.out.println();

		anis[0] = new Dog(); // up casting
		anis[1] = new Cat(); // up casting
		anis[2] = new Pig(); // up casting
		anis[3] = new Dog(); // up casting
		anis[4] = new Cat(); // up casting

		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();

		System.out.println();

		// 반복문 이용가능
		for (int i = 0; i < anis.length; i++) {
			anis[i].say();
		}
		System.out.println();

		for (Animal animal : anis) {
			animal.say();
		}
		
		// 다형성은 이렇게 배열로 묶기위해서만 사용되는 것은 아님.
		// 메소드의 파라미터(매개변수)나 리턴타입에서도 매우 유용하게 사용됨.
		// 안드로이드 앱개발에서도 매우 많이 사용되는 기술임.
		// 다음 프로젝트에서
		
	}

}
