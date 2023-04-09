
@FunctionalInterface
interface MyFunctional2{
	void display(int x,int y);
}

public class LamdaDemo2 {

	public static void main(String[] args) {
      MyFunctional2 myFunctional2=(x,y)->{System.out.println("Sum of a+b is "+(x+y));
      };
      myFunctional2.display(15, 5);
	}

}
