package last;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

import Lab10.Polkadot;
import Lab11.Ball;
import Lab14.Bumper;


public class finalPanel extends JPanel {

	private static final int FRAME=800;
	 private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot[] myPDarray;
   private Bumper bumper;
   private int hits;
   private Timer timer;
   private static final Color BACKGROUND = new Color(204, 204, 204);

   
    public finalPanel() {
	 super();
	 myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
     myBuffer = myImage.getGraphics();
     myBuffer.setColor(BACKGROUND);
     myBuffer.fillRect(0,0,FRAME,FRAME);
     myPDarray=new Polkadot[50];
     
     ball=new Ball();
     ball.jump(FRAME, FRAME);
     // create ball and jump
  
     myPDarray = new Polkadot[500];
     for(int k=0; k<myPDarray.length; k++)
        {
         int x = (int)(Math.random() * FRAME);
         int y = (int)(Math.random() * FRAME);
         int size=(int)(Math.random() * 100-10);
          myPDarray[k] = new Polkadot(x, y, 25, Color.RED);
        }  

     // create prize and jump
     
     timer=new Timer(10, new test()) ;
     timer.start();

   }
    private class test implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
	        myBuffer.fillRect(0,0,FRAME,FRAME);
	        ball.exmove(FRAME, FRAME);
	        ball.draw(myBuffer);
	        collide(ball, myPDarray);
	        for(Polkadot prizes:myPDarray) {
	        	 prizes.draw(myBuffer);
	        }
	       
			 myBuffer.setColor(Color.black);
	         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
	         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
	        
	        
	         repaint();
			
		}}
   
    private void collide(Ball b, Polkadot[] pd)
    {
		for(Polkadot pds :pd) {
  	
      double d = distance(pds.getX(),pds.getY(),b.getX(),b.getY()); 
      
		if(d<= b.getRadius()+pds.getRadius()) {
			
			pds.setColor(Color.YELLOW);
			hits++;
			
		}}
		  
    }
     private double distance(double x1, double y1, double x2, double y2)
    {
  	   double x=Math.abs(x2-x1);
  	   double y=Math.abs(y2-y1);
  	   
  	   
  	   
  	   
  	   
  	   
       return  (Math.sqrt((x*x)+(y*y)));	 // enter the calculation here.
    }
     
     @Override
 	protected void paintComponent(Graphics g) {
 		// TODO Auto-generated method stub
 		super.paintComponent(g);
 		
 		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
 		
 	}
   
}
