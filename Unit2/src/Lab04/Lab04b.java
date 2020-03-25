package Lab04;

import java.awt.Frame;

import javax.swing.JFrame;

import org.omg.CORBA.PUBLIC_MEMBER;

import edu.fcps.Bucket;

public class Lab04b extends Frame {

	public static void main(String[] args) {
		JFrame Lab04=new JFrame("Lab04");
		Lab04.setSize(400, 400);
		Lab04.setLocation(200, 200);
		Lab04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lab04.setContentPane(new BucketPanel());
		Lab04.setVisible(true);
		
		Bucket.setSpeed(10);
		Bucket.useTotal(true);
		 Bucket five = new Bucket(5);
		 Bucket four = new Bucket(4);
		 Bucket three = new Bucket(3);
		
		 four.fill();
		 four.pourInto(three);
		 three.spill();
		 five.fill();
		 four.spill();
		 five.pourInto(three);
		 three.spill();
		 four.fill();
		 five.pourInto(three);
		 five.fill();
		 four.spill();
		 three.fill();
		 five.spill();
		 three.pourInto(five);
		 four.fill();
		 three.fill();
		 five.fill();
		 three.spill();
		 
		 
		 
		
	}

}
