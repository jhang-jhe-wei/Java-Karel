import edu.fcps.karel2.Display;

public class Lab11 {

	public static void main(String[] args) {
		Display.openWorld("");
		Display.setSize(36, 32);
		Display.setSpeed(10);
		
		
		Digit one=new One(1, 20);
		Digit two=new Two(10, 20);
		Digit three=new Three(19, 20);
		one.display();
		two.display();
		three.display();

	}

}
