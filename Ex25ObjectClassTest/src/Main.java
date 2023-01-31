import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object class : 모든 java 클래스의 부모클래스(최상위 클래스)
		// java언어에 존재하는 모든 클래스들은 extends의 명시여부와 상관없이
		// 무조건 Object 클래스를 상속받은 상태로 만들어짐.
		// 명시적으로 다른 클래스를 상속받았더라도 Object클래스는 상속됨.[다중상속이 아니라 계층상속임]

		Test t = new Test();
		// Test클래스는 명시적으로 아무것도 상속하지 않았지만
		// 기본적으로 Object 클래스를 상속받은 상태.

		// Object 클래스의 주요 기능 메소드들
		// 1. toString()
		// 2. equals(Object obj)
		// 3. hashCode()
		// 4. get()
		// 5. wait(), notify(), notifyAll() : 이건 Thread 수업에서 소개.

		// 1) toString(): 객체에 대한 소개 문자열 리턴
		String s = t.toString();
		System.out.println(s); // [default : "클래스명@해시코드"]
		// 해시코드 : 매모리 물리주소를 상대적인 주소로 표현한 숫자(자바에서의 주소)

		Test t2 = new Test();
		String s2 = t2.toString();
		System.out.println(s2); // t와 해시코드가 다르기에 다른 객체임

		Test t3 = t2;
		String s3 = t3.toString();
		System.out.println(s3); // t2와 같은 객체를 공유하기에 같은 해시코드

		// 당연히 Java System API 2000여개들도 toString()을 보유하고 있음.
		Random rnd = new Random();
		String s4 = rnd.toString();
		System.out.println(s4); // [default : "패키지명.클래스명@해시코드"]

		// .toString() 의 특이한 결과.
		String name = new String("sam");
		String s5 = name.toString();
		System.out.println(s5); // 객체 소개글이 아니라 문자열 데이터가 출력됨.
		// 원래의 toString() 기능으로 동작하지 않았다는 것은
		// 메소드를 오버라이드하여 기능을 개선했다는 것임.

		// 즉, Object클래스의 메소드도 역시 기능개선 오버라이드가 가능함
		First f = new First();
		// First 객체의 멤버값을 출력해보기 위해
		// toString()의 기능을 개선
		System.out.println(f.toString());
		System.out.println();

		// 2) equals(Object obj)
		Test t4 = new Test();
		Test t5 = new Test();
		boolean bb = t4.equals(t5);
		System.out.println(bb);

		Test t6 = t5;
		System.out.println(t6.equals(t5));

		// 사실 같은 객체인지를 판별할때 equals()메소드를 잘 사용하지 않음.
		// why?
		// 참조변수의 주소값끼리 비교연산이 가능하기에.
		System.out.println(t6 == t5);
		System.out.println(t6 == t4);
		System.out.println();
		// equals()도 상속받은 메소드니까 오버라이드 가능
		// 멤버값이 서로 같은지를 비교하여 결과를 리턴해주는 기능으로 개선해보기
		First f1 = new First();
		First f2 = new First();

		f1.num = 100;
		f2.num = 100;
		System.out.println(f1.equals(f2));

		f1.num = 100;
		f2.num = 200;
		System.out.println(f1.equals(f2));
		System.out.println();

		// 이렇게 오버라이드 된 대표적인 클래스가 바로 .String
		String s6 = new String("Hello");
		String s7 = new String("Hello");
		System.out.println(s6 == s7); // 주소비교 : false
		System.out.println(s6.equals(s7)); // 값비교 : true

		System.out.println();

		// 3) getClass(): 클래스의 정보를 가진 Class객체 리턴해줌.
		Test t7 = new Test();
		Class obj = t7.getClass();
		System.out.println(obj.getName()); // 클래스명
		System.out.println(obj.getPackageName() + " . "); // 패키지명
		System.out.println(obj.getSuperclass()); // 부모클래스

		// 4) hashCode() : 자바에서 주소값 [ 객체마다 고유한 번호 부여 ]
		Test t8 = new Test();
		int hashcode = t8.hashCode();
		System.out.println(hashcode);
		System.out.println(t8.toString());
		System.out.println(Integer.toHexString(hashcode));

		System.out.println();

		// Object class를 사용하는 대표적인 상황
		// 업캐스팅 : 부모참조변수로 자식객체를 참조하는 것
		Object obj2 = null;
		// Object 는 모든 클래스의 최상위 부모 클래스이므로
		// 어떤 클래스의 객체든 모두 참조하는 것이 가능함
		obj2 = new Test();
		obj2 = new First();
		obj2 = new String();
		obj2 = new int[5];
		obj2 = new ArrayList<String>();
		
		//일종의 만능 참조변수 같은 느낌.
		
		// 업캐스팅은 메소드의 파라미터나 리턴에도 사용가능함.
		// 어떤 객체든 파라미터로 받고 싶을 때 Object를 사용하기도 함
		// 대표적인 사용 예) System.out.println()
		System.out.println(new Random()); // 자동 전달된 객체의 toString()이 발동함
		System.out.println(new Test());
		System.out.println(new String("aa"));
		
		Person p = new Person();		
		Person p2 = new Person("sam",25,"Seoul");
		
		// 멤버변수들 하나하나를 별도로 설정하는 기능도 필수로 요청됨
		System.out.println(p.getName());
		
		
		

	}

}
