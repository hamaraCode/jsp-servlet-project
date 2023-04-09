package List;

import java.util.Collections;
import java.util.LinkedList;

public class CompExample {

	public static void main(String[] args) {
    LinkedList<String> li=new LinkedList<String>();
    li.add("fd");
    li.add("df");
    li.add("th");
    li.add("ew");
    li.add("hy");
  
    Collections.sort(li);
       System.out.println(li);
//    System.out.println( li.equals(li2));
         
	}
}
