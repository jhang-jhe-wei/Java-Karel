package Lab08;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.TurtlePanel;
   public class Driver08
   {
	   public static void draw(FlowerTurtle arg0) {
		   arg0.setThickness(5);
	    	  arg0.drawShape();
 		  
 	  }
      public static void main(String[] args)
      {
      

    	  JFrame lab08=new JFrame("Lab08");
    	  lab08.setSize(400, 400);
    	  lab08.setLocation(200, 200);
    	  lab08.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  lab08.setContentPane(new TurtlePanel());
    	  lab08.setVisible(true);
    	  Turtle.clear(Color.white);
    	  Turtle.setCrawl(true);
    	  Turtle.setSpeed(10);
    	  Color violet=new Color(255, 0, 255);
    	  FlowerTurtle a=new FlowerTurtle(100,50,Color.BLUE);
            	  
    	  FlowerTurtle b=new FlowerTurtle(230,50,Color.red);
    	    	  
    	  FlowerTurtle c=new FlowerTurtle(360,50,Color.yellow);
    	  	  
    	  FlowerTurtle d=new FlowerTurtle(490,50,violet);
    	     	   
    	  draw(a);
    	  draw(b);
    	  draw(c);
    	  draw(d);
    	  
      
      }
   }