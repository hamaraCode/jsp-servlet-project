package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
    List<Integer> li=new ArrayList<>();
    li.add(9);
    li.add(8);
    li.add(3);
    li.add(2);
    li.add(10);
		
    //Sorting using Collections class
//     Collections.sort(li);
//     System.out.println(li);
//     Collections.reverse(li);
//     System.out.println(li);
    System.out.println("Ascending order");
    li.stream().sorted().forEach(t->System.out.println(t));	//ascending order      
      System.out.println("Descending order");
      li.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));//descending order

	}

}
