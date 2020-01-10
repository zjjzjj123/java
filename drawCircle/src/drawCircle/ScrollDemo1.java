package drawCircle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScrollDemo1 extends JPanel{
	private Dimension size; //indicates size taken up by Graphices
	private Vector object; // rect coordinates used to draw
	public final Color colors[] = {
			Color.red,Color.blue,Color.green,Color.orange,
			Color.cyan,Color.magenta,Color.darkGray,Color.yellow};
	
	private final int color_n = colors.length;
	
	JPanel drawingArea;
	public ScrollDemo1() {
		setOpaque(true);
		size = new Dimension(0,0);
		object = new Vector();
		
		//set up the instruction
		JLabel instructionsLeft = new JLabel("Click left mouse button to place a circle");
		JLabel instructionsRight = new JLabel("Click right mouse button to place a circle");
		JPanel instructionPanel = new JPanel(new GridLayout(0,1));
		instructionPanel.add(instructionsLeft);
		instructionPanel.add(instructionsRight);
		
		//set up the drawing area;
		drawingArea = new JPanel() {
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				
				Rectangle rect;
				for(int i=0; i< object.size(); i++)
				{
					rect = (Rectangle)object.elementAt(i);
					g.setColor(colors[(i%color_n)]);
					g.fillOval(rect.x, rect.y, rect.width, rect.height);
				}
			}
		};
		drawingArea.setBackground(Color.white);
	}
	
}



























