
class MySingleton{
	private static MySingleton single_instance= null;
	 
	private MySingleton() {	}

	 
	public static MySingleton getInstance() {
       if(single_instance == null) {
    	   single_instance = new  MySingleton();
       }
       return single_instance;
	}
}
public class Test {
      public static void main(String[] args) {
		MySingleton x=MySingleton.getInstance();
		
		MySingleton y=MySingleton.getInstance();
		
		MySingleton z=MySingleton.getInstance();
		
		System.out.println("Hashcode of x: "+x.hashCode());
		System.out.println("Hashcode of y: "+y.hashCode());
		System.out.println("Hashcode of z: "+z.hashCode());
	
      if(z==y&&y==z) 
    	  System.out.println("All this objects points to the same memory in heap");
      else
    	  System.out.println("All this NOT points the same memory in heap");
      
      }
}
