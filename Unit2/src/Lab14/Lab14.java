package Lab14;

import javax.swing.JFrame;

import Lab04.BucketPanel;

public class Lab14 extends JFrame {

	public static void main(String[] args) {
		JFrame lab14=new JFrame("Lab14");
		lab14.setSize(400, 400);
		lab14.setLocation(200, 200);
		lab14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab14.setContentPane(new BumperPanel());
		lab14.setVisible(true);

	}

}
