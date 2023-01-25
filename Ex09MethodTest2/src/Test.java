
public class Test {

	// 1) 리턴X 파라미터X
	void aaa() {
		System.out.println("aaa");
	}

	// 2) 리턴X 파라미터O
	void aaa(int n) {
		System.out.println("n: " + n);
	}

	// 3) 리턴O 파라미터X
	int bbb() {
		return 10;
	}

	// 4) 리턴O 파라미터O
	int bbb(int n) {
		return n * 3;
	}
}
