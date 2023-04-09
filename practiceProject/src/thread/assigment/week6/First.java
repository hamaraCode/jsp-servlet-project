package thread.assigment.week6;

public class First {

	public static void main(String[] args) {
    int num=3;
    try {
		for(int i=num;i>=0;i--) {
			for(int j=i; j>0;j--) {
					Thread.sleep(2000);
				System.out.print("*");
			}
			System.out.println();
		}
    }
	catch (InterruptedException e) {
		e.printStackTrace();
	}

	}

}
