
import edu.fcps.karel2.Display;

public abstract class Digit {
	private Climber wells;
	
	
	public Digit(int x,int y) {
		if(y<9)y=9;
		wells=new Climber(x, y, Display.SOUTH, Display.INFINITY);
	
	}

    private void on() {
    	wells.move();
    	for(int i =0;i<3;i++) {
    		wells.putBeeper();
    		wells.move();
    		
    	}
    	
    }
    
    private void off() {
    	
    	for(int i =0;i<4;i++) {
    	
    		wells.move();
    		
    	}
    	
    }

	public abstract void display();
	
	
	
	public void segment1_Off() {
		wells.facingright();
		off();
	} 
	
	public void segment1_On() {
		wells.facingright();
		on();
	}
    
	public void segment2_Off() {
		wells.facingdown();
		off();
	} 
	
	public void segment2_On() {
		wells.facingdown();
		on();
	}
	public void segment3_Off() {
	
		off();
	} 
	
	public void segment3_On() {
		
		on();
	}
	public void segment4_Off() {
		wells.facingleft();
		off();
	} 
	
	public void segment4_On() {
		wells.facingleft();
		on();
	}
	public void segment5_Off() {
		wells.facingup();
		off();
	} 
	
	public void segment5_On() {
		wells.facingup();
		on();
	}
	public void segment6_Off() {
		
		off();
	} 
	
	public void segment6_On() {
		
		on();
	}
	public void segment7_Off() {
	    wells.facingdown();
	    off();
	    wells.facingright();
	    off();
	} 
	
	public void segment7_On() {
		wells.facingdown();
	    off();
	    wells.facingright();
	    on();
	}
}
