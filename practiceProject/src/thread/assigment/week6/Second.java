package thread.assigment.week6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Second extends Thread{

	public void run() {
	synchronized (this) {
		try {
			FileReader fr;
			fr = new FileReader("E:\\f.txt");
			int i; 
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		this.notify();
	}
	}
	public static void main(String[] args) throws IOException {
    Second second= new Second();
    second.start();
    
 synchronized (second) {
try {
	second.wait();
	 FileWriter fw=new  FileWriter("E:\\f.txt");
	fw.write("Welcome to ram threading");
	fw.close();
} catch (InterruptedException e) {
	e.printStackTrace();
}	}
	} 
}
