package Lab12;

import javax.swing.JFrame;

public class Lab12 extends JFrame {

	public static void main(String[] args) {
		JFrame lab12=new JFrame("Lab12");
		lab12.setSize(400, 400);
		lab12.setLocation(200, 200);
		lab12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab12.setContentPane(new PrizePanel());
		lab12.setVisible(true);

	}

}
