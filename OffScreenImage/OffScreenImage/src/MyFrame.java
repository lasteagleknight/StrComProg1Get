

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;



public class MyFrame extends JFrame implements KeyListener{
	MyCanvas canvas=new MyCanvas();
	public MyFrame(){	
		addKeyListener(this);
		add(canvas);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		

	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			canvas.makeMove(-10, 0);
			System.out.println("left");
			canvas.repaint();
			break;
		case KeyEvent.VK_RIGHT:
			canvas.makeMove(10, 0);
			System.out.println("right");
			canvas.repaint();
			break;
		case KeyEvent.VK_UP:
			canvas.makeMove(0, -10);
			System.out.println("up");
			canvas.repaint();
			break;
		case KeyEvent.VK_DOWN:
			canvas.makeMove(0, 10);
			System.out.println("down");
			canvas.repaint();
			break;
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		

	}
	
}


/*
 * 
 * public class DrawFrame extends JFrame implements KeyListener{
	DrawPanel canvas=new DrawPanel();
	public DrawFrame(){
		addKeyListener(this);
		add(canvas);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		

	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			canvas.makeMove(-10, 0);
			System.out.println("left");
			canvas.validate();
			canvas.repaint();
			break;
		case KeyEvent.VK_RIGHT:
			canvas.makeMove(10, 0);
			System.out.println("right");
			canvas.validate();
			canvas.repaint();
			break;
		case KeyEvent.VK_UP:
			canvas.makeMove(0, -10);
			System.out.println("up");
			canvas.validate();
			canvas.repaint();
			break;
		case KeyEvent.VK_DOWN:
			canvas.makeMove(0, 10);
			System.out.println("down");
			canvas.validate();
			canvas.repaint();
			break;
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		

	}
}
 * */
