package edu.fcps.karel2;


public class Racer extends Athlete {

	public Racer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Racer(int y) {
		super(1, y,Display.EAST ,Display.INFINITY);
		// TODO Auto-generated constructor stub
	}
	public Racer(int x,int y,int dir,int beepers) {
		super(x, y,dir,beepers);
		// TODO Auto-generated constructor stub
	}
    public void jumpLeft() {
    	super.up();
    	super.left();
    	super.down();
    	super.facingleft();
    } 
    public void jumpRight() {
    	super.up();
    	super.right();
    	super.down();
    	super.facingright();
    } 
    public void pick(int n) {
    	for(int i=0;i<n;i++) {
        super.pickBeeper();
        
    } }
    public void put (int n) {
    	for(int i=0;i<n;i++) {
    		super.putBeeper();
    	}
    }
    public void sprint(int n) {
    	for(int i=0;i<n;i++) {
    		if (super.frontIsClear()!=true)
    			break;
    		super.move();
    		
    	}
    }
  
    	
    	
}
    
    
    
    


