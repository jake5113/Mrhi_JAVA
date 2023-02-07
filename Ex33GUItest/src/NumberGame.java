import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGame extends JFrame {

	JLabel label;
	JButton btn;
	JTextField tf;

	int com; // 컴퓨터가 만들 랜덤한 숫자값 저장 변수

	public NumberGame() {

		// 컴퓨터의 랜덤 값 [ 사용자가 맞출 값 ]
		Random rnd = new Random();
		com = rnd.nextInt(10);// 0~9

		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("숫자 맞추기");
		setLocation(600, 150);

		label = new JLabel("0~9 중 랜덤한 숫자를 맞춰보세요.");
		label.setHorizontalAlignment(JLabel.CENTER);

		btn = new JButton("확인");

		tf = new JTextField();
		tf.setHorizontalAlignment(JTextField.CENTER);

		add(label, BorderLayout.NORTH);
		add(btn, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		setVisible(true);

		// 버튼이 클릭되는 액션이 발생할때 TextField(tf)에 써있는 숫자를 읽어와서
		// 정답숫자와 비교
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TextField에 써있는 숫자를 가져오기
				int num = Integer.parseInt(tf.getText());
				
				// 읽어온 숫자(num)와 정답값(com) 비교
				if (num > com) label.setText(num + "보다 작습니다.");
				else if(num < com) label.setText(num + "보다 큽니다.");
				else label.setText("축하합니다. 정답입니다.");
				
				
			}

		};
	
		btn.addActionListener(listener);

	}

	public static void main(String[] args) {

		new NumberGame();

	}

}
