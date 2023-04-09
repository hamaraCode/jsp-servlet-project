package thread.assigment.week6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecondB extends Thread{

	public void run() {
	synchronized (this) {
		try {
			 FileWriter fw=new  FileWriter("E:\\f.txt");
				fw.write("Welcome to outside threading");
				fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		this.notify();
	}
	}
	public static void main(String[] args)  {
    SecondB second= new SecondB();
    second.start();
    
 synchronized (second) {
try {
	second.wait();
	 FileWriter fw1=new  FileWriter("E:\\f.txt");
		fw1.write("Welcome to Main threading");
		fw1.close();
} catch (Exception e) {
	e.printStackTrace();
}	}
	} 
}
