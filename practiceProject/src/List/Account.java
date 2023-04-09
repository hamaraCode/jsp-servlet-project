package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Account implements Comparable<Account>{
     private int balance;
     private String acct_number;
	
	
	public Account(int balance, String acct_number) {
		super();
		this.balance = balance;
		this.acct_number = acct_number;
	}

   @Override
	public String toString() {
		return "balance=" + balance + ", acct_number=" + acct_number ;
	}
   @Override
   public int compareTo(Account o) {
   	return this.acct_number.compareTo(o.acct_number)+this.balance-o.balance;
    }

public static void main(String[] args) {
	ArrayList<Account> al=new ArrayList<Account>();
	al.add(new Account(1000,"12315646"));
	al.add(new Account(2000,"12315670"));
	al.add(new Account(1300,"12315680"));
	al.add(new Account(7400,"123156545"));
	al.add(new Account(5000,"12315650"));
Collections.sort(al);
Collections.reverse(al);
	Iterator<Account> it=al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
