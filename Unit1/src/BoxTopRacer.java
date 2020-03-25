import edu.fcps.karel2.Racer;

public class BoxTopRacer extends Racer {

	public BoxTopRacer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoxTopRacer(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}

	public BoxTopRacer(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}
	public void jumpLeft() {
    	while(super.leftIsClear()!=true) {
    		super.up();
    	}
    	super.left();
    	super.facingdown();
    	while(super.frontIsClear()!=true) {
    		super.left();
    		super.facingdown();
    	}
    	
    	while(super.frontIsClear()==true) {
    		super.down();
    	}
    	super.facingleft();
    } 
 
 public void jumpRight() {
    	while(super.rightIsClear()!=true) {
    		super.up();
    	}
    	super.right();
    	super.facingdown();
    	while(super.frontIsClear()!=true) {
    		super.right();
    		super.facingdown();
    	}
    	while(super.frontIsClear()==true) {
    		super.down();
    	}
    	super.facingright();
    } 
}
