import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Tile extends JPanel{
//attributes common to every tile
//each tile has some constant associated with it
protected BufferedImage tileImage;
protected int x;
protected int y;
 
protected void drawTiles() {
    // TODO: Implement in a child class.
}
public Tile(String fileName, int x, int y){
    // Load the stone image from the file.
    try {
      tileImage = ImageIO.read(new URL("file:" + fileName));
    } catch (IOException e) {
      System.out.println("Failed to load " + fileName + " image.");
    }
    set_location(x,y);
   
}
public void set_location(int x, int y){
	this.x = x;
	this.y = y;
}
public int get_x(){
	return this.get_x();
}
//draw function
protected void drawTile(Graphics2D g2) {
    g2.drawImage(tileImage, null, x * 64, y * 64);
  }
 
 
}