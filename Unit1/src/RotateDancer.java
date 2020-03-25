import edu.fcps.karel2.Display;

public class RotateDancer extends Dancer implements Runnable {
	

	public RotateDancer() {
		super(3,4,Display.EAST,0);
		
	}

	

	@Override
	public void danceStep() {
		
	turnRight();
	turnRight();
	turnRight();
	turnRight();
	turnLeft();
	turnLeft();
	turnLeft();
	turnLeft();

	}

}
