package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class Mobile {
	private int price;
	 private String maker;

	 public Mobile(int price, String maker) {
		this.price = price;
		this.maker = maker;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Price: "+price+" "+"Maker: "+maker; 
	}
	
	

	  @Override
	    public boolean equals(Object o1) {
	       Mobile user=(Mobile) o1;
	        return this.price==user.price && user.maker.equals(this.maker);
	    }
	  @Override
	  public int hashCode() {
	        return this.maker.hashCode();
	    }

	  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Mobile> hs=new HashSet<>();

		//Point no 1-------------------------------------------------
		hs.add(new Mobile(12000,"Realmi"));
	    hs.add(new Mobile(18000,"Redmi"));
	    hs.add(new Mobile(21000,"Vivo"));
	    hs.add(new Mobile(7000,"Redmi"));
	    hs.add(new Mobile(35000,"One plus"));
	    hs.add(new Mobile(35000,"One plus"));

	    System.out.println("Original Hashset ");
	    System.out.println(hs);
         System.out.println("-------------------------------------------------------------------------------");
		//Point no 2-------------------------------------------------
	    System.out.println("Enter price ");
	    int p=sc.nextInt();
      int count=0;
	     for(Mobile m:hs) {
		  if(m.price==p) {
			count++;
			  System.out.println("Price is: "+m.price+" Mobile is: "+m.maker);
		     }
	     }
	     if(count==0) 
	    	 System.out.println("Price not found");

	     
         System.out.println("-------------------------------------------------------------------------------");
			//Point no 3-------------------------------------------------
         System.out.println("Non repeating Hashset ");
	     Iterator<Mobile> it=hs.iterator();
	     while(it.hasNext()) {
		   System.out.println(it.next());
	       }

         System.out.println("-------------------------------------------------------------------------------");
			//Point no 4 -------------------------------------------------      
	      System.out.println("Enter mobile price to delete");
	      int del=sc.nextInt();
	      while(it.hasNext())
	        {
	            if(it.next().price==del)
	                it.remove();
	        }
		     System.out.println("After deleting the specified object");
		    System.out.println(hs);
     }
	}