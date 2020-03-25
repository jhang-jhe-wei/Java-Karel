package Lab11;

import javax.swing.JFrame;

public class Lab11 extends JFrame {

	public static void main(String[] args) {
		JFrame lab11=new JFrame("Lab11");
		lab11.setSize(400, 400);
		lab11.setLocation(200, 200);
		lab11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab11.setContentPane(new PinballPanel());
		lab11.setVisible(true);

	}

}
