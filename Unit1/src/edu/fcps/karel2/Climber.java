package edu.fcps.karel2;
import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Climber extends Athlete {
	

    
    public Climber() {
		super();
		
	}
	public Climber(int x) {
		super(x,1,Display.NORTH,1);
		
	}
	
	
	
	
	public void climbDownLeft() {
    	super.left();
    	super.down();
    	super.down();
    	
    }
   
    	
    
    public void climbDownRight() {
    	super.right();
    	super.down();
    	super.down();
    	
    }
    
    	
    
    public void climbUpLeft() {
    	super.up();
    	super.up();
    	super.left();
    	
    }
   
    public void climbUpRight() {
    	super.up();
    	super.up();
    	super.right();
    	
    }
    
  
}
