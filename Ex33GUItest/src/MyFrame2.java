import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	public MyFrame2() {

		setSize(400,300);
		setLocation(500,100);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JButton b = new JButton();
		add(b);
		
		setVisible(true);
	}
}
