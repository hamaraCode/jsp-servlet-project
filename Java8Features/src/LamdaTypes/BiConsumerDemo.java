package LamdaTypes;

import java.util.function.BiConsumer;

public class BiConsumerDemo{

	public static void main(String[] args) {
		
    BiConsumer<Integer,String> biConsumer=(t,u) ->System.out.println("Accept method of BiConsumer called with : "+t+ " and "+u);
    
    biConsumer.accept(55, "Hello");
	
	}

}
