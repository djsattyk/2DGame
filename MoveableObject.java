import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MoveableObject implements ActionListener{

	Timer tm = new Timer(5, this);
	int x = 0, velX = 2;
	
	
	public MoveableObject (){
		
		tm.start();
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (x < 0 || x > 576 )
			velX = - velX;
			
		x = x + velX;
		
	}
}
