
public class ControlThread {

	public static void main(String[] args) {

		// 타이어조립하는 직원객체 생성[직원 채용]
		CThread t = new CThread();
		t.start(); // 작업시작

		// 스레드는 run()가 종료되면 더이상 실행할 수 없음
		// 즉, 1회용 실행객체임 - 다시 start() 불가능.
		// t.start(); //error

		// 3초후에 스레드에게 잠시 휴식을 주기
		// 시간제한없이 스레드의 동작을 멈추는 기능 메소드
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// t.wait(); // 외부에서 스레드를 강제로 일시정지 하는 것은 권장하지 않음.
		t.pauseThread();

		// 3초후에 스레드에게 작업 복귀!!
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		t.resumeThread();

		// 3초후에 작업종료[즉, 퇴근시키기]
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// 스레드를 종료하기!
		// t.stop(); // 사용을 권장하지 않음. 스레드가 중간에 끝날 수 있음. 비정상종료

		// while문을 종료하면 결국 run메소드가 종료되므로 정상적으로 멈출 수 있다.
		// while문의 조건을 거짓으로 변경
		// t.isRun = false; // 이것도 권장 안함
		// 객체지향의 특징에 맞게 isRun을 false로 변경하는 메소드를 정의하여 사용하는 방식을 권장
		t.stopThread();

	}

}

// 타이어 조립 작업을 하는 스레드 설계
class CThread extends Thread {

	private boolean isRun = true;
	private boolean isWait = false;

	@Override
	public void run() {
		// 4개의 타이어 조립
		while (isRun) {
			System.out.println("1번 타이어 조립");
			System.out.println("2번 타이어 조립");
			System.out.println("3번 타이어 조립");
			System.out.println("4번 타이어 조립");
			System.out.println();

			if (isWait) {
				try {
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {
				}
			}

			// 1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		} // while..

		System.out.println("퇴근");
		System.out.println();

	}// run method..

	// 스레드의 while문의 조건을 거짓으로 변경하는 기능메소드(스레드를 종료시키는 목적)
	public void stopThread() {
		isRun = false;

		synchronized (this) {
			this.notify();
		}
	}

	// 스레드를 일시정지시키는 목적의 메소드
	public void pauseThread() {
		isWait = true;
	}

	// wait()된 스레드를 다시 동작하도록..
	public void resumeThread() {
		isWait = false;

		synchronized (this) {
			this.notify();
		}
	}

}