import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {

	public Dorothy() {
		super();
		
	}

	public Dorothy(int x, int y, int dir) {
		super(x, y, dir, 0);
		
	}
	
    
	public void followPath() {
		while(frontIsBeepers()) {
			move();
		}
		
	}
	public void findPath() {
		
		if(rightIsBeepers()) {
			turnRight();
			
		}
		else if(leftIsBeepers()) {
			turnLeft();
			
		}
		
		}
		
	}

