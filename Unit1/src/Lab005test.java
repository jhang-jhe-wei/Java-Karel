import edu.fcps.karel2.Display;
import edu.fcps.karel2.testthread;

public class Lab005test {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Display.openWorld("maps/shuttle.map");
		Display.setSpeed(10);
		Display.setSize(10, 10);
		
		Thread AA = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		};
		 testthread A1=new testthread();
		 testthread A2=new testthread();
		testthread A3=new testthread();
		
										
	     
	     A1.y=1;
	     A2.y=4;
	     A3.y=7;
	     A1.start();
	     A2.start();
	     A3.run();
   
	}

}
