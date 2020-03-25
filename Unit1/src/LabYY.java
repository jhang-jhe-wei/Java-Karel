import org.omg.CORBA.PUBLIC_MEMBER;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldBackend;

public class LabYY {

	public static void main(String[] args) {
		final int N = (int)(Math.random()*50+25);
		Display.setSize(N, N);
		Hunter.N=N;
		Display.setSpeed(10);
		
		WorldBackend.getCurrent().putBeepers(
	               (int)(Math.random()*N+1), (int)(Math.random()*N+1), 1);
		
		
		Thread[] threads=new Thread[N];
		for(int i=0;i<N;i++) {
			threads[i]=new Thread(new Hunter(i+1));
			
		}
		for(int i=0;i<N;i++) {
			
			threads[i].start();
		}
	


	}

}
