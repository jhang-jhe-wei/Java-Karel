

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
    	super.facingleft();
    }
 
    	
    
    public void climbDownRight() {
    	super.right();
    	
    	super.down();
    	super.facingright();
    }
   
    	
    
    public void climbUpLeft() {
    	super.up();
    
    	super.left();
    	super.facingleft();
    }
  
    
    public void climbUpRight() {
    	super.up();
    	
    	super.right();
    	super.facingright();
    }

	
	
	}


