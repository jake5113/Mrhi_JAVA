import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {

		try {
			// 1. DatagramPacket을 받을 우체통 준비하기
			DatagramSocket socket = new DatagramSocket(10003);

			// 2. 받은 우편물의 내용(데이터)을 담을 수 있는 빈 박스(DatagramPacket) 준비하기
			// 빈 박스로 만들기
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);

			// 3. 우체통에 택배가 올때까지 기다리기..
			System.out.println("메세지를 기다립니다....");
			socket.receive(packet); // 메세지를 받아서 packet안에 buf라는 배열안에 넣어줌. 메세지를 받을때까지 여기서 커서가 대기함.
			
			// byte[] buf에 담긴 데이터를 문자열로 변환하여 화면에 출력
			String msg = new String(buf);
			System.out.println("받은 메세지 : " + msg);

		} catch (SocketException e) {
		} catch (IOException e) {
		}

	}

}
