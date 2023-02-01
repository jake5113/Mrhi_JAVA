import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassTest {

	public static void main(String[] args) {
		
		// Collections 클래스의 유용한 static 기능 메소드
		// Collections.sort();
		// Collections.shuffle();
		
		ArrayList<String> datas = new ArrayList<>();
		datas.add("Nice");
		datas.add("World");
		datas.add("Android");
		datas.add("Ios");
		datas.add("hello");
		datas.add("good");
		datas.add("React");
		System.out.println(datas.toString());
			
		Collections.sort(datas); // 리스트의 요소들의 정렬
		System.out.println(datas.toString());
		
		Collections.shuffle(datas);
		System.out.println(datas.toString());
		Collections.shuffle(datas);
		System.out.println(datas.toString());
		
	}

}
