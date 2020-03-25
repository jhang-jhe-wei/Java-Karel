package Lab18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
import javax.swing.Timer;


import Lab09.TwistyTurtle1;


public class Lab18 extends JPanel {
	    private static final Color BACKGROUND = new Color(204, 204, 204);
	    private Timer timer=new Timer(5, new Listener()); 
	    public Lab18() {
	    	timer.start();
	    }
     	public static void main(String[] args) {
		JFrame lab18=new JFrame("Lab18");
		lab18.setSize(800, 600);
		lab18.setLocation(200, 200);
		lab18.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab18.setContentPane(new Lab18());
		lab18.setVisible(true);
		
		
		Turtle t1=new Turtle();
		t1.setThickness(7);
		t1.forward(60);
		t1.setX(250);
		t1.drawRect();
		t1.drawLine(50, 100, 200, 150);
		t1.draw();
	}
     	
     	
     	public class test implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				repaint();
				
			}
     		
     	}
		
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawImage(Turtle.getImage(), 0, 0, getWidth(), getWidth(), null);
	}
	
	private class Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
          repaint();//paintImmediately(0, 0, getWidth(), getHeight());
       }
    }
	
	

}
