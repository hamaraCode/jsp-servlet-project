package thread.assigment;

public class ThreadClass {
	public static void main(String[] args) {
		try {
			Runtime rt= Runtime.getRuntime();
	         rt.exec("calc");
	         Thread.sleep(2000);
	         rt.halt(0);
		System.out.println("Check running status");
		}    
		catch (Exception e) {
			e.printStackTrace();
		}
	  }
}
	