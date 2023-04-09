package thread.assigment;

public class ThreadClass2 extends Thread{
    
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main Started");
		ThreadClass2 tc=new ThreadClass2();
      Thread t=new Thread(tc);
		t.start();
	      Thread t2=new Thread(tc);
	t2.start();
	}
}
