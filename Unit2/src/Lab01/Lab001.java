package Lab01;

import javax.swing.JFrame;

public class Lab001 {

	public static void main(String[] args) {
		JFrame lab001=new JFrame("Lab001");
		lab001.setSize(400, 450);
		
		lab001.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab001.setLocation(200, 200);
		lab001.setVisible(true);
		lab001.setContentPane(new pane101());

	}

}
