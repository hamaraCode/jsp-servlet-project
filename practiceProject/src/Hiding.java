


class A{
	public static void m1() {
	System.out.println("M1 of class A called");	
	}
	public void m2() {
		System.out.println("M2 of class A called");
	}
	
 static final void m3(int a) {
	 System.out.println("Static final called with one argument");
 }
 static final void m3(int a,int b) {
	 System.out.println("Static final called with 2 argument");
 }
}
class B extends A{
public static void m1() {
		System.out.println("M1 of class b called");
	}

public void m2() {
	System.out.println("M2 of class B called");
}
}
public class Hiding {

	public static void main(String[] args) {
	B b=new B();
	b.m1();
	b.m2();
	
	A a=new B();
	a.m1();
	a.m2();
	
	
	A obj=new A();
	obj.m3(10,10);
	}

}
