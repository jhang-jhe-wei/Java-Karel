package edu.fcps.karel2;
 

   import edu.fcps.karel2.util.*;

   import java.awt.*;
   import javax.swing.*;


    public class Athlete extends Robot {
   
      private int beepers;
      public int direction;
	  private String answer;
	  public String putornot;
	  public static boolean displayornot=true;
   
       public Athlete()
      {
         this(1, 1, Display.EAST, 0);
      }
       public Athlete(int x, int y, int dir, int beepers)
      {
         
    	   super(x, y,dir,beepers);
         if(WorldBackend.getCurrent() == null)
         {
            Display.openDefaultWorld();
         }
      
         this.x = x;
         this.y = y;
      
         if(beepers < 0 && beepers != Display.INFINITY)
         {
            Debug.printWarning("Invalid amount of beepers: " + beepers + "...  Setting to 0...");
            beepers = 0;
         }
      
         direction = Display.validateDirection(dir);
         this.beepers = beepers;
      if(displayornot){
         WorldBackend.getCurrent().addRobot(this);
         }
      }
     
       public int getDirection()
       {
          return direction;
       }
        public int getBeepers()
       {
          return beepers;
       }
    
        public synchronized void move()
       {  if (putornot=="yes")putBeeper();
          if(Display.isDead()) 
             return;
       
          boolean clear = frontIsClear();
       
          if(!clear)
          {
             Coordinate c = getWallCoordinate(direction);
          
             switch(direction)
             {
                case Display.NORTH:
                case Display.SOUTH:
                   Display.die("Tried to walk through a horizontal wall at (" + c.x + ", " + c.y + ")!");
                   break;
                case Display.EAST:
                case Display.WEST:
                default:
                   Display.die("Tried to walk through a vertical wall at (" + c.x + ", " + c.y + ")!");
             }
          
             return;
          }
       
          switch(direction)
          {
             case Display.NORTH:
                y++;
                break;
             case Display.EAST:
                x++;
                break;
             case Display.SOUTH:
                y--;
                break;
             case Display.WEST:
                x--;
                break;
          }
          
          
       if(displayornot) {
          Display.step();}
       }
        public void moveTo(int x, int y) {
        	  int dx;
        	  int dy;
        	 while(x>this.x) {
        		 right();
        	 }
        	 while(x<this.x) {
        		 left();
        	 }
        	 while(y>this.y) {
        		 up();
        	 }
        	 while(y<this.y) {
        		 down();
        	 }
        	        	 
        	 }
        public void turnLeft()
       {
          if(Display.isDead()) 
             return;
       
          direction = Display.validateDirection(direction + 1);
       
          if(displayornot) {
              Display.step();}
       }
      
       public void turnRight()
      {
         if(Display.isDead()) 
            return;
      
         direction = Display.validateDirection(direction - 1);
      
         if(displayornot) {
             Display.step();}
      }
   
       public void putBeeper()
       {
          if(Display.isDead()) 
             return;
       
          if(beepers < 1 && beepers != Display.INFINITY)
          {
             Display.die("Trying to put non-existent beepers!");
             return;
          }
       
          if(beepers != Display.INFINITY)
             beepers--;
       
          WorldBackend.getCurrent().putBeepers(x, y, 1);
       
          if(displayornot) {
              Display.step();}
       }
        public void pickBeeper()
       {
          if(Display.isDead()) 
             return;
       
          if(!WorldBackend.getCurrent().checkBeepers(x, y))
          {
             Display.die("Trying to pick non-existent beepers!");
             return;
          }
       
          if(beepers != Display.INFINITY)
             beepers++;
       
          WorldBackend.getCurrent().putBeepers(x, y, -1);
       
          if(displayornot) {
              Display.step();}
       }
        public boolean hasBeepers()
       {
          return beepers > 0 || beepers == Display.INFINITY;
       }
        public boolean frontIsClear()
       {
          return isClear(direction);
       }
        public boolean rightIsClear()
       {
          return isClear(Display.validateDirection(direction - 1));
       }
        public boolean leftIsClear()
       {
          return isClear(Display.validateDirection(direction + 1));
       }
    
        public boolean nextToABeeper()
       {
          return WorldBackend.getCurrent().checkBeepers(x, y);
       }
    
        public int LastBeeper(int y)
        {  int x;
           int temp=0;
        	for(x=1;x<11;x++) {
            if (WorldBackend.getCurrent().checkBeepers(x, y)==true) {
            	temp=x;
            }
        	}
        	
        	return temp;
        }
        

        public boolean nextToABeeper(int x,int y)
       {  
       
          return WorldBackend.getCurrent().checkBeepers(x, y);
       }
 
        public boolean facingNorth()
       {
          return direction == Display.NORTH;
       }
        public boolean facingSouth()
       {
          return direction == Display.SOUTH;
       }
        public boolean facingEast()
       {
          return direction == Display.EAST;
       }
        public boolean facingWest()
       {
          return direction == Display.WEST;
       }
    
        private boolean isClear(int direction)
       {
          Coordinate c = getWallCoordinate(direction);
       
          switch(direction)
          {
             case Display.NORTH:
             case Display.SOUTH:
                return !WorldBackend.getCurrent().checkWall(c.x, c.y, Display.HORIZONTAL);
             case Display.EAST:
             case Display.WEST:
             default:
                return !WorldBackend.getCurrent().checkWall(c.x, c.y, Display.VERTICAL);
          }
       }
        
        private Coordinate getWallCoordinate(int dir) //This returns the coordinate of where the wall directly in front of the robot would be
       {
          int xc = x, yc = y;
       
          switch(dir)
          {
             case Display.NORTH: //Check in front, not behind
             case Display.EAST: //Check in front, not behind
                break;
             case Display.SOUTH: //Checking behind current location
                yc--;
                break;
             case Display.WEST: //Checking behind current location
                xc--;
                break;
          }
       
          return new Coordinate(xc, yc);
       }
    
        public void render(Graphics g, Coordinate c)
       {
          ImageIcon i = Display.getKarelImage(direction);
          g.drawImage(i.getImage(), c.x - i.getIconWidth() / 2, c.y - i.getIconHeight() / 2, null);
       }
    
      
       
       public void up() {
    	   direction = 1;
    	       	  
    	   move();
    	   
       }
       public void down() {
    	   direction = 3;
    	         	   
    	   move();
    	   
       }
       public void left() {
    	   direction = 2;
    	   move();
    	   
       }
       public void right() {
    	   direction = 0;
    	   move();
    	   
       }
       public void turnAround() {
    	   direction=Display.validateDirection(direction + 2);
    	   if(displayornot) {
    	          Display.step();}
       }
       public void facingup() {
    	   direction = 1;
    	   if(displayornot) {
    	          Display.step();}
    	  
       }
       public void facingdown() {
    	   direction = 3;
    	   if(displayornot) {
    	          Display.step();}
    	   
       }
       public void facingleft() {
    	   direction = 2;
    	   if(displayornot) {
    	          Display.step();}
    	   
       }
       public void facingright() {
    	   direction = 0;
    	   if(displayornot) {
    	          Display.step();}
    	   
       }
       public boolean frontIsBeepers() {
    	   int x=getX(),y=getY();
   		
   		switch(direction)
           {
              case Display.NORTH:
                 y++;
                 break;
              case Display.EAST:
                 x++;
                 break;
              case Display.SOUTH:
                 y--;
                 break;
              case Display.WEST:
                 x--;
                 break;
           }
   		return WorldBackend.getCurrent().checkBeepers(x, y);
   	}
       public boolean rightIsBeepers()
       {int x=getX(),y=getY();
  		
  		switch(Display.validateDirection(direction -1))
          {
             case Display.NORTH:
                y++;
                break;
             case Display.EAST:
                x++;
                break;
             case Display.SOUTH:
                y--;
                break;
             case Display.WEST:
                x--;
                break;
          }
  		return WorldBackend.getCurrent().checkBeepers(x, y);
    	   
    	   
       }
        public boolean leftIsBeepers()
       {
        	
        	int x=getX(),y=getY();
       		
       		switch(Display.validateDirection(direction + 1))
               {
                  case Display.NORTH:
                     y++;
                     break;
                  case Display.EAST:
                     x++;
                     break;
                  case Display.SOUTH:
                     y--;
                     break;
                  case Display.WEST:
                     x--;
                     break;
               }
       		return WorldBackend.getCurrent().checkBeepers(x, y);
       }
        public static void Step() {
        	Display.step();
        }
      
   }