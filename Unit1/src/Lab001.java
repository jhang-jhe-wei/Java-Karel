import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/school.map");
		Robot lisa=new Robot();
		Robot pete=new Robot(4,5,Display.SOUTH,0);
		Display.setSpeed(5);
		for(int i=0;i<15;i++) {
			lisa.move();
		}
		lisa.move();
		lisa.move();		
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.pickBeeper();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.putBeeper();
		pete.pickBeeper();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.turnLeft();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.turnLeft();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.putBeeper();
		pete.turnLeft();
		pete.turnLeft();
		pete.move();
		pete.explode();
		
	}

}
