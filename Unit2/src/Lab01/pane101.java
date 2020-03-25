package Lab01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.CollationElementIterator;

import javax.swing.JPanel;

public class pane101 extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0,0,400,400);
		g.setColor(Color.green.darker());
		g.drawLine(0, 350, 400, 350);
		g.setColor(Color.red);
		g.drawRect(100, 200, 150, 150);
		g.setColor(Color.BLACK);
		g.fillRect(150,275, 50, 75);
		
		int xPoint[]= {75,175,275};
		int yPoint[]= {200,150,200};
		g.drawPolygon(xPoint,yPoint,3);
		
		g.setColor(Color.yellow);
		g.fillOval(300, 75, 50, 50);
		
		g.setColor(Color.white);
		g.setFont(new Font("serif",Font.PLAIN,20));
		g.drawString("Welcome Home", 40, 40);
	}
	
	

}
