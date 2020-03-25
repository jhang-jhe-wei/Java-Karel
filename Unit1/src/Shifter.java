	//Name______________________________ Date_____________
   import javax.xml.soap.SAAJMetaFactory;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Athlete implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
      public void workCorner()
      {
    	  if(super.nextToABeeper()==true) {
    		  super.pickBeeper();
    	  }
      }
      public void moveOneBlock()
      {
    	  super.move();
      }
      public void turnToTheRight()
      {  super.turnRight();
      }
      public void turnToTheNorth()
      {   super.facingup();
      }
     
      @Override
	public void run() {
    	  int beepers1=0,beepers2=0;
    		
    		
    		
    		
    		while(getX()!=9) {
    		
    		
    		 while(nextToABeeper()==true) {
    			 pickBeeper();
    			 beepers1++;
    		 }
    		 while(beepers2>0) {
    				putBeeper();
    				beepers2--;
    			}
    		 right();
    		 while(nextToABeeper()==true) {
    			 super.pickBeeper();
    			 beepers2++;
    		 }
    		while(beepers1>0) {
    			putBeeper();
    			beepers1--;
    		}
    		right();
    		}
        
		
	}
   	
   }