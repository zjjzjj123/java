import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;

import java.awt.event.*;
import java.awt.*;

public class InternalFrameDemo extends JFrame{

	JDesktopPane desktop;
	public InternalFrameDemo() {
		super("InternalFrameDemo");
		//Make the big window be indented 50 pixels from each edge
		//of the screen;
		int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(inset, inset, screenSize.width-inset*2, screenSize.height-inset*2);
		
		
		//Quit this app when the big window close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up the GUI
		desktop = new JDesktopPane(); //specialized layered pan
	}
	
	public void createFrame(){
	}
	public static void main(String[] args) {
		
	}
}
























