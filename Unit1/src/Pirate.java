	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003

   import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
    public class Pirate extends Athlete
   {
       public Pirate()
      {
        super();
      }
       public void approachPile()
      {while(frontIsClear()&&!nextToABeeper()) {
    	  move();
      }
        
      }
       public int numOfBeepersInPile()
      {    int a=0;
    	   while(nextToABeeper()) {
    		   pickBeeper();
    		   a++;
    	   }
        return a;
      }
       public void turnAppropriately(int beepers)
      {
    	   if(beepers==1) {
    	  turnLeft();}
    	  else if(beepers==2) {
    		  turnAround();
    	  }
    	  else if(beepers==3) {
    		   turnRight();
    	   }
    	  else  {}
    		  
      }
      
      }
   