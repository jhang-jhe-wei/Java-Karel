package Lab09;

import java.awt.Color;

import Lab06.TurtlePanel;
import edu.fcps.Turtle;

public class TwistyTurtle1 extends Turtle {

	public TwistyTurtle1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwistyTurtle1(double x, double y, double heading) {
		super(x, y, heading);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void drawShape() {
		setColor(Color.blue);
		super.setThickness(8);
		for(int i=5;i<400;i+=10) {
			forward(i);
			turnLeft(123);
		}
		
	}
	

}
