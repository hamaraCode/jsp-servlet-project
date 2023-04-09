import java.util.Scanner;

public class StringSum {
     public String str;
     Scanner sc=new Scanner(System.in);
     public void demo(){
    	 System.out.println("Enter numbers in string format ");
    	 str=sc.nextLine();
    	 System.out.println(str);
    	 str.split(" ");
    	 System.out.println(str);
     }
     public void display() {
    	 Integer x;
    	 x=Integer.parseInt(str);
      System.out.println(x);
     }
	public static void main(String[] args) {
    StringSum obj=new StringSum();
    obj.demo();
//    obj.display();
	}

}
