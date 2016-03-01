import java.awt.Graphics2D;

public class SuperMario extends Tile{
	public SuperMario(int x, int y){
		super("supermario.gif", x, y);
	}
	
	protected void draw(Graphics2D g2, int i, int j){
		g2.drawImage( tileImage , null, i*64, j *64);
	}

}
