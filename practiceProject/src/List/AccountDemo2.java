package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Account2{
	private int balance;
	private String acct_number;
	
	public Account2(int balance, String acct_number) {
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

public class AccountDemo2 {

	public static void main(String[] args) {
    List<Account2> li=new ArrayList<>();
    li.add(new Account2(1000,"456465789"));
    li.add(new Account2(1005,"456465089"));
    li.add(new Account2(1002,"456465589"));
    li.add(new Account2(1001,"456465989"));
    li.add(new Account2(1004,"456465189"));
     System.out.println(li);
     Collections.sort(li,(o1,o2)->o2.getBalance()-o1.getBalance());
     System.out.println(li);
	}

}
