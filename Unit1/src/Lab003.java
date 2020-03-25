import edu.fcps.karel2.Display;

public class Lab003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Display.openWorld("maps/mountain.map");
    Display.setSize(16, 16);
    Display.setSpeed(10);
    
    Climber one=new Climber(8);
    
   
    one.right();
    one.climbUpRight();
    one.climbUpRight();
    one.climbUpRight();
    one.climbDownRight();
    one.climbDownRight();
    one.pickBeeper();
    one.climbUpLeft();
    one.climbUpLeft();
    one.climbDownLeft();
    one.climbDownLeft();
    one.climbDownLeft();
    one.left();
   
    
	}

}
