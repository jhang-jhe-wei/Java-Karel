import edu.fcps.karel2.Display;

public class FlyDancer extends Dancer {

	public FlyDancer() {
		super(1,5,Display.NORTH,0);
		
	}

	

	@Override
	public void danceStep() {
		right();
		right();
		right();
		right();
		right();
		left();
		left();
		left();
		left();
		left();
		
		

	}

}
