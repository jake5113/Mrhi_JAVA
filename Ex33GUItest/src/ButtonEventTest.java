import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEventTest extends JFrame {

	// 프레임이 보여줄 컴포넌트들의 참조변수!!!는 가급적 멤버변수로 만들어 놓으면 좋음.
	JButton btn; // 참조변수
	JLabel label; // 참조변수
	int num = 1;

	JButton btn2;
	JLabel imgLabel;

	public ButtonEventTest() {

		setSize(400, 450);
		setTitle("버튼 클릭 이벤트 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1000, 50);

		// 간단하게 옆으로 배치되도록. 배치관리자를 변경
		setLayout(new FlowLayout());

		// 버튼을 클릭하여 Label의 글씨를 변경해보기

		// Button, Label 컴포넌트 하나씩 배치
//		JButton btn = new JButton("button");
//		JLabel label = new JLabel("Hello world");

		// 컴포넌트들의 참조변수는 클래스 안에 어디서든 인식할 수 있도록
		// 멤버변수로 만들어놓을 것을 권장함!
		btn = new JButton("button");
		label = new JLabel("Hello world");

		// 프레임에 붙이기
		add(btn);
		add(label);

		// 버튼(btn)이 클릭되는 것을 듣는 리스너객체 생성 및 버튼에 달기
		// 리스너 객체를 생성
		// ActionListener listener = new ActionListener(); // error: 인터페이스는 곧바로 객체 생성
		// 불가!
		// 인터페이스의 추상메소드를 구현하는 별도의 클래스를 설계하여 객체로 생성해야 함.
		ClickListener clickListener = new ClickListener();

		// 버튼에 리스너를 붙이기
		btn.addActionListener(clickListener);

		// 버튼2 클릭시에 이미지 변경해보기
		btn2 = new JButton("change image");
		imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("image/ms21.png");
		// 리사이징
		Image im = icon.getImage();
		Image im2 = im.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon icon2 = new ImageIcon(im2);
		imgLabel.setIcon(icon2);

		// frame에 추가
		add(imgLabel);
		add(btn2);

		// 버튼2가 클릭되는 이벤트액션을 듣는 리스너 객체 생성 - 버튼1과 다른 동작을 해야 하기에
		// ActionListener listener = new ActionListener();
		// 인터페이스를 구현한 별도의 클래스를 또 만들려니 짜증..
		// 그러니 ActionListener객체를 생성하면서 추상메소드를 그 자리에서 구현해버리기
		// 객체를 생성하면서 클래스를 설계하는 문법 : 익명 클래스
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("익명클래스 객체 click");

				// 이미지 변경 - 사이즈조절하면서
				Image im = new ImageIcon("image/ms17.png").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(im));

			}

		};

		btn2.addActionListener(listener);

		setVisible(true);
	}// constructor

	// ActionListener 인터페이스의 추상메소드를 구현하는 클래스 설계
	// inner class -- outer class 의 멤버를 내것인양 사용할 수 있음.
	class ClickListener implements ActionListener {

		// 이 리스너객체가 감시하는 컴포넌트에 (클릭)이벤트가 발동하면 자동으로 실행되는 콜백메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("clicked!!");
			// JLabel 컴포넌트에 써있는 글씨를 변경해보기
			label.setText("Nice to meet you" + num);
			num++;
		}

	}

	public static void main(String[] args) {

		new ButtonEventTest(); // JFrame 능력을 가진 클래스를 객체로 생성

	}

}
