package edu.fcps.karel2;



public class HillClimber extends Climber {

	

	public HillClimber() {
		super();
		
	}
	public HillClimber(int x) {
		super();
		
	}
	public  void climbDownLeft() {
    	super.left();
    	super.left();
    	super.down();
    	
    }
	
 
    	
    
    public void climbDownRight() {
    	super.right();
    	super.right();
    	super.down();
    	
    }
   
    	
    
    public void climbUpLeft() {
    	super.up();
    	super.left();
    	super.left();
    	
    }
  
    
    public void climbUpRight() {
    	super.up();
    	super.right();
    	super.right();
    	
    }
     
}
