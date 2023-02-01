import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {

		// Collection 클래스들 : 자료구조를 구현한 Java의 API 클래스들 - 대량의 데이터를 관리 [p.458]
		// Collection 인터페이스의 3가지 종류 : List, Set, Map
		// 1) List : 순서대로 저장, 인덱스 번호 O, 중복 데이터 O
		// 2) Set : 순서 X, 인덱스 X, 중복 X
		// 3) Map : 순서 X, 인덱스 번호 대신 Key 식별자 사용, key 중복 X, value는 중복 O

		// 3종류 모두 인테페이스이기에 그냥 사용하는 것이 아니라 이를 구현한 하위 클래스들을 사용

		// List 인터페이스를 구현한 하위클래스 3개 : ArrayList, LinkedList, Vector
		// 3개 모두 사용문법은 거의 같음. 단지 성능이 다를뿐.

		// List list = new List(); //error : List인터페이스는 직접객체생성 불가

		// List인터페이스를 구현한 하위클래스를 객체로 생성하여 사용
		ArrayList<String> list = new ArrayList<String>();

		// ArrayList 클래스가 데이터를 제어하기 위해 만들어놓은 기능(메소드)들 확인

		// 1. 요소의 개수
		int size = list.size();
		System.out.println("요소 개수 : " + size);

		// 2. 요소의 추가
		String s = new String("aaa");
		list.add(s);
		list.add(new String("bbb"));
		list.add("ccc"); // 자동 new String("ccc")
		System.out.println("요소 개수 : " + list.size());

		// 3. 요소 얻어오기
		String ss = list.get(0);
		System.out.println(ss);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		// System.out.println(list.get(3)); // exception

		// 4. 요소 삭제하기
		list.remove(1);
		System.out.println("요소 개수 : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// 5. 특정한 위치에 요소 추가하기
		list.add(1, "ddd");
		System.out.println("요소 개수 : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 6. 제거할 때 인덱스 번호가 아니라 객체의 주소값(참조변수)으로 제거 가능
		String sss = new String("TEST");
		list.add(sss);
		System.out.println("요소 개수 : " + list.size()); // 4
		list.remove(sss);
		System.out.println("요소 개수 : " + list.size()); // 3

		// 7. 요소 모두를 한번에 깨끗이 제거하기
		list.clear();
		System.out.println("요소 개수 : " + list.size()); // 0

		// 8. 리스트가 비어있는지 확인하는 메소드
		System.out.println(list.isEmpty()); // true

		// 9. 중복된 데이터가 허용됨
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		System.out.println("요소 개수 : " + list.size()); // 3

		// 10. 리스트안에 특정 요소가 있는지 여부[true/false]
		System.out.println(list.contains("aaa")); // true
		System.out.println(list.contains("Hello")); // false

		// 11. 다른 리스트의 요소들을 한번에 추가하기
		list.clear();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// 새로운 리스트
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("sam");
		list2.add("robin");

		list.addAll(list2);
		System.out.println("요소 개수 : " + list.size()); // 5

		// 요소값을 확인하기 위해 반복문을 사용하여 .get()을 여러번
		// 다만, 단순하게 요소값을 보고 싶다면 List의 toString()기능 활용
		System.out.println(list.toString());

		// 12. 다른 리스트의 요소들과 같은 요소들을 모두 제거하기
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("bbb");
		list3.add("sam");

		list.removeAll(list3);
		System.out.println(list.toString());

		// 13. 다른 리스트의 요소들과 같은 요소들만 남기고 나머지 모두 제거하기
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("aaa");
		list4.add("robin");

		list.retainAll(list4);
		System.out.println(list.toString());

		// 14. 특정요소들이 모두 포함되어 있는지 여부
		ArrayList<String> list5 = new ArrayList<>();
		list5.add("aaa");
		list5.add("robin");

		System.out.println(list.containsAll(list5)); // true

		list5.add("kkk");
		System.out.println(list.containsAll(list5)); // false

		// 15. 특정요소가 몇번째에 있는지 인덱스번호를 리턴해주는 기능
		list.add("aaa");
		list.add("sss");
		System.out.println(list.toString());
		System.out.println(list.indexOf("robin")); // 1
		System.out.println(list.indexOf("sam")); // -1 (없음)
		System.out.println(list.indexOf("aaa")); // 0 앞에서부터
		System.out.println(list.lastIndexOf("aaa")); // 2 뒤에서부터

		System.out.println();

		// 요소들을 순차적으로 얻어오기
		// 방법1. for문 사용하기
		for (int i = 0; i < list.size(); i++) {
			String t = list.get(i);
			System.out.println(t);
		}
		System.out.println();

		// 방법2. 확장된 for문 사용하기 (foreach)
		for (String t : list) {
			System.out.println(t);
		}
		System.out.println();

		// 경우에 따라서는 List를 배열로 변환해야 하는 경우가 있음.
		// 리스트를 배열로 변환
		String[] aaa = new String[list.size()]; // 리스트 개수와 같은 크기의, 요소값이 없는 빈 배열
		list.toArray(aaa);// 리스트의 요소값들을 빈 배열의 요소들에 복사해줌
		System.out.println(list);
		System.out.println(aaa.toString()); // 요소값 나오지 않음
		// 배열객체의 요소값들을 그냥 문자열로 내보내는 static 기능메소드 활용
		System.out.println(Arrays.toString(aaa)); // Arrays 클래스의 toString메소드 활용

		// 배열을 리스트로 변환
		String[] bbb = new String[] { "sam", "robin", "hong" };
		//ArrayList<String> list6 = (ArrayList<String>) Arrays.asList(bbb);
		List<String> list6 = Arrays.asList(bbb);
		System.out.println(list6.toString());

		System.out.println();
		System.out.println("===============================");
		System.out.println();

		// List 인터페이스를 구현한 또 다른 하위클래스
		// 사용방법은 ArrayList와 똑같음 - 단지 성능 차이가 있음.
		// 빈번하게 요소를 추가/삭제를 할 때 속도가 빠름. 반대로 특정 요소값을 얻어올때는 느림
		LinkedList<String> linkList = new LinkedList<>();

		linkList.add(new String("aaa"));
		linkList.add("bbb");
		linkList.add("ccc");

		linkList.remove(1);

		System.out.println(linkList);

		// LinkedList에만 있는 메소드도 존재함
		linkList.addFirst("sam");
		linkList.addLast("robin");
		System.out.println(linkList.toString());

		// 지금은 ArrayList의 성능이 많이 향상되어서 굳이 고민하지 않고 그냥 이것만 사용하기도 함.

		// Vector 클래스 - ArrayList와 완전 같음. [동기화 처리가 되어 있다는 차이만 있음 - Thread를 배워야 동기화를 이해할
		// 수 있음]
		Vector<String> vector = new Vector<>();

		// ArrayList, LinkedList, Vector 클래스 모두 List 인터페이스를 구현한 클래스임
		// 즉, List 인터페이스는 위 3개클래스의 부모 자료형이됨.
		// 부모참조변수로 자식객체를 참조할 수 있음. up casting
		List<String> list8 = null;

		// list8 = new List<>(); //error
		list8 = new ArrayList<>();
		list8 = new LinkedList<>();
		list8 = new Vector<>();

	}

}
