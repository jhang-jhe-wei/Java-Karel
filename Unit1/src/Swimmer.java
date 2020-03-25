	//Name______________________________ Date_____________
   import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Swimmer extends Athlete implements Runnable
   {
      public Swimmer(int x)
      {
         super(x, 1, Display.NORTH, 0);
      }
      
      public void run() //not swim
      {
    	  for(int i=0;i<10;i++) {
    		  for(int move=0;move<16;move++) {
    			  if(move<8) {
    				  facingup();
    			  }
    			  if(move>=8) {
    				  super.facingdown();
    			  }
    			  super.move();
    			  
    		  }
    	  }
      }
   }