package thread.assigment;


public class ThreadClass5  extends Thread{

	@Override
	public void run() {
     try {
    	for(int i=0; i<5; i++) {
	    	System.out.println(i+" "+Thread.currentThread().getName());
           Thread.sleep(1000);	      }
       }
      catch (Exception e) { 	
    	  e.printStackTrace();
    	  System.out.println("Thread is interupted");
       }
	}
	
	public static void main(String[] args) {
    ThreadClass5 tc=new ThreadClass5();
    Thread t= new Thread(tc);
    t.start();
    t.interrupt();
	}

}
