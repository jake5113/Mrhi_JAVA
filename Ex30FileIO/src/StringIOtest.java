import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringIOtest {

	public static void main(String[] args) {

		// 문자열데이터를 한줄씩 또는 한 단어씩 읽거나 쓰려면??
		// 기존 바이트스트림 방식은 InputStream 통해서 몇바이트를 읽어야 할지 파악하기 어려움
		// 그래서 조금더 편하게 문자열단위로 데이터를 IO 처리하는 문자스트림 사용
		// Reader, Writer

		// 사용자 입력을 받아 그 데이터를 파일에 지속적으로 저장하는 프로그램.
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("저장할 단어 입력(exit를 입력하면 종료) : ");
			String s = scan.next();

			if (s.equalsIgnoreCase("exit")) { // s == "exit" X!!
				System.out.println("입력이 종료됩니다.");
				break;
			}

			// 입력된 문자열 저장을 위한 File객체 생성
			// 목표위치 : "본인프로젝트폴더/files/data.txt"
			File path = new File("files");
			if (!path.exists())
				path.mkdirs();

			// 경로 + 파일명.확장자
			File file = new File(path, "data.txt");

			// 파일과 연결하는 무지개로드 생성
			// 데이터를 내보내는 것이기에 OutputStream(바이트스트림) --> Writer(문자스트림)
			try {
				// 파일이 없으면 만들고 있으면 열기만 함
				FileWriter fw = new FileWriter(file, true); // append mode : true
//				fw.write(s); // 줄바꿈문자도 신경써야 하고 특정 포맷으로 문자열을 만들기도 번거로움
//				fw.flush();
//				fw.close();

				// System.out.print(),println() 이런 기능메소드는 출력을 보다 편하게 수행해 줌.
				// 위 기능처럼 편하게 파일에 데이터를 작성하는(저장하는) 능력의 보조스트림
				PrintWriter writer = new PrintWriter(fw);
				writer.println(s);
				writer.flush();
				writer.close();

			} catch (IOException e) {
				System.out.println("파일쓰기 작업 실패");
			}

		} // while..

		// 반복문이 종료되었으니 입력이 완료된 것임

		// 입력이 잘되었는지 확인해보기 위해 저장된 파일의 데이터를 읽어오기
		System.out.println();
		System.out.println("========================");
		System.out.println("저장된 파일의 데이터를 화면에 표시합니다.");
		System.out.println("========================");
		System.out.println();

		// 읽어온 단어들이 여러개이기에 대량의 데이터를 저장하는 Collection을 사용해서 받아보기
		// 대량의 데이터를 순서대로 저장하는 List 중에서 가장 많이 사용하는
		ArrayList<String> datas = new ArrayList<>();

		// 파일로부터 데이터를 읽어오기 위해
		try {
			FileReader fr = new FileReader("files/data.txt");

//			int a = fr.read(); // 한 문자를 받아들임. : 영어 1바이트, 한글 2~3바이트. 언어마다 바이트수가 결정됨
//			System.out.println(a);

			// 한문자씩 읽어들이기 짜증.
			// 그래서 모든 데이터를 미리 다 읽어들여놓고
			// 한줄씩 빼내주는 기능을 가진 보조스트림을 활용
			BufferedReader reader = new BufferedReader(fr);

			// 여러줄일테니 반복문으로 처리
			while (true) {
				String line = reader.readLine(); // 한줄씩 읽기 : 줄바꿈 문자는 제외됨
				if (line == null)
					break;

				// 대량의 데이터를 저장하는 datas List에 요소로 추가시키기
				datas.add(line);
			}

			System.out.println("단어의 개수 : " + datas.size());
			System.out.println(datas.toString()); 
			
			for (int i = 0; i < datas.size(); i++) {
				System.out.println(i + " : " + datas.get(i));
			}
			
			// 스트림 닫기
			reader.close();
			

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽기과정 중 오류가 발생했습니다.");
		}

	}

}
