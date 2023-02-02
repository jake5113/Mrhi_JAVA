
public class JoinTest {

	public static void main(String[] args) {

		JThread j = new JThread();
		j.start(); // 5초 정도 소요되는 작업 시작!

		// J작업이 완료된 후에 아래 작업을 하고 싶을때..
		// synchronized 동기화 문법으로는 처리할 수 없을때.
		// 어떤 스레드의 작업이 끝날때까지 어떤 스레도도 무조건 대기시키는 기능
		try {
			j.join();
		} catch (InterruptedException e1) {
		}

		// main thread가 다른 작업 수행
		for (int i = 0; i < 10; i++) {
			System.out.println("main...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}

}

class JThread extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("aaa");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}
}