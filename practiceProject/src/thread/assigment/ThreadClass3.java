package thread.assigment;


public class ThreadClass3 extends Thread{

	@Override
	public void run() {
		Thread.yield();
	for(int i=0; i<5; i++) {
		System.out.println(i+" "+Thread.currentThread().getName());
	}
	}
	
	public static void main(String[] args) {
    ThreadClass3 tc=new ThreadClass3();
    Thread t= new Thread(tc);
    t.start();
    
    for(int i=0; i<5; i++) {
		System.out.println(i+" "+Thread.currentThread().getName());
	}
	}

}
