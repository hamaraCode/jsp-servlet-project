
@FunctionalInterface
interface MyFunctional5{
	public int display(int a,int b);
}

public class LamdaEx1 {
		public static void main(String[] args) {

		MyFunctional5 myFunctional5=(a,b)-> a/b;
		System.out.println("Division of a and b is "+myFunctional5.display(15, 5));
	}

}
