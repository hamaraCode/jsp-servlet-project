public class BreakString {

	public static void main(String[] args) {
		
         String str="abc";     //output a,b,c, ab, bc, ac, abc,7
         StringBuilder sb=new StringBuilder(str);
    
	 char[] ch=str.toCharArray();
	 int count=0;
	 for(int i=0; i<ch.length; i++) {
		 for(int j=i+1; j<=ch.length; j++) {
			 System.out.println(str.subSequence(i, j));
	 }
	}
 }
}
