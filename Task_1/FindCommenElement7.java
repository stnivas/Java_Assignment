package newpack;

import java.util.Arrays;

public class FindCommenElement7 {

public static void seventh(String[] args) {
			 
			 
 int[] numArraylist1 = {1, 4, 5};

	System.out.println("Given Array list 1 : "+ Arrays.toString(numArraylist1));
	
	 int[] numArraylist2 = {6, 1, 8, 34, 5};

	System.out.println("Given Array list 2 : "+ Arrays.toString(numArraylist2));
			 
		 for(int i = 0; i < numArraylist1.length; i++){
			  
		 for(int j = 0; j < numArraylist2.length; j++){
			   
			  if(numArraylist1[i] == numArraylist2[j]){
			     System.out.println(numArraylist1[i]);
			     break;
			    }
			   }
			  }  
			 }
			}
