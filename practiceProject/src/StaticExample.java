
//The static keyword means the value is the same for every instance of the class

public class StaticExample {
    static int x; 
	
    public  void display(){
    	x=10;
//    	System.out.println("Value of static x is "+(++x));
      	System.out.println("Value of static x is "+(x));
		}
    
    public void display1() {
    	x=20;
//    System.out.println("Value of static x in display 1 is "+(x++));
    System.out.println("Value of static x in display 1 is "+(x));
    }
    
	public static void main(String[] args) {
    System.out.println("Main method executes");
    StaticExample obj=new StaticExample();
    obj.display();
    obj.display1();
	}

}
