import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {

	public static void main(String[] args) {

		// UDP: User Datagram Protocol - 택배보내기와 비슷 - 속도 빠른 방식

		try {
			// 1. 우편보낼 우체통 만들기
			DatagramSocket socket = new DatagramSocket();
			
			// 보낼 데이터
			Scanner scanner = new Scanner(System.in);
			System.out.print("보낼 데이터 : ");
			String msg  = scanner.nextLine();
			
			// 2. 보낼 데이터(msg)를 우편으로 보내기 위해 택배상자(DatagramPacket)
			InetAddress addr = InetAddress.getByName("172.30.1.60"); // 받는 사람 주소로 InetAddress객체 생성
			DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003); // 10003:포트번호
			
			// 3. 우체통에 택배박스 넣어서 보내기
			socket.send(packet);
			
			System.out.println("전송완료");
			
			

		} catch (SocketException e) {

		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}

	}

}
