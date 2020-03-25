package Lab11;
   import java.awt.*;

import Lab10.Polkadot;
    public class Ball extends Polkadot
   {
      private double dx;       // pixels to move each time step() is called.
      private double dy;
    // constructors
       public Ball()         //default constructor
      {
         super(200, 200, 50, Color.BLACK);
         dx = Math.random() * 12 - 6;          // to move vertically
         dy = Math.random() * 12 - 6;          // to move sideways
      }
       public Ball(double x, double y, double dia, Color c)
      {
         super(x, y, dia, c);
         dx = Math.random()* 12 - 6;
         dy = Math.random() * 12 - 6;
      }
      
     //modifier methods 
       public void setdx(double x)        
      {
         dx = x;
      }
       public void setdy(double y)
      {
         dy = y;
      }
      
      //accessor methods
       public double getdx()             
      {
         return dx;
      }
       public double getdy()
      {
         return dy;
      }
      
     //instance methods
       public void exmove(double rightEdge, double bottomEdge)
      {
         setX(getX()+ dx);
         setY(getY()+ dy);// x = x + dx
        
        // check for left & right edge bounces
         if(getX() >= rightEdge - getRadius())     //hits the right edge
         {
            setX(rightEdge - getRadius());
            dx = dx * -1; 
         }
         else if (getX() <= getRadius()) 
         {
        	 setX(getRadius());
             dx = (Math.random()* 12 - 6) * -1;
             dy = (Math.random()* 12 - 6) * -1;
         }
         
         if(getY() >= bottomEdge - getRadius())     //hits the right edge
         {
            setY(bottomEdge - getRadius());
            dy = (Math.random()* 12 - 6) * -1;
            dx = (Math.random()* 12 - 6) * -1;
         }
         else if (getY() <= getRadius()) 
         {
        	 setY(getRadius());
             dy = dy * -1; 
         }
         
         
      }
       public void move(double rightEdge, double bottomEdge)
       {
          setX(getX()+ dx);
          setY(getY()+ dy);// x = x + dx
         
         // check for left & right edge bounces
          if(getX() >= rightEdge - getRadius())     //hits the right edge
          {
             setX(rightEdge - getRadius());
             dx = dx * -1; 
          }
          else if (getX() <= getRadius()) 
          {
         	 setX(getRadius());
              dx = dx * -1; 
          }
          
          if(getY() >= bottomEdge - getRadius())     //hits the right edge
          {
             setY(bottomEdge - getRadius());
             dy = dy * -1; 
          }
          else if (getY() <= getRadius()) 
          {
         	 setY(getRadius());
              dy = dy * -1; 
          }
          
          
       }
   }