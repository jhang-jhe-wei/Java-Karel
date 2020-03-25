package Lab16;

import javax.swing.JFrame;

public class Lab16 extends JFrame {

	public static void main(String[] args) {


		JFrame lab16=new JFrame("Lab16");
		lab16.setSize(400, 400);
		lab16.setLocation(200, 200);
		lab16.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab16.setContentPane(new MousePanel());
		lab16.setVisible(true);

	}

}
