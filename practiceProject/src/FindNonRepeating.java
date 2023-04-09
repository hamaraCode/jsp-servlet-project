public class FindNonRepeating {
	public static void main(String[] args) {
     String str="deepak";
     char[] ch=str.toCharArray();
     int count=0;
     for(int i=0; i<ch.length;i++) {
    	count=0;
    	 for(int j=i+1;j<ch.length; j++) {
    		 if(ch[i]==ch[j]){
    			 count++;
    		   }
    	 }
    	 if(count==0) {
    		 System.out.println("Char is :- "+ch[i]+" and the index is :-"+i);
    	 break;
    	 }
     }
	}
}
