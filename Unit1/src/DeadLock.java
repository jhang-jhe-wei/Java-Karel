
public class DeadLock {

	
		private static String A = "A";

	    /** B锁 */
	    private static String B = "B";

	    public static void main(String[] args) {
	        new DeadLock().deadLock();
	    }

	    public void deadLock() {

	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                synchronized (A) {
	                    try {
	                        Thread.sleep(2000);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                    synchronized (B) {
	                        System.out.println("thread1...");
	                    }
	                }
	            }
	        });

	        Thread t2 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                synchronized (B) {
	                    synchronized (A) {
	                        System.out.println("thread2...");
	                    }
	                }
	            }
	        });

	        t1.start();
	        t2.start();

	    }

	}


