import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class GraphicesTester extends JFrame{
	
	public GraphicesTester() {
		super("演示、字体、颜色");
		setVisible(true);
		setSize(480, 250);
	}
//	public void pain t(Graphics g)
//	{
//		super.paint(g);
//		g.setFont(new Font("Sanserif",Font.BOLD,12));
//		g.setColor(Color.blue);
//		g.drawString("字体Sanserif,粗体，12号，蓝色", 20, 50);	
//		
//		g.setColor(Color.green);
//		g.drawRect(10, 20, 10, 20);
//		
//		
//	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;  //向上转型
		g2d.setPaint(new GradientPaint(0,0,Color.red, 180, 45, Color.yellow));
		g2d.drawString("this is a test function!", 25, 25);
		
	}
	
	public static void main(String[] args)
	{
		GraphicesTester a = new GraphicesTester();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
