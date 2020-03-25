
import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Racer;
import edu.fcps.karel2.Robot;


public class Lab005 {
	public static  void samerun(Racer athlete) {
		    athlete.right();
			for(int i =0;i<3;i++) {
		    
			athlete.jumpRight();
			while(athlete.nextToABeeper()!=true) {
				athlete.right();
			}
			while(athlete.nextToABeeper()==true) {
				athlete.pickBeeper();
			}
			while(athlete.frontIsClear()==true) {
				athlete.left();
			}
			athlete.jumpLeft();
			athlete.left();
			while(athlete.getBeepers()>0) {
				athlete.putBeeper();
			}
			athlete.right();
			}
		}
				
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/shuttle.map");
		Display.setSpeed(10);
		
					
		final Racer A1=new Racer(1,1,Display.EAST,0);
		final Racer A2=new Racer(1,4,Display.EAST,0);
		final Racer A3=new Racer(1,7,Display.EAST,0);
	    
		Thread ALL=new Thread() {
			public void run() {
				samerun(A1);
			}
		};
		
		Thread ALL1=new Thread() {
			public void run() {
				samerun(A2);
			}
		};
		
		Thread ALL2=new Thread() {
			public void run() {
				samerun(A3);
			}
		};
		ALL.start();
		ALL1.start();
		ALL2.start();
		
		
	}

}
