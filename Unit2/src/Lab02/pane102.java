package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import edu.fcps.karel2.Display;

public class pane102 extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(0, 0, 400, 400);
		
		int r=10;
		int x=100,y=80;
		int xtimes=10;
		int ytimes=13;
		g.setColor(Color.yellow);
		for(int i=0;i<xtimes;i++) {
			
		g.fillOval(x+(2*r*i), y, 2 * r, 2 * r);
		
		for(int j=0;j<ytimes;j++) {
			
			g.fillOval(x+(2*r*i), y+(2*j*r), 2 * r, 2 * r);
			
		}
		}
		
		g.fillRect(x+r, y+r, (2*r*xtimes)-2*r,(2*r*ytimes)-2*r);
		ImageIcon thomas=new ImageIcon("F:\\Computer science\\Unit2\\src\\Lab02\\DS.jpg");
		g.drawImage(thomas.getImage(),x+r+r,y+r+r,(2*r*xtimes)-35,(2*r*ytimes)-35,null);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Scanserif", Font.ITALIC,30 ));
		g.drawString("This fire, I don¡¦t transmit", 30, 380);
		
		
	}
	
	

}
