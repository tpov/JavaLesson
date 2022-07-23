import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final double Rad = Math.PI/180;
	private GameTimer gameTimer;
	
	private double snakeVelocityX = 0;
	private double snakeVelocityY = 0;
	
	private SnakeBlock head;
	private Apple apple;
	
	public GamePanel() {
		this.setFocusable(true);
		this.requestFocus();
		
		head = new SnakeBlock();
		head.setPosition(5, 5);
		gameTimer = new GameTimer();
		gameTimer.start();
		
		this.addKeyListener(new KeyAdapter() {
		
			public void keyPressed(KeyEvent keyEvent) {
			int keyCode = keyEvent.getKeyCode();
			
			if(keyCode == KeyEvent.VK_UP) {
				snakeVelocityX = Math.cos(90*Rad);
				snakeVelocityY = -Math.sin(90*Rad);
			} else if (keyCode == KeyEvent.VK_DOWN) {
				snakeVelocityX =Math.cos(270*Rad);
				snakeVelocityY =-Math.sin(270*Rad);
			} else if (keyCode == KeyEvent.VK_LEFT) {
				snakeVelocityX = Math.cos(180*Rad);
				snakeVelocityY = -Math.sin(180*Rad);
			} else if (keyCode == KeyEvent.VK_RIGHT) {
				snakeVelocityX = Math.cos(0*Rad);
				snakeVelocityY = -Math.sin(0*Rad);		
			}
		}
		
	});

	}
	
	public Dimension getPreferredSize() {
		return new Dimension(WIDTH, HEIGHT);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		head.paint(g);
		
	}
	class GameTimer extends Thread {
		
		public void run() {
			while(true) {
				head.moveRelatively(snakeVelocityX, snakeVelocityY);
					repaint();
					try {
						Thread.sleep(1000);
						
					}catch (InterruptedException ie) {}
			}
		}
	}
}
