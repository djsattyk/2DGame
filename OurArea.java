import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class OurArea extends Area implements KeyListener, ActionListener{
	int direction;
	SuperMario mario1 = new SuperMario(0,8);
	Goomba goomba1 = new Goomba(2,8);
	int x= 0, velX = 2;
	private Timer timer = new Timer(1000, this);
	
  /*
  // The trees that are scattered around the area.
  Tree trees[];
  
  // The area tile map, with each tile represented as an integer.
  int tiles[][];
  
  // The tile values for grass (0) and stone (1) tiles.
  int grass;
  int stone;
  
  // The number of tiles on the x-axis, and y-axis.
  int numTilesX;
  int numTilesY;
  
  // The maximum position of a tree on the x-axis and y-axis.
  // Note: The minimum is simply (0, 0).
  double maxTreeX;
  double maxTreeY;
  */
  
  // The constructor for OurArea. It takes in a parameter for the
  // number of trees to place in the area.
  public OurArea(int numberOfTrees) {
    super(); // A magic function. I wonder what it does? 
    timer.start();
    // Exercise #1. Setup the tree objects at random locations.
    //trees = new Tree[numberOfTrees];
    //for (int i = 0; i < numberOfTrees; i++) {
     // trees[i] = new Tree((int)(Math.random() * maxTreeX),
     //                     (int)(Math.random() * maxTreeY));
    //}
    //*/
    
    //* Exercise #3. Initialize the tiles.
    tiles = new int[numTilesX][numTilesY];
    for (int i = 0; i < numTilesX; i++) {
      for (int j = 0; j < numTilesY; j++) {
        // Example: Default to sky everywhere.
        tiles[i][j] = sky;
        
      }
    }
    
    // Example: Draw two stones at specific locations.
    tiles[2][2] = regular;
    tiles[3][2] = question;
    tiles[4][2] = regular;
    
    tiles[4][5] = regular;
    tiles[5][5] = regular;
    tiles[6][5] = question;
    tiles[7][5] = regular;
    tiles[8][5] = regular;
    
    tiles[0][9] = floor;
    tiles[1][9] = floor;
    tiles[2][9] = floor;
    tiles[3][9] = floor;
    tiles[4][9] = floor;
    tiles[5][9] = floor;
    tiles[6][9] = floor;
    tiles[7][9] = floor;
    tiles[8][9] = floor;
    tiles[9][9] = floor;
 
    tiles[5][8] = goomba;
    tiles[0][8] = mario;
 
	
    ///
  }


  // This function must draw each tree to the screen.
  //protected void drawTrees() {
    //* Exercise #2. Draw the trees.
    //for (int i = 0; i < trees.length; i++) {
      //drawTree(i);
   // }
    //*/
  //}
  
  protected void drawTiles() {
    //* Exercise #4. Draw the tiles.
	  Tile t = null;
    for (int i = 0; i < numTilesX; i++) {
      for (int j = 0; j < numTilesY; j++) {
    	//when a tile is set to sky draw sky 
        //otherwise draw a stone
        switch (tiles[i][j])
        {
        case sky: 
        	t = new Sky(i, j);
          break;
        case regular:
        	t = new RegularBlock(i, j);
        	break;
        case question:
        	drawTile(new RegularBlock(i, j));
        	t = new QuestionBlock(i, j);
        	break;
        case floor:
        	t = new Floor(i , j);
        	break;
        case mario:
        	drawTile(new Sky(i,j));
        	t = mario1;
        	break;
        case goomba:
        	drawTile(new Sky(i, j));
        	t = goomba1;
        	break;
        }
        
        drawTile(t);
        
    }
      drawTile(mario1);
      drawTile(goomba1);
    
    //*/
  }
   
    
  }


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode() == KeyEvent.VK_RIGHT){
		mario1.set_location(mario1.x+1 , mario1.y);
	}
	if(e.getKeyCode() == KeyEvent.VK_LEFT){
		mario1.set_location(mario1.x-1 , mario1.y);
	}
	if(e.getKeyCode() == KeyEvent.VK_DOWN){
		mario1.set_location(mario1.x , mario1.y+1);
		
	}if(e.getKeyCode() == KeyEvent.VK_UP){
		mario1.set_location(mario1.x , mario1.y-1);
	}
	repaint();
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == timer) {
		goomba1.set_location(goomba1.x+1, goomba1.y);
		
	}
	repaint();
}

 
}
