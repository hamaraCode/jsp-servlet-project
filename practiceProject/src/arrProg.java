
public class arrProg {

	public static void main(String[] args) {
     int arr[]=new int[15];
	for(int i=0; i<15; i++) {
		arr[i]=((int)(Math.random()*50));
		
	}
	System.out.println("Random unique elements are ");
	for(int i=0; i<15; i++) {
		for(int j=0; j<=i; j++) {
			if(arr[i]==arr[j])
				arr[i]=((int)(Math.random()*50));
		}
		System.out.println(arr[i]);
	}
	
	}
}
