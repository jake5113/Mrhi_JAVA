import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		// Set 인터페이스 : 순서 X , index X, 중복데이터 X

		// Set<String> set = new Set<>();//error : 인터페이스는 객체생성 불가

		// Set 인터페이스를 구현한 하위클래스들 : HashSet, TreeSet, LinkedHashSet

		// 1) HashSet
		// HashSet<String> set = new HashSet<String>(); // 성능이 가장 우수함
		// 2) TreeSet
		// TreeSet<String> set = new TreeSet<>(); // 값의 오름차순으로 저장되어짐 [성능은 중간]
		// 3) LinkedHashset
		LinkedHashSet<String> set = new LinkedHashSet<>(); // 값을 저장한 순서 [성능은 최하]

		// 요소 추가
		set.add(new String("aaa"));
		set.add("ccc");
		set.add("eee");
		set.add("ddd");
		set.add("bbb");

		// 요소개수 출력 및 요소값 확인
		System.out.println(set.size() + " : " + set.toString());

		// 중복데이터를 추가해보기 - 무시됨
		set.add("ccc");
		System.out.println(set.size() + " : " + set.toString());

		// 요소값을 얻어오는 기능 .get()이 없음
		// set.get(); // error - why? 인덱스번호가 없어서

		// 일반적으로는 set의 요소 하나를 얻어오기보다는
		// 모든 요소들을 순차적으로 얻어오는 경우가 많다.

		// 순차적으로 요소값을 얻어오기
		// 방법1. for이용 불가! - 인덱스번호가 없어서
		// 방법2. 확장된 for문
		for (String t : set) {
			System.out.println(t);
		}
		System.out.println();

		// 방법3. iterator(반복자) 를 이용
		Iterator<String> datas = set.iterator();
		while (datas.hasNext()) {
			String s = datas.next();
			System.out.println(s);
		}
		System.out.println();

		// 방법4. 배열로 변환하여 접근
		String[] aaa = new String[set.size()];
		set.toArray(aaa);
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		System.out.println();
		
	}

}
