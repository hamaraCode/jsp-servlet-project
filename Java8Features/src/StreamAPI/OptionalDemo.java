package StreamAPI;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
    
	public static void main(String[] args) {
    Customer customer=new Customer(101,null,Arrays.asList("9644644798","9644644799"));
    
    //Using empty method
    Optional<Object> emptyOptional=Optional.empty();
    System.out.println(emptyOptional);
    
  Optional<String> emailOptional= Optional.of(customer.getEmail());
  System.out.println(emailOptional);
    
	}

}
