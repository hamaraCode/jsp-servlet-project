public class secondMax {
	
public static void main(String[] args) {
	int arr[]= {5,5,1,4,3,2};
	int len=arr.length;
    
	int max=arr[0];
    int smax=arr[1];
    
    for(int i=0; i<len; i++){
    	if(max<arr[i]){
    		smax=max;  
    		max=arr[i];
    	}
    	else if(smax<arr[i]&&arr[i]!=max){
    		smax=arr[i];
    	}
    	else {
    		
    	}
    }
    System.out.println("Max is "+max);
    System.out.println("Second max is"+smax);
    }    
}
