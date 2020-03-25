import edu.fcps.karel2.Display;

public class Lab015 {

	public static void main(String[] args) {
		Display.setSpeed(10);
		
		Thread t1=new Thread(new FlyDancer());
		Thread t2=new Thread(new RotateDancer());
		Thread t3=new Thread(new RunDancer());
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
