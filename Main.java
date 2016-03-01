import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
  
  // The main driver method.
  public static void main(String args[]) {
    JPanel panel = new JPanel();
    OurArea area = new OurArea(3);
    
    panel.addKeyListener(area);
    // Use our area, and show the window.
    Window window = new Window("Inheritance Lecture");
    window.add(area);
    window.setVisible(true);
    window.add(panel);
    
    panel.requestFocusInWindow();
  }
  
}
