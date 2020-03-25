package edu.fcps.karel2;

public class StepClimber extends Climber {

	public StepClimber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StepClimber(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public void climbDownLeft() {
    	super.left();
    	
    	super.down();
    	
    }
 
    	
    
    public void climbDownRight() {
    	super.right();
    	
    	super.down();
    	
    }
   
    	
    
    public void climbUpLeft() {
    	super.up();
    
    	super.left();
    	
    }
  
    
    public void climbUpRight() {
    	super.up();
    	
    	super.right();
    	
    }

	
	
	}


