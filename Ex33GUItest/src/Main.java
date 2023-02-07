import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		// GUI 프로그래밍
		// 자바언어에서 GUI 개발을 위해 미리 설계된 클래스들의 묶음 API를 제공함
		// 1. AWT
		// 2. Swing - 이 APIs 사용
		// 3. JavaFX - 별도 프로그램 설치 필요.

		// GUI 맛보기로 Swing API 사용

		// 1. 최상위 컨테이너 생성
		JFrame frame = new JFrame("GUI TEST");
		frame.setSize(500, 400);

		// 기본적으로 JFrame은 BorderLayout 이라는 배치관리자가 설정되어 있음.
		// 가장 쉬운 레이아웃매니저인 FlowLayout 으로 변경
		frame.setLayout(new FlowLayout());
		
		// 2. 컴포넌트들 추가하기
		JButton b1 = new JButton("버튼");
		JButton b2 = new JButton("Button");

		// 컨테이너에 추가하기
		frame.add(b1);
		frame.add(b2);

		// JLabel - 글씨를 보여주는 컴포넌트
		JLabel lable = new JLabel("This is label");
		frame.add(lable);
		
		//JTextField - 사용자가 글씨를 입력할 수 있도록 하는 컴포넌트
		JTextField tf = new JTextField(20); // 최소 20글자 사이즈
		frame.add(tf);
		
		// 이미지 - 이미지용 컴포넌트가 존재하지 않음.
		// JLabel 에 아이콘(이미지)을 보여주는 기능이 있음. 이를 활용.
		
		// 이미지 아이콘 객체 생성
		ImageIcon icon = new ImageIcon("image/ms17.png");
		
		// 이미지 아이콘의 이미지 사이즈를 리사이징
		// 이미지 아이콘 안에서 실제 이미지를 가지고 있는 Image객체 뽑아오기
		Image im = icon.getImage();
		// 뽑아온 이미지 객체를 기반으로 사이즈가 조절된 새로운 이미지객체를 생성(복사)
		Image im2 = im.getScaledInstance(280, 280, Image.SCALE_SMOOTH);
		ImageIcon icon2 = new ImageIcon(im2);
		
		// JLabel을 생성하면서 아이콘을 지정
		JLabel img = new JLabel(icon2);
		frame.add(img);
		
		
		
		// 기본적으로 JFrame의 x 버튼을 눌러서 창을 닫아도 프로그램이 종료되지 않음.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(1200, 200);

		// 3. 최상위 컨테이너를 화면에 보이기
		frame.setVisible(true);

	}

}
