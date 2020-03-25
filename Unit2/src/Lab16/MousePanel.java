package Lab16;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import javax.swing.JPanel;
import javax.swing.Timer;

import Lab10.Polkadot;
import Lab11.Ball;
import Lab14.Bumper;

public class MousePanel extends JPanel {
	 private static final int FRAME=400;
	 private BufferedImage myImage;
     private Graphics myBuffer;
     private Ball ball;
     private Polkadot prize;
     private Bumper bumper;
     private int hits;
     private Timer timer;
     private static final Color BACKGROUND = new Color(204, 204, 204);
     

	
	
	public MousePanel() {
		myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        
        ball=new Ball();
        ball.jump(FRAME, FRAME);
        // create ball and jump
     
     
        prize=new Polkadot();
        prize.jump(FRAME, FRAME);
        // create prize and jump
        
        timer=new Timer(5, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myBuffer.setColor(BACKGROUND);
	            myBuffer.fillRect(0,0,FRAME,FRAME);
	            ball.move(FRAME, FRAME);
	            ball.draw(myBuffer);
				prize.draw(myBuffer);
				collide(ball, prize);
				
				 myBuffer.setColor(Color.black);
		         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
		         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
	            
	            
		         repaint();
			}
		});
        timer.start();
        addMouseListener(new Mouse() {
		});
	}
    
	
	private class Mouse extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			super.mouseClicked(e);
			if(e.isMetaDown()) {
				ball.setX(e.getX());
				ball.setY(e.getY());
			}
			else if(e.isShiftDown()) {
				ball.setdx(Math.random()*12-6);
				ball.setdy(Math.random()*12-6);
			}
			else {
				prize.setX(e.getX());
				prize.setY(e.getY());
			}
		}
		
	}
	
	
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
		
	}
	
	private void collide(Ball b, Polkadot pd)
    {
  	
      double d = distance(pd.getX(),pd.getY(),b.getX(),b.getY()); 
      
		if(d<= b.getRadius()+pd.getRadius()) {
			pd.jump(FRAME, FRAME);
			hits++;
			
		}
		  
    }
     private double distance(double x1, double y1, double x2, double y2)
    {
  	   double x=Math.abs(x2-x1);
  	   double y=Math.abs(y2-y1);
  	   
  	   
  	   
  	   
  	   
  	   
       return  (Math.sqrt((x*x)+(y*y)));	 // enter the calculation here.
    }

}
