	//Name______________________________ Date_____________
   import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Carpeter extends Athlete implements Workable
   {
      public Carpeter(int x, int y)
      {
         super(x, y, Display.EAST, Display.INFINITY);
      }
      public Carpeter()
      {
         super(2, 2, Display.EAST, Display.INFINITY);
      }
      public void workCorner()
      {
    	  if(super.nextToABeeper()!=true) {
    		  putBeeper();
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