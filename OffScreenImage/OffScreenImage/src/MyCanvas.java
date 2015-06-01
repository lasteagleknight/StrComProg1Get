import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



class MyCanvas extends JPanel {
	Dimension panelSize;
	Graphics offgc;
	Image offscreen = null;
	BufferedImage gandalf, tile;
	Location loc;
	int height, width;

	public MyCanvas(){
		setPreferredSize(new Dimension(400, 400));
		panelSize=getPreferredSize();
		height=(int) panelSize.getHeight();
		width=(int) panelSize.getWidth();
		System.out.printf("%d, %d\n",height,width);
		loc=new Location(height/2-75, width/2-75);
		loadImage();		
	}	



	private void loadImage(){
		// read in and initialize image
		gandalf = null;
		tile = null;
		try {
			gandalf = ImageIO.read(new File("gandalf.gif"));
			tile = ImageIO.read(new File("seamless-grass.jpg"));
		} catch (IOException e) {
		}

	}


	private void drawBackground(int w, int h){
		for(int height=0; height<h; height+=128)
			for(int width=0; width<w; width+=128)
				offgc.drawImage(tile, width, height, null);
	}

	private void drawPlayer(int w, int h){
		offgc.drawImage(gandalf, w, h, null);		
	}

	private void createGc(int w, int h){
		offscreen = createImage(w, h);//returns an image
		offgc = offscreen.getGraphics();//creates the graphics context for drawing an offscreen image			
	}

	public void paint(Graphics g) {			
		super.paint(g);
		createGc(width, height);			
		drawBackground(width, height);
		drawPlayer(loc.getX(), loc.getY());
		// Draw offscreen.
		g.drawImage(offscreen, 0, 0, this);
	}

	public void makeMove(int x, int y){		
		loc.setX(loc.getX()+x);
		loc.setY(loc.getY()+y);
	}
	
}

