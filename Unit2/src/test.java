import java.awt.Frame;

import javax.swing.JFrame;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class test {

	public static void main(String[] args) {
		
		
		JFrame test=new JFrame("test");
		test.setSize(400,400);
		test.setLocation(200, 200);
	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setContentPane(new testPanel());
	    test.setVisible(true);

	}

}
