import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Goomba extends Tile{
	  
	  // The constructor for the Tree class. This allows
	  // the user to specify the location of a tree.
	  public Goomba(int x, int y) {
		  
		super("goomba.png", x, y);
	    set_location(x, y);
	  }
	  
	  // Draw the tree at its location in the window.
	  public void drawGoombas(Graphics2D g2) {
	    g2.drawImage(tileImage, null, x*64, y*64);
	  }
	
}