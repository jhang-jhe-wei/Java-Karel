package Lab09;

import java.awt.Color;

import edu.fcps.Turtle;

public class TwistyTurtle3 extends Turtle {

	public TwistyTurtle3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwistyTurtle3(double x, double y, double heading) {
		super(x, y, heading);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShape() {
		setColor(Color.black);
		super.setThickness(5);
		for(int i=25;i<150;i+=5) {
			for(int j=0;j<4;j++) {
				forward(i);
				turnLeft(90);
			
				
			}
		
			turnLeft(45);

	}

}}
