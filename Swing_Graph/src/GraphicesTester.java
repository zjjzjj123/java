import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class GraphicesTester extends JFrame{
	
	public GraphicesTester() {
		super("��ʾ�����塢��ɫ");
		setVisible(true);
		setSize(480, 250);
	}
//	public void pain t(Graphics g)
//	{
//		super.paint(g);
//		g.setFont(new Font("Sanserif",Font.BOLD,12));
//		g.setColor(Color.blue);
//		g.drawString("����Sanserif,���壬12�ţ���ɫ", 20, 50);	
//		
//		g.setColor(Color.green);
//		g.drawRect(10, 20, 10, 20);
//		
//		
//	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;  //����ת��
		g2d.setPaint(new GradientPaint(0,0,Color.red, 180, 45, Color.yellow));
		g2d.drawString("this is a test function!", 25, 25);
		
	}
	
	public static void main(String[] args)
	{
		GraphicesTester a = new GraphicesTester();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
