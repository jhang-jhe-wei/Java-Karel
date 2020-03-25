package Lab18;

   import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;

import javax.swing.Timer;
import javax.swing.undo.UndoableEditSupport;



    public class Turtle
   {
      private static final int WIDTH = 800, HEIGHT = 600;
      private static BufferedImage img;
      private static Graphics buffer;
      private static int black = 0;
      private static int blue = 255;       // 2^8-1
      private static int green = 65280;    //(2^8-1)*2^8
      private static int red = 16711680;   //(2^8-1)*2^16
      private static int white = 16777215; // 2^24-1
      private double x,y,theta,size=30;
      private int thickness;// what does a Turtle know?
      private Color turtleColor;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      
      static									 	 // a static initializer list
      {
         img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         
      }
       public Turtle()
      {
        // img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
    	 buffer=img.getGraphics();
         x=img.getWidth()/2;           //start at center
         y=img.getHeight()/2;          //start at center
         theta=90;                     //start facing north
         thickness=10;
         buffer.setColor(BACKGROUND);
         buffer.fillRect(0, 0, WIDTH, HEIGHT);
         turtleColor=Color.RED;
        
      }
       
       public void setX(int x) {
    	   this.x=x;
       }    	   
       
       public void setY(int y) {
    	   this.y=y;
       }    	   
       
       public static Image getImage()
      {
         return img;
      }
       public void turnLeft(double a)
      {
         theta+=a;
      }
       
       public void setThickness(int s) {
    	   thickness=s;
       }
       
       private void pause()
       {
          try
          {
             Thread.sleep(10);
          }
             catch(Exception e)
             {
             }
       }
       public void setSize(int r) {
    	   size=r;
       }
       
       public void forward(double r)
      {
    	   double dx = r * Math.cos(theta* Math.PI / 180);
           double dy = r * Math.sin(theta * Math.PI / 180);
        
           double temp1 = x + dx;
           double temp2 = y - dy;
        
           ((Graphics2D)buffer).setStroke(new BasicStroke((float)thickness));
        
           double oldX = x;
           double oldY = y;
        
           
              double track = 3.0, sum = 0;
              boolean done = false;
              ((Graphics2D)buffer).setStroke(new BasicStroke((float)thickness));
              while(!done)
              {
                 x = oldX + track * Math.cos(theta * Math.PI / 180);
                 y = oldY - track * Math.sin(theta * Math.PI / 180);
                 
                 buffer.setColor(turtleColor);
                 buffer.drawLine((int)(0.5 + oldX), (int)(0.5 + oldY),(int)(0.5 + x), (int)(0.5 + y));
                 
                
                 pause();
                 oldX = x;
                 oldY = y;
                 if(sum + 2 * track >= r)
                    done = true;
                 sum += track;
                 pause();
                 
              }
              
              
             
              
              
      }
       public void drawLine(int x1,int y1,int x2,int y2) {
    	  int dx=(x2-x1)/10;
    	  int dy=(y2-y1)/10;
    	  int tempx=x1+dx;
    	  int tempy=y1+dy;
    	  int oldx=x1;
    	  int oldy=y1;
    	  while(oldx!=x2&&oldy!=y2){
    		  buffer.setColor(turtleColor);
    		  buffer.drawLine(oldx, oldy, tempx, tempy);
    		  oldx=tempx;
    		  oldy=tempy;
    		  tempx+=dx;
    		  tempy+=dy;
    		  pause();
    	  }
       }
       public void draw() {
    	   buffer.drawLine(50, 50, 200, 200);
       }
       public void drawRect() {
    	  for(int i=0;i<4;i++) {
    		  forward(size);
    		  turnLeft(90);
    	  }
       }
      
       
       
      
      
   }