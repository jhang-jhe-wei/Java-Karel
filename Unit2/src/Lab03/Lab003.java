package Lab03;

import javax.swing.JFrame;


public class Lab003 extends JFrame {

	public static void main(String[] args) {
		
		
	JFrame Lab003 =new JFrame("Lab003");
	Lab003.setSize(400,400);
	Lab003.setLocation(200, 200);
	Lab003.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Lab003.setContentPane(new Panel03());
	Lab003.setVisible(true);
	
		

	}

}
