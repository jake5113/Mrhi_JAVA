import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		// Map : 키-벨류 쌍으로 데이터를 저장하는 방식

		// Map도 인터페이스여서 바로 객체생성은 불가능
		// Map 인터페이스를 구현한 하위 클래스들 : HashMap, TreeMap, LinkedHashMap, HashTable [HashMap과
		// 동일 - 동기화처리가 되어 있음]

		// <key, value>
		// 1) HashMap
		// HashMap<String, String> map = new HashMap<String, String>(); // 가장 성능 우수함.
		// 2) TreeMap
		// TreeMap<String, String> map = new TreeMap<>(); // 키값을 오름차순으로 저장 [성능 중간]
		// 3) LinkedHashMap
		LinkedHashMap<String, String> map = new LinkedHashMap<>(); // 저장된 순서대로 [성능 최하위]
		// 4) HashTable [HashMap과 동일 - 동기화처리가 되어 있음]

		// 요소추가
		map.put("name", "sam"); // (식별자, 값)
		map.put("id", "abcd"); // (key, value)
		map.put("pass", "1234");
		map.put("kkk", "sam"); // 데이터는 중복되지만 키값이 다르기에 추가됨

		// 요소개수
		System.out.println("요소 개수 : " + map.size());

		// 요소 얻어오기
		System.out.println(map.get("name")); // 키값으로 값얻기
		System.out.println(map.get("id"));
		System.out.println(map.get("pass"));
		System.out.println(map.get("kkk"));

		System.out.println();

		// 키의 중복??
		map.put("kkk", "hong"); // 키값이 중복되면 새로 추가되지 않고 그 위치값이 변경됨
		System.out.println("요소 개수 : " + map.size());
		System.out.println(map.get("name")); // 키값으로 값얻기
		System.out.println(map.get("id"));
		System.out.println(map.get("pass"));
		System.out.println(map.get("kkk"));
		System.out.println();

		// 순서대로 요소값 얻어오기
		// 방법1. for문은 불가 - index번호가 없음.
		// 방법2. 확장된 for문도 불가.

		// 방법3. 우선 키값들만 Set객체로 얻어와서 반복문으로 처리
		Set<String> keys = map.keySet();

		// 3-1 key들을 가진 Set 컬렉션 객체를 반복문으로 접근 **
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		System.out.println();

		// 3-2 key들을 가진 Set 컬렉션 객체를 반복자 iterator 이용
		Iterator<String> datas = keys.iterator();
		while (datas.hasNext()) {
			String k = datas.next();
			System.out.println(map.get(k));
		}
		System.out.println();

		// 방법4. Map 객체를 Set객체로 변환하여 접근
		// Map의 요소객체(키-벨류)인 Entry들을 가진 Set으로 변환
		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> t : entries) {
			System.out.println(t.getKey() + " : " + t.getValue());
		}
		System.out.println();

		// 요소 삭제
		map.remove("kkk");
		System.out.println(map.toString());

		System.out.println();

		// 키값을 그냥 정수 숫자로 할 수도 있음.
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "aaa");
		map2.put(2, "bbb");
		map2.put(3, "ccc");

	}

}
