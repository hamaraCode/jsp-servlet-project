import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Hello user enter your name");
    String str=sc.nextLine();
    
    StringBuffer sf=new StringBuffer(str);
    sf.reverse();
    System.out.println(sf);
	str.split(str);
	}

}
