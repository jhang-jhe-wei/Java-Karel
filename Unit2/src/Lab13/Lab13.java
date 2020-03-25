package Lab13;

import javax.swing.JFrame;

public class Lab13 extends JFrame {

	public static void main(String[] args) {
		
		JFrame lab13=new JFrame("Lab13");
		lab13.setSize(700, 500);
		lab13.setLocation(200, 200);
		lab13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab13.setContentPane(new ProjectPanel());
		lab13.setVisible(true);

	}

}
