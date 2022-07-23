import java.awt.Canvas;
import javax.swing.JFrame;


public class main {
	private static final long serialVersionUID = 1L;
	public static final int HEIGHT = 520;
	public static final int WIDTH = 560;
	public static final int String NAME = "Title Game";
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(HEIGHT, WIDTH);
		frame.setTitle(NAME);
		frame.add(new Map());
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}

}
