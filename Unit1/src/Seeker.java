import javax.print.attribute.standard.DateTimeAtCompleted;

import edu.fcps.karel2.Athlete;

public class Seeker extends Athlete {

	public Seeker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seeker(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}
   
	public void fetchBeeper() {
		if(!frontIsClear()) {
			turnLeft();
		}
		move();
		if(rightIsClear()) {
			turnRight();
			move();
			facingdown();
			
			fetchBeeper();
			turnLeft();
			move();
			facingdown();
			move();
			return;
			
		}
		
		if(!nextToABeeper())fetchBeeper();
		else {
			turnAround();
			pickBeeper();}
       
        
		
		move();
	}
}
