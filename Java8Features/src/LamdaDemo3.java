
@FunctionalInterface
interface MyFunctional3{
	public int display(int a,int b);
}

public class LamdaDemo3 {

	public static void main(String[] args) {
		
      MyFunctional3 myFunctional3=(a,b)->  a*b;
	  
    System.out.println("Product of a and b is "+myFunctional3.display(15, 5));
	}

}
