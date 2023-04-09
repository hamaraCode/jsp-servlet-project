package List;

import java.util.LinkedList;

public class MyLinkedList3{

	public static void main(String[] args) {
    LinkedList<Integer> li=new LinkedList<Integer>();
    li.add(18);
    li.add(15);
    li.add(5);
    li.add(65);
    li.add(15);
    li.add(20);	
    System.out.println(li);
    li.clear();
    System.out.println(li);
	}
}

