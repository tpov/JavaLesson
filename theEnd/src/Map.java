import java.awt.*;
import javax.swing.*;

public class Map extends JFrame {
	private static final long serialVersionUID = 1L;
	public Image gras;
	
	public Map() {
		gras = Toolkit.getDefaultToolkit().getImage("Image/gr.png");
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(gras, 10, 10, null);
	}
}
