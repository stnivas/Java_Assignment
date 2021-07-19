public class ReverseCharString4 {

	public static void main(String[] args) {
		
		String mylist="java programming";
		
		System.out.println("String to Reverse Characters : " + mylist);
		
		String[] words=mylist.split(" ");
		String revString =" ";
		
		 for ( int i =0; i< words.length; i++) {
			 String word=words[i];
			 String revWord="";
			 
			 
			 
			 for (int j=word.length()-1; j>=0; j--) {
				 revWord=revWord + word.charAt(j);
				 
			 }
			 revString =revString +revWord+ " ";
		 }
		System.out.println("String After Characters are Reversed : " +revString);
	}

}

