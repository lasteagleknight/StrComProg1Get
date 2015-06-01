package basicdrawing;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	Dimension panelSize;
	Shape newShape;

	public DrawPanel(){
		setPreferredSize(new Dimension(400, 400));
		panelSize=getPreferredSize();
		int height=(int) panelSize.getHeight();
		int width=(int) panelSize.getWidth();
		System.out.printf("%d, %d\n",height,width);
		newShape=new Shape(new Location(height/2, width/2), 10, 10);
	}	

	public void paint(Graphics g) {		
		super.paint(g);
		g.drawRect(newShape.getLoc().getX(), newShape.getLoc().getY(), newShape.getWidth(), newShape.getHeight()); 
	}

	public void makeMove(int x, int y){		
		newShape.move(x, y, panelSize);			
	}

}
