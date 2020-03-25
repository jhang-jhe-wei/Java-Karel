	//Name______________________________ Date_____________
   import javax.sql.rowset.CachedRowSet;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Harvester extends Athlete implements Workable
   {   
	   
	   
      public Harvester(int x, int y)
      {
         super(x, y, Display.EAST, 0);
      }
      public Harvester()
      {
         super(2, 2, Display.EAST, 0);
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
      
   }