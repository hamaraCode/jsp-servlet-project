package List;

import java.util.LinkedList;

public class MyLinkedList2{

	public static void main(String[] args) {
    LinkedList<Integer> li=new LinkedList<Integer>();
    li.add(18);
    li.add(15);
    li.add(5);
    li.add(65);
    li.add(15);
    li.add(20);
    System.out.println(li);
        System.out.println("-------------------------------------------------------------------------");
  int count=0;
 for(int i=0;i<li.size();i++) {
	 count=0;
	 for(int j=i+1; j<li.size();j++) {
		 if(li.get(i)==li.get(j)) {
			 count=j;
			 break;
		 }
	 }
if(count!=0)
	System.out.println("occured at "+(i+1)+" second "+(count+1));
 }
	}
}
