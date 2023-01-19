import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Java에서는 문자열(string)을 객체로 관리함.
		// 즉, Java에서 문자열은 객체!
		// Java의 String 객체는 글씨변경이 불가능함. [immutable 성질]

		String str = new String("Hello");
		// 단, String은 워낙 많이 사용되기에 축약표현을 제공함

		// 객체는 기능(function(함수) -> method(메소드))들을 보유하고 있음.
		// String class의 유용한 메소드들

		// 1. 문자열 데이터의 길이(글자수)를 리턴해주는 기능(method)
		int len = str.length();
		System.out.println("1.글자수 : " + len);

		// 2. 문자열값의 비교 기능
		System.out.println("2번 문자열값의 비교 기능");
		System.out.println(str == "Hello");
		System.out.println(str.equals(new String("Hello")));
		System.out.println(str.equals("Hello"));

		String str_ = "Nice"; // 자동 new String()
		System.out.println(str_ == "Nice");
		System.out.println("=============");

		String s1 = "Hello";
		System.out.println(s1.equals(str));
		System.out.println("Nice".equals(str));// 문자열은 객체!

		// 2-1. 대소문자 비교
		System.out.println(s1.equals("hello"));
		System.out.println(s1.equalsIgnoreCase("hello"));

		// 3. 문자열 안에서 특정 char 얻어오기
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length() - 1));
		System.out.println("=============");

		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("=============");

		// Scanner 객체를 이용하여 char 한문자 입력받아보기
		Scanner scan = new Scanner(System.in);
//		String s2 = scan.next();
//		char c = s2.charAt(0);
//		System.out.println("c: " + c);

		// 4. 문자열안에 특정 문자열이 포함되어 있는지 여부
		String sentence = "Hello world! Hello android! nice world";
		System.out.println(sentence.contains(s1));

		// 5. 문자열안에 특정 문자가 몇번째 위치에 있는지..
		System.out.println(sentence.indexOf('e'));
		System.out.println(sentence.lastIndexOf('e'));// 뒤에서부터 검사

		// 5-1. 특정 문자열의 시작위치도 검색가능
		System.out.println(sentence.indexOf("android"));// 뒤에서부터 검사

		// 5-2. 특정 위치부터 검색 요청도 가능
		System.out.println(sentence.indexOf("Hello", 6));// 6번 인덱스 위치부터 검색 시작
		System.out.println("=============");

		// 6. 문자열 결합 기능
		System.out.println(sentence.concat(" nice android!")); // 원본 변경X, 새로운 문자열을 리턴
		System.out.println(sentence);
		// .concat()은 잘 사용안함. why? + 결합연산자의 제공 때문.
		System.out.println(sentence + " nice ios!"); // 마찬가지로 원본 변경X
		System.out.println(sentence);
		System.out.println("=============");

		// 7. 문자열이 특정한 문자열로 시작되는지 여부
		System.out.println(sentence.startsWith("Hello"));
		System.out.println(sentence.startsWith("world"));

		// 7-1. 특정 문자열로 종료되는지 여부
		System.out.println(sentence.endsWith("Hello"));
		System.out.println(sentence.endsWith("world"));

		// 8. 대소문자 변환
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence);

		// 9. 문자열에 앞뒤 공백을 제거 (가운데X)
		String s = "   Hel lo       ";
		System.out.println("[" + s + "]");
		s = s.trim();
		System.out.println("[" + s + "]");

		// 10. 특정문자 바꿔치기
		s = "Hello world! Hello Android! Nice world!";
		System.out.println(s.replace("Hello", "Bye"));
		System.out.println(s);

		// 중간 공백문자도 없앨 수 있음
		System.out.println(s.replace(" ", ""));

		// 11. 문자열 잘라내오기
		System.out.println(s.substring(6));// 6번 방 뒤로 있는 문자열을 잘라내서 새로운! 문자열로 리턴해줌
		System.out.println(s.substring(6, 12));// 6~11번까지.
		System.out.println("=============");

		// 12. 문자열값의 대소비교 [문자열 정렬할때 사용됨]
		int x = 10;
		int y = 15;
		System.out.println(x > y);

		char ch1 = 'a';
		char ch2 = 'b';
		System.out.println(ch1 < ch2);

		String s7 = "aaa";
		String s8 = "aad";
		// System.out.println(s7 < s8); //error : 주소를 대소비교
		System.out.println(s7.compareTo(s8));

		// 13. 문자열을 특정문자를 기준으로 분리해서 여러개의 문자열 배열로 리턴해줌.
		s = "android, ios, web";
		String[] arr = s.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].trim());
		}
		System.out.println("=============");

		// String class의 static method 들...
		// static method : 객체생성 없이 바로 사용할 수 있는 기능메소드 [ 클래스명.메소드명() ]

		// 1) .format() : 특정 포멧(모양/형식)의 문자열을 생성하고 싶을때 사용하는 기능
		int hour, min, sec;
		hour = 13;
		min = 15;
		sec = 24;
		System.out.println(hour + ":" + min + ":" + sec);
		min = 3;
		System.out.println(hour + ":" + min + ":" + sec);
		System.out.printf("%02d:%02d:%02d\n", hour, min, sec);// 출력형태를 무조건 CLI환경의 console에만 출력함.

		// 실무에서는 GUI로 표시하며 이 표시는 반드시 문자열 데이터만 출력할 수 있음
		String ss = String.format("%02d:%02d:%02d", hour, min, sec);
		System.out.println("현재시간:" + ss);

		// 2) 기본형 자료형(primitive)을 String 객체로 변환하는 기능메소드
		int num = 100;
		String sNum = String.valueOf(num);// 100 -> "100"
		System.out.println(sNum.length());
		System.out.println(String.valueOf(3.14).length());
		System.out.println(String.valueOf(true).length());

		// GUI환경에서 기본형을 문자열로 변환하는 코드는 아주 빈번함.
		// 하지만 자주 사용되지 않음. why? '+' 결합연산자를 이용하면 더 간결하기 때문
		String s13 = 1000 + "";
		String s14 = 3.14 + "";
		String s15 = "" + false;
		System.out.println(s13.trim().length());
		System.out.println(s14.trim().length());
		System.out.println(s15.trim().length());

		// 반대로, 문자열을 기본형으로 변환하고 싶다면???
		// 이 기능은 String 클래스에 없음.
		// 이 기능을 가진 클래스들이 있음. 이 클래스들의 static 메소드를 사용
		// 이런 클래스들을 Wrapper 클래스(8개)라고 부름 :
		// Boolean, Byte, Character, Short, Integer, Long, Float, Double
		Integer aa = new Integer(10); // 참조형
		Integer aa_ = 10;

		int n = Integer.parseInt("100");// String ->int
		System.out.println(n + 3);

		double n2 = Double.parseDouble("3.141592");
		System.out.println(n2);

		boolean n3 = Boolean.parseBoolean("TRUE");
		System.out.println(n3);

	}
}
