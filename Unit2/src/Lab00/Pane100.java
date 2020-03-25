package Lab00;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Pane100 extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(100, 50, 400, 100);
		g.setFont(new Font("serif", Font.BOLD, 40));
		g.setColor(new Color(150,150,150));
		g.drawString("Welcome to Java GUI!",100, 110);
		
	}
	
	

}
