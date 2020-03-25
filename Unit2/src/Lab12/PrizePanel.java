package Lab12;
   import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;


import java.awt.*;
import java.awt.Window.Type;
import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
      int count=0;
		//constructor   
       public PrizePanel()
      {
    	   myImage=new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
    	   myBuffer=myImage.getGraphics();
    	   myBuffer.setColor(BACKGROUND);
    	   myBuffer.fillRect(0, 0, FRAME, FRAME);
    	   int xPos = (int)(Math.random()*(FRAME-100) + 50);
           int yPos = (int)(Math.random()*(FRAME-100)+ 50);
           ball = new Ball(xPos, yPos, 50, Color.BLACK);
           pd =new Polkadot(xPos,xPos,25,Color.red);
           
          
           t = new Timer(5, new Listener());
           t.start();
           
           addKeyListener(new key());
           setFocusable(true);
         
      }
       
       public class key extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				ball.setY(ball.getY()-10);
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN) {

				ball.setY(ball.getY()+10);
				}
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {

				ball.setX(ball.getX()+10);
				}
			else if(e.getKeyCode()==KeyEvent.VK_LEFT) {

				ball.setX(ball.getX()-10);
				}
			if(pd.getY()<=FRAME-pd.getRadius()) {
           	 
            
           	if(pd.getY()>=0+pd.getRadius()) {
           	
            
			if(e.getKeyCode()==KeyEvent.VK_1) {
				pd.setY(pd.getY()-10);
			}
			else if(e.getKeyCode()==KeyEvent.VK_2) {
				pd.setY(pd.getY()+10);
			}}}
			
			if(pd.getX()<=FRAME-pd.getRadius()) {
           	 
            
           	 if(pd.getX()>=0+pd.getRadius()) {
            	
             
			if(e.getKeyCode()==KeyEvent.VK_3) {
				pd.setX(pd.getX()+10);
			}
			else if(e.getKeyCode()==KeyEvent.VK_4) {
				pd.setX(pd.getX()-10);
			}}}
		}
			
    	 
       
       }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      
      }
       private class Listener implements ActionListener
      {
    	   
          public void actionPerformed(ActionEvent e)
         {
        	  myBuffer.setColor(BACKGROUND);    //cover the 
              myBuffer.fillRect(0,0,FRAME,FRAME);   //old ball
              ball.move(FRAME,FRAME);
              ball.draw(myBuffer);
              collide(ball, pd);
              
              pd.draw(myBuffer);
              myBuffer.setFont(new Font("serif", Font.PLAIN,20 ));
              myBuffer.setColor(Color.BLACK);
              myBuffer.drawString("Count:"+count, 300, 20);
              
              myBuffer.setColor(Color.black);
              myBuffer.drawString("用上下左右", 300, 50);
              
              myBuffer.setColor(Color.red);
              myBuffer.drawString("用1234", 300, 80);
             if(pd.getX()>=FRAME-pd.getRadius()) {
            	 pd.setX(FRAME-pd.getRadius());
             }
             if(pd.getX()<=0+pd.getRadius()) {
            	 pd.setX(0+pd.getRadius());
             }
             if(pd.getY()>=FRAME-pd.getRadius()) {
            	 pd.setY(FRAME-pd.getRadius());
             }
             if(pd.getY()<=0+pd.getRadius()) {
            	 pd.setY(0+pd.getRadius());
             }
              
             
              repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
    	
        double d = distance(pd.getX(),pd.getY(),b.getX(),b.getY()); 
        
		if(d<= b.getRadius()+pd.getRadius()) {
			pd.jump(FRAME, FRAME);
			count++;
			
		}
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
    	   double x=Math.abs(x2-x1);
    	   double y=Math.abs(y2-y1);
    	   
    	   
    	   
    	   
    	   
    	   
         return  (Math.sqrt((x*x)+(y*y)));	 // enter the calculation here.
      }
   }