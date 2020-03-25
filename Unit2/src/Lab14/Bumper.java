package Lab14;

   import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Timer;

import Lab10.Polkadot;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	 private int myX,myY;
	 private int myXWidth,myYWidth;
	 
	 private Color myColor;
	 private static final int FRAME = 400;
   
   
     //constructors
       public Bumper()         //default constructor
      {
    	   myX = 200;
           myY = 200;
           myXWidth = 50;
           myYWidth = 100;
           myColor = Color.green;
           
      
      }
       public Bumper(int x, int y, int xWidth, int yWidth, Color c)
      {
    	   myX = x;
           myY = y;
           myXWidth = xWidth;
           myYWidth = yWidth;
           myColor = c;
      
      }
      
   
       
       public int getX() {
    	   return myX;
       }
       public int getY() {
    	   return myY;
       }
     
   
       public void setX(int X) {
    	   myX=X;
       }
       
       public void setY(int Y) {
    	   myY=Y;
       }
       public Color getColor() {
    	   return myColor;
       }
       
       public void setColor(Color color) {
    	   myColor=color;

       }
       public int getXWidth() {
    	   return myXWidth;
       }
       public int getYWidth() {
    	   return myYWidth;
       }
       

       
      
     // instance methods
       
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
         // moves location to random (x, y) within the edges
         	 myX = (int)(Math.random()* (rightEdge-myXWidth) );
             myY = (int)(Math.random()* (bottomEdge-myYWidth) );
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
        
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getYWidth(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
