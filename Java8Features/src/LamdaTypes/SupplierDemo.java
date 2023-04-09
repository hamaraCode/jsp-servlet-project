package LamdaTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{

	public static void main(String[] args) {
    //Using Lambda 
//	Supplier<String> supplier=()->"hii Anand Rajput";
//
//    System.out.println(supplier.get());

//Using Stream	
	List<String> li=Arrays.asList();
	System.out.println(li.stream().findAny().orElseGet(()->"hii Anand Rajput"));
	}

	
}
