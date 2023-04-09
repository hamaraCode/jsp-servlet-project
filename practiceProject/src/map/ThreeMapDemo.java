package map;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

class Student implements Comparable<Student>{
      private int rollno;
      private char division;
	public Student(int rollno, char division) {
		this.rollno = rollno;
		this.division = division;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	
	@Override
	public String toString() {
		return "rollno=" + rollno + ", division=" + division ;
	}
	@Override
	public int compareTo(Student o) {
		return rollno-o.rollno;
	} 
      
}
public class ThreeMapDemo {

	public static void main(String[] args) {
    TreeMap<Student, String> treeMap=new TreeMap<>();
    treeMap.put(new Student(101,'A'), "First");
    treeMap.put(new Student(105,'E'), "Fifth");
    treeMap.put(new Student(103,'C'), "Third");
    treeMap.put(new Student(104,'D'), "Forth");
	treeMap.put(new Student(102,'B'), "Second");
	System.out.println("Displaying the key set");
	System.out.println(treeMap.keySet());
	  
	System.out.println("Displaying All sorted entries ");
System.out.println(treeMap);
	}

}
