package LamdaTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

	public static void main(String[] args) {
   //Using Lambda
//	Consumer<Integer> consumer=  t-> System.out.println("Printing t "+t);
//    consumer.accept(15);

    //Using forEach and Stream API
	List<Integer> li=Arrays.asList(1,2,3,4,5);
	li.stream().forEach( t-> System.out.println("Printing : "+t));
	}

}
