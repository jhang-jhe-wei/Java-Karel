package Lab02;

import javax.swing.JFrame;

public class Lab02 {

	public static void main(String[] args) {
		JFrame Lab02=new JFrame("Lab02");
		Lab02.setSize(400, 450);
		Lab02.setLocation(200, 200);
		Lab02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lab02.setContentPane(new pane102());
		Lab02.setResizable(true);
		Lab02.setVisible(true);

		
	}

}
