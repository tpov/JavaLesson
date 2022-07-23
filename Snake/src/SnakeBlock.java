import java.awt.*;

public class SnakeBlock {
	private double x;
	private double y;
	
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	public void moveRelatively(double relX, double relY) {
		this.x += relX;
		this.y += relY;
	}
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		int size = 20;
		
		g.fillRect((int)x*size, (int)y*size, (int)size, (int)size);
	}
}
