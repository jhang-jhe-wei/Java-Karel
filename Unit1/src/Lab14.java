import edu.fcps.karel2.Display;

//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

public class Lab14 {
	public static void main(String[] args) {
		
         Display.setSpeed(10);
         for(int i=0;i<4;i++) {
        	 Thread t1=new Thread(new Swimmer(2+2*i));
        	 t1.start();
         }
	}
}