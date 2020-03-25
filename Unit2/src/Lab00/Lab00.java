package Lab00;

import java.awt.Panel;

import javax.swing.JFrame;

public class Lab00 {

	public static void main(String[] args) {
		
		JFrame Lab00=new JFrame("Lab00");
		Lab00.setSize(600, 300);
		Lab00.setLocation(200, 200);
		Lab00.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lab00.setContentPane(new Pane100());
		Lab00.setVisible(true);
		
		System.out.println(Math.PI);

	}

}
