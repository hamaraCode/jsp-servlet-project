package thread.assigment;

public class ThreadClass4 extends Thread{
	@Override
	public void run() {
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(i+"thread 1 ");
				Thread.sleep(1000);
			}
		
		} catch (Exception e) {
         e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
    ThreadClass4 tc=new ThreadClass4();
    tc.start();
    tc.join();	
    for(int i=0; i<5; i++) {
			System.out.println(i+"main thread ");
	
	}

}
}

