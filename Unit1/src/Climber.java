
import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Climber extends Athlete {
	

    
    public Climber() {
		super();
		
	}
	public Climber(int x) {
		super(x,1,Display.NORTH,1);
		
	}
	 public Climber(int x, int y, int dir, int beepers)
     {
        
   	   super(x, y, dir, beepers);
   	   }
	
	
	
	public void climbDownLeft() {
    	super.left();
    	super.down();
    	super.down();
    	super.facingleft();
    }
   
    	
    
    public void climbDownRight() {
    	super.right();
    	super.down();
    	super.down();
    	super.facingright();
    }
    
    	
    
    public void climbUpLeft() {
    	super.up();
    	super.up();
    	super.left();
    	super.facingleft();
    }
   
    public void climbUpRight() {
    	super.up();
    	super.up();
    	super.right();
    	super.facingright();
    }
    
  
}
