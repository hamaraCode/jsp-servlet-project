package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer{
	private int id;
	private String email;
	private List<String> phoneNumbers;
	public Customer(int id, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}

class EkartDatabase{
	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101," one@gmail.com",Arrays.asList("1234567891","1234567851")),
				new Customer(101," two@gmail.com",Arrays.asList("1234567892","1234567865")),
                new Customer(101," three@gmail.com",Arrays.asList("1234567893","1234667851")),
                new Customer(101," four@gmail.com",Arrays.asList("1234567895","12345955851"))).collect(Collectors.toList());
	             }
}
public class MapExample {
	
	public static void main(String[] args) {
     List<Customer> customers=EkartDatabase.getAll();
     
     //Using map function
     List<String> emails=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
     System.out.println(emails);
     System.out.println("------------------------------------------------------------------------------------------------------------");

     List<List<String>> phoneNumbers=customers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
     System.out.println(phoneNumbers);

     System.out.println("------------------------------------------------------------------------------------------------------------");
	
     //using flatMap function
     List<String> phones=customers.stream().flatMap(customer->customer.getPhoneNumbers().stream()).collect(Collectors.toList());
     System.out.println(phones);
	 
     
	}
}
