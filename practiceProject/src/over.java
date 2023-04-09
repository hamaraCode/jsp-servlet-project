
class Super{
	  public void m1() {
		  System.out.println("super class called");
	  }
}

class Child extends Super{
  @Override	
	public void m1() {
		  System.out.println("sub class called");
	  }
}
public class over {
public static void main(String[] args) {
	Child c=new Child();
	c.m1();
}
}
