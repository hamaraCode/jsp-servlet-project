package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Predicate;

public class VoterDemo implements Comparable<VoterDemo>{
	private int age;
	 private String name;

	 public VoterDemo(int price, String maker) {
		this.age = price;
		this.name = maker;
	}
	
	public int getPrice() {
		return age;
	}

	public void setPrice(int price) {
		this.age = price;
	}

	public String getMaker() {
		return name;
	}

	public void setMaker(String maker) {
		this.name = maker;
	}

	@Override
	public String toString() {
		return "Price: "+age+" "+"Maker: "+name; 
	}
	
	
	  @Override
	    public boolean equals(Object o1) {
	       VoterDemo user=(VoterDemo) o1;
	        return this.age==user.age && user.name.equals(this.name);
	    }
	  @Override
	  public int hashCode() {
	        return this.name.hashCode();
	    }

	  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<VoterDemo> hs=new TreeSet<>();

		//Point no 1-------------------------------------------------
		hs.add(new VoterDemo(21,"First"));
	    hs.add(new VoterDemo(22,"Second"));
	    hs.add(new VoterDemo(85,"Third"));
	    hs.add(new VoterDemo(70,"Fourth"));
	    hs.add(new VoterDemo(35,"Fifth"));
	    hs.add(new VoterDemo(31,"Six"));

	    System.out.println("Original TreeSet ");
	    System.out.println(hs);
         System.out.println("-------------------------------------------------------------------------------");
		
         //Point no 2-------------------------------------------------
	    System.out.println("Enter age ");
	    int p=sc.nextInt();
      int count=0;
	     for(VoterDemo m:hs) {
		  if(m.age==p) {
			count++;
			  System.out.println("Age is: "+m.age+" Name is: "+m.name);
		     }
	     }
	     if(count==0) 
	    	 System.out.println("Age not found");

	     
         System.out.println("-------------------------------------------------------------------------------");
			//Point no 3-------------------------------------------------
         System.out.println("Non repeating TreeSet ");
	     Iterator<VoterDemo> it=hs.iterator();
	     while(it.hasNext()) {
		   System.out.println(it.next());
	       }

         System.out.println("-------------------------------------------------------------------------------");
			//Point no 4 -------------------------------------------------      
	      System.out.println("Enter Voter age to delete");
	      int del=sc.nextInt();
	      while(it.hasNext())
	        {
	            if(it.next().age==del)
	                it.remove();
	        }
		     System.out.println("After deleting the specified object");
		     System.out.println(hs);
		    
     }

@Override
public int compareTo(VoterDemo o) {
	return age-o.age;
}
	}