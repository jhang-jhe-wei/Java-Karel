import javax.swing.JOptionPane;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldBackend;



public class Lab006 {
	
    
      
	public static void task(Athlete demo) {
	
		 int last=demo.LastBeeper(demo.getY());
		 
		 
	for(int i=1;i<10;i++) {
	       
			while(demo.nextToABeeper()==true) { //具癬ホ繷⊿Τホ繷砆具癬
				  demo.pickBeeper();
			  }
			
	       if(!demo.frontIsClear()==true)return;//玡よ琌Τ鲤纠
		  
		    if(demo.getX()<last)demo.move();
		
		
			   
		   
	}
	}
	public static void task(Athlete demo,String pickornot) {
		
		 int last=demo.LastBeeper(demo.getY());
		 
		 
	for(int i=1;i<11;i++) {
	       
			while(demo.nextToABeeper()==true&pickornot=="yes") { //具癬ホ繷⊿Τホ繷砆具癬
				  demo.pickBeeper();
			  }
			
	       if(!demo.frontIsClear()==true)return;//玡よ琌Τ鲤纠
		  
		    if(demo.getX()<last)demo.move();
		
		
			   
		   
	}
	}

	public static void main(String[] args) {
	 String filename=JOptionPane.showInputDialog("What is the world? tasks1〃, ¨tasks2〃, and ¨tasks3");
     Display.openWorld("maps/"+filename+".map");
     Display.setSpeed(10);
     Display.setSize(10, 10);
     
   Athlete worker1=new Athlete(1,1,Display.EAST,0);
   Athlete worker2=new Athlete(1,2,Display.EAST,0);
   Athlete worker3=new Athlete(1,3,Display.EAST,0);
   Athlete worker4=new Athlete(1,4,Display.EAST,0);
   Athlete worker5=new Athlete(1,5,Display.EAST,0);
   Athlete worker6=new Athlete(1,6,Display.EAST,0);
   
   task(worker1,"no");
   task(worker2,"no");
   while(worker3.frontIsClear()==true)worker3.move();
   while(worker4.frontIsClear()==true) {
	   while(worker4.nextToABeeper()==true) { //具癬ホ繷⊿Τホ繷砆具癬
		   worker4.pickBeeper();
		  }
	   worker4.move();
	  
   }
   while(worker4.nextToABeeper()==true) { //具癬ホ繷⊿Τホ繷砆具癬
	   worker4.pickBeeper();
	  }
   while(worker5.frontIsClear()==true) {
	   while(worker5.nextToABeeper()==true) { //具癬ホ繷⊿Τホ繷砆具癬
		   worker5.pickBeeper();
		  }
	   worker5.move();
	  
   }
   while(worker5.nextToABeeper()==true) { //具癬ホ繷⊿Τホ繷砆具癬
	   worker5.pickBeeper();
	  }
   task(worker6,"no");
   worker6.move();
   
   
   
	
  
}}
