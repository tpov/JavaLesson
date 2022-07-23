import javax.swing.*;

public class MainWindow extends JFrame{
	public MainWindow() {
		super("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel = new GamePanel();
		this.add(gamePanel);
		this.pack();
		
	}

}
