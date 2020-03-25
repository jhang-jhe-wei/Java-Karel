
import javax.swing.JOptionPane;


import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Lab010 {

	public static void main(String[] args) {
		String worldname=JOptionPane.showInputDialog(" choose one>>¡§maze1¡¨, ¡§maze2¡¨, and ¡§maze3¡¨");
		Display.openWorld("maps/"+worldname+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		
		Athlete mouse=new Athlete();
		
		while(mouse.nextToABeeper()!=true) {
		if(mouse.rightIsClear()==true) {
			mouse.turnRight();
			mouse.move();
		    continue;
		}
		else if(mouse.frontIsClear()==true) {
			mouse.move();
		    continue;
		}
		else {
			mouse.turnLeft();
		   
			continue;
		}
			
		}
	}

}
