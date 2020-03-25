package Lab09;

import java.awt.Color;

import edu.fcps.Turtle;

public class TwistyTurtle2 extends Turtle {

	public TwistyTurtle2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwistyTurtle2(double x, double y, double heading) {
		super(x, y, heading);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShape() {
		setColor(Color.red);
		super.setThickness(5);
		for(int i=0;i<150;i+=2) {
			forward(i);
			turnLeft(30);
		}

	}

}
