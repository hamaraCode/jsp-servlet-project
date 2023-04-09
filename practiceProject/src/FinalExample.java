//The final keyword means once the variable is assigned a value it can never be changed.
public class FinalExample {
    final int x=1110; 
   static int y;
   
    public  void display(){
    	int x=10;
   	System.out.println("Value of static x is "+x);
	}

    public void display1() {
    	int x=20; 
    System.out.println("Value of static x in display 1 is "+x);
    }
    
	public static void main(String[] args) {
    System.out.println("Main method executes");
    FinalExample obj=new FinalExample();
    obj.display();
    obj.display1();
	}
}
