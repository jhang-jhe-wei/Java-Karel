import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab19 {

	public static void main(String[] args) {
		String filename=JOptionPane.showInputDialog("Enter your world?¡§path1¡¨, ¡§path2¡¨, and ¡§path3¡¨");
		Display.openWorld("maps/"+filename+".map");
        Display.setSpeed(8);
        
        Dorothy wells=new Dorothy(2,2,Display.EAST);
        while(true) {
        	wells.followPath();
        	wells.findPath();
        }
	}

}
