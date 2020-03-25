



public class HillClimber extends Climber {

	

	public HillClimber() {
		super();
		
	}
	public HillClimber(int x) {
		super(x);
		
	}
	public  void climbDownLeft() {
    	super.left();
    	super.left();
    	super.down();
    	super.facingleft();
    }
	
 
    	
    
    public void climbDownRight() {
    	super.right();
    	super.right();
    	super.down();
    	super.facingright();
    }
   
    	
    
    public void climbUpLeft() {
    	super.up();
    	super.left();
    	super.left();
    	super.facingleft();
    }
  
    
    public void climbUpRight() {
    	super.up();
    	super.right();
    	super.right();
    	super.facingright();
    }
     
}
