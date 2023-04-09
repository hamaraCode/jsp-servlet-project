
@FunctionalInterface
interface MyFunctional{
	public int test(int x,int y);
}
public class LamdaDemo {
   public static void main(String[] args) {
	
	   MyFunctional myFunctional=(x,y)->{
		   if(y<x)
			   return x-y;
		   else
			   return x+y;
	   };

	System.out.println("substraction of x and y is "+myFunctional.test(20,10));
   }
   
}
