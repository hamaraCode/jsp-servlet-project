
@FunctionalInterface
interface MyFunctional4{
	public int display(int a,int b);
}

public class LamdaDemo4 {
		public static void main(String[] args) {

		MyFunctional4 myFunctional4=(a,b)-> a/b;
    
		System.out.println("Division of a and b is "+myFunctional4.display(15, 5));
	}

}
