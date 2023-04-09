package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Account{
	private int balance;
	private String acct_number;
	
	public Account(int balance, String acct_number) {
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
		return "balance=" + balance + ", acct_number=" + acct_number;
	}
}

public class AccountDemo {

	public static void main(String[] args) {
    List<Account> li=new ArrayList<>();
    li.add(new Account(1000,"456465789"));
    li.add(new Account(1005,"456465089"));
    li.add(new Account(1002,"456465589"));
    li.add(new Account(1001,"456465989"));
    li.add(new Account(1004,"456465189"));
     System.out.println(li);
     Collections.sort(li,(o1,o2)->o1.getAcct_number().compareTo(o2.getAcct_number()));
     System.out.println(li);
	}

}
