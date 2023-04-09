import java.util.Iterator;
import java.util.Scanner;

public class FrequencyString {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter String ");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int[] arr=new int[str.length()];
	for(int i=0; i<str.length(); i++) {
	    arr[i]=1;
		for(int j=i+1;j<str.length(); j++) {
			if(ch[i]==ch[j]) {
				arr[i]++;
			ch[j]='0';
			}
		}
	}
	System.out.println("Frequency of every character in string is ");
	int count=0;
	for(int i=0; i<arr.length; i++) {
		  if(ch[i] != ' ' && ch[i] != '0') 
		System.out.println(arr[i]+" -> "+ch[i]);
	}
}
}
