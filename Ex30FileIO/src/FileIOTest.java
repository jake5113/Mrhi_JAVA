import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {

		// 파일복사 프로그램 제작

		// 원본 파일의 경로와 파일명.확장자
		String srcPath = "D:/files/aaa.txt";

		// 원본파일과 연결하는 InputStream 생성
		try {
			FileInputStream fis = new FileInputStream(srcPath);

			// 읽어들인 파일의 데이터를 곧바로 다른 파일에 내보내기 위해
			// 새로 만들어진 파일의 저장경로부터 만들기
			File path = new File("D:/copy");
			if (!path.isDirectory())
				path.mkdirs();

			// 저장될 경로와 파일명.확장자를 결합
			File dstFile = new File(path, "bbb.txt");

			// 위에 만들어진 파일에 저장하기 위해 연결하는 OutptuStream 만들기
			FileOutputStream fos = new FileOutputStream(dstFile);

			// 원본파일(aaa.txt)에서 데이터를 1바이트씩 반복적으로 읽어오면서
			// 바로바로 목적지파일(bbb.txt)에 1바이트씩 내보내기(저장)
			while (true) {

				byte b = (byte) fis.read();
				if (b == -1)
					break;

				fos.write(b);
			}
			
			
			fos.flush();
			
			fis.close();
			fos.close();

			System.out.println("복사완료");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("복사중 오류 발생");
		}
	}
}
