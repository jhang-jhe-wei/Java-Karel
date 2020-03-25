package Lab06;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
        Turtle.setCrawl(true);     //a class method
        
         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge.setThickness(6);
         smidge.setSize(100);
         smidge.drawShape();
         
      
         smidge=new SquareTurtle(100,250,-45,30);
         smidge.setColor(Color.red);
         smidge.setThickness(6);
         smidge.drawShape();
         for(int i=0;i<4;i++) {
         smidge=new SquareTurtle(600,300,135,50);
         smidge.setColor(Color.red);
         smidge.setSize(50-10*i);
         smidge.setThickness(4);
         smidge.drawShape();
         
         }
      }
   }