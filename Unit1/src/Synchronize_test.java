import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Synchronize_test {

	public static void main(String[] args) {
Display.openWorld("maps/first.map");
		
		final Athlete test=new Athlete();
		Display.setSpeed(1);
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				test.move();
				}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				test.move();
				
			}
		});
		Thread t3 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.move();
				
			}
		});
		t1.start();
		t2.start();
		t3.start();
		

	}

	}


