import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Hunter extends Athlete implements Runnable {

	

	public Hunter(int x) {
		super(x,1,Display.NORTH,0);
		
	}
	public static int N;
	
	public void begin() {
		while(!nextToABeeper()&&getY()!=N) {
			up();
		}
		if(nextToABeeper())pickBeeper();
		while(frontIsClear()) {
			down();
		}
	};
	public void newbegin() {
		up();
		if(!nextToABeeper()&&getY()!=N)newbegin();
		if(nextToABeeper())pickBeeper();
		down();
	}
	public void run() {
		newbegin();
	}

}
