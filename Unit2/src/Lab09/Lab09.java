package Lab09;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

import Lab06.TurtlePanel;
import edu.fcps.Turtle;

public class Lab09 extends Frame {
	public static void draw(Turtle arg0) {
		arg0.drawShape();
		
	}

	public static void main(String[] args) {
		JFrame lab09=new JFrame("Lab09");
		lab09.setSize(400, 400);
		lab09.setLocation(200, 200);
		lab09.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab09.setContentPane(new TurtlePanel());
		lab09.setVisible(true);
		
		Turtle.setSpeed(10);
		Turtle.setCrawl(true);
		Turtle.clear(Color.WHITE);
		
		draw(new TwistyTurtle1(300,300,90));
		draw(new TwistyTurtle2(200,200,-90));;
		draw(new TwistyTurtle3(400,400,180));
		
		
		

	}

}
