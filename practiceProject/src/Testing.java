
public class Testing {

	public static void main(String[] args) {
    new Thread(()->{
    System.out.println("new thread created");
    } ).start();
	}
	
}