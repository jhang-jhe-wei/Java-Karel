package edu.fcps.karel2;

public class testthread extends Thread {
public int y;
	
	public void run() {
		
		
        			
		this.y=y;
		 Racer  athlete=new Racer(y);
		athlete.right();
		athlete.jumpRight();
		athlete.right();
		athlete.right();
		athlete.pick(7);
		athlete.right();
		athlete.right();
		athlete.pick(5);
		athlete.right();
		athlete.right();
		athlete.pick(3);
		athlete.facingleft();
		athlete.sprint(6);
		athlete.jumpLeft();
		athlete.left();
		athlete.put(15);
		athlete.right();}
		
	

}
