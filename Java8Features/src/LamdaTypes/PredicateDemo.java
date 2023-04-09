package LamdaTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
   //Using Lambda
//		Predicate<Integer> predicate=t-> t%2==0;
//		System.out.println(predicate.test(14));

    //Using forEach and Stream API
	List<Integer> li=Arrays.asList(1,2,3,4,5,14);
	li.stream().filter(t-> t%2==0).forEach(t->System.out.println("Print Even "+t));
		}


}
