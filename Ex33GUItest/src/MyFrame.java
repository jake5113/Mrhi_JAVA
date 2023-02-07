import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	// 생성자 메소드
	public MyFrame() {
		
		// 객체가 생성될때 본인의 설정을 모두 해놓기
		this.setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new JLabel("Hello world"));
		
		setVisible(true);
		
	}	
}
