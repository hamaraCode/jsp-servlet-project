 package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class AccountD{
     public int balance;
     public String acct_number;
	
	
	public AccountD(int balance, String acct_number) {
		this.balance = balance;
		this.acct_number = acct_number;
	}

   public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAcct_number() {
		return acct_number;
	}

	public void setAcct_number(String acct_number) {
		this.acct_number = acct_number;
	}

@Override
	public String toString() {
		return "balance=" + this.balance + ", acct_number=" + this.acct_number ;
	}
}

public class UserSorting{   
public static void main(String[] args) {
	ArrayList<AccountD> al=new ArrayList<AccountD>();
	al.add(new AccountD(1000,"12315646"));
	al.add(new AccountD(2000,"12315670"));
	al.add(new AccountD(5000,"12315650"));
	al.add(new AccountD(1300,"12315680"));
	al.add(new AccountD(7400,"12315670"));

//	 System.out.println("-----------------Using Collections class---------------------------------------------------");
//	 Collections.sort(al,(o1,o2)-> {return o2.balance-o1.balance;});
//	 System.out.println(al);
	
//	 System.out.println("-----------------Using Stream API---------------------------------------------------");
//     al.stream().sorted((o1,o2)-> o1.balance-o2.balance).forEach(System.out::println);
    
	System.out.println("-----------------Using Stream API Comparing method---------------------------------------------------");
//     al.stream().sorted(Comparator.comparing(emp->emp.balance)).forEach(System.out::println);
     al.stream().sorted(Comparator.comparing(AccountD::getAcct_number)).forEach(System.out::println);

}
}