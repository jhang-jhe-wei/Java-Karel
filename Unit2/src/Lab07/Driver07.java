package Lab07;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.TurtlePanel;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge.setSides(5);
         smidge.drawShape();
         
         smidge=new PolygonTurtle(450,500,90.0,50,2);
         for(int j=0;j<10;j++) {
    	 if (j==7||j==9) {
    		 continue;
			
		}
     smidge.setColor(Color.blue);
     smidge.setThickness(5);
     smidge.setSides(2+j);
     smidge.drawShape();
         }
         smidge=new PolygonTurtle(500,250,90.0,40,2);
         for(int i=0;i<10;i++) {
        	 if (i==7||i==9) {
        		 continue;
				
			}
         smidge.setColor(Color.blue);
         smidge.setThickness(5);
         smidge.setSides(2+i);
         smidge.drawShape();
         
         }
      
      
      }
   }