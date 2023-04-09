package List;

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

   @Override
	public String toString() {
		return "balance=" + this.balance + ", acct_number=" + this.acct_number ;
	}
}

public class Account2{   
public static void main(String[] args) {
	ArrayList<AccountD> al=new ArrayList<AccountD>();
	al.add(new AccountD(1000,"12315646"));
	al.add(new AccountD(2000,"12315670"));
	al.add(new AccountD(5000,"12315650"));
	al.add(new AccountD(1300,"12315680"));
	al.add(new AccountD(7400,"12315670"));
    System.out.println("Before sorting ");  
    System.out.println(al);
//	Collections.sort(al,( o1, o2)-> {return o1.balance-o2.balance;}); //Using Lambda Expression
 
   	System.out.println("After sorting ");
    System.out.println(al);
//Collections.reverse(al);
}
}