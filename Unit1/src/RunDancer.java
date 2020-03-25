
public class RunDancer extends Dancer implements Runnable {

	public RunDancer() {
		super();
		
	}

	int i=0;

	@Override
	public void danceStep() {
		up();
		right();
		i++;
		if(i<10)danceStep();
		left();
		down();
		i=0;
		

	}

}
