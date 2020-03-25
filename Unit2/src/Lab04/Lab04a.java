package Lab04;

import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Lab04a extends JFrame {

	public static void main(String[] args) {
		JFrame Lab04=new JFrame("Lab04");
		Lab04.setSize(400, 400);
		Lab04.setLocation(200, 200);
		Lab04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lab04.setContentPane(new BucketPanel());
		Lab04.setVisible(true);
		
		Bucket.setSpeed(5);
		Bucket.useTotal(false);
		 Bucket five = new Bucket(5);
		 Bucket three = new Bucket(3);
		Bucket.useTotal(true);
		five.fill();
		three.fill();
		three.spill();
		five.pourInto(three);
		three.spill();
		five.pourInto(three);
		five.fill();
		five.pourInto(three);
		five.spill();
		three.pourInto(five);
		three.fill();
		three.pourInto(five);
		five.spill();
		three.pourInto(five);
		three.fill();
		three.pourInto(five);
		
		

	}

}
