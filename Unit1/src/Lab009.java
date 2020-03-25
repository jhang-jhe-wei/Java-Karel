import javax.swing.JOptionPane;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Lab009 {

	public static void main(String[] args) {
		String worldname[]= {"pile1","pile2","pile3"};
		Object failname=JOptionPane.showInputDialog(null, "choose the world", "world", JOptionPane.INFORMATION_MESSAGE, null, worldname, worldname[0]);
		
		Display.openWorld("maps/"+failname+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		int beepers1=0,beepers2=0;
		
		
		Athlete wells=new Athlete();
		
		while(wells.getX()!=9) {
		
		
		 while(wells.nextToABeeper()==true) {
			 wells.pickBeeper();
			 beepers1++;
		 }
		 while(beepers2>0) {
				wells.putBeeper();
				beepers2--;
			}
		 wells.right();
		 while(wells.nextToABeeper()==true) {
			 wells.pickBeeper();
			 beepers2++;
		 }
		while(beepers1>0) {
			wells.putBeeper();
			beepers1--;
		}
		wells.right();
		}
		
		
		 
	}

}
