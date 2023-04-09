package List;

import java.util.LinkedList;

public class MyLinkedList{

	public static void main(String[] args) {
    LinkedList<Integer> li=new LinkedList<Integer>();
    li.add(18);
    li.add(5);
    li.add(65);
    li.add(20);
    li.add(15);
    System.out.println(li);
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Performing operations using Queue methods");

    System.out.println("------------------------------------------------------------------------------");
    
    System.out.println("after offering 55 ");
    System.out.println(li.offer(55));
    System.out.println(li);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying remove mthod ");
    System.out.println(li.remove());
    System.out.println(li);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after pulling first element");
    System.out.println(li.poll());
    System.out.println(li);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying element method");
    System.out.println(li.element());
    System.out.println(li);

	LinkedList<Integer> li2=new LinkedList<Integer>();
	li2.add(1);
	li2.add(2);
	li2.add(3);
	li2.add(4);
	li2.add(5);
	li2.add(6);
	
	System.out.println("**********************************************************");
	
	System.out.println("Performing operations using Deque methods");
    
    System.out.println("after offering 55 ");
    System.out.println(li2.offer(55));
    System.out.println(li2);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying remove mthod ");
    System.out.println(li2.remove());
    System.out.println(li2);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after pulling first element");
    System.out.println(li2.poll());
    System.out.println(li2);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying element method");
    System.out.println(li2.element());
    System.out.println(li2);

    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying peek method");
    System.out.println(li2.peek());
    System.out.println(li2);

    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying peekFirst method");
    System.out.println(li2.peekFirst());
    System.out.println(li2);
    
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying peekLast method");
    System.out.println(li2.peekLast());
    System.out.println(li2);

    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying offerFirst method");
    System.out.println(li2.offerFirst(10));
    System.out.println(li2);
    System.out.println("------------------------------------------------------------------------------");

    System.out.println("after applying offerLast method");
    System.out.println(li2.offerLast(100));
    System.out.println(li2);
    
    li.equals(li2);

	}
}
