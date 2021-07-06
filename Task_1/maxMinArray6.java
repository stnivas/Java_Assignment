package newpack;

import java.util.Arrays;

public class maxMinArray6{

  public static void sixth(String[] args) {

	int mylist[] = {54, 24, -4, 0, 2, 45, 54, -9, 7};

	  System.out.println("Given Array : "+ Arrays.toString(mylist));

		int maxinlist = mylist[0];
	    int mininlist = mylist[0];


		 for(int i = 1; i < mylist.length; i++){

			 if(maxinlist < mylist[i]){
			   maxinlist = mylist[i];
			   }

			 else if(mininlist > mylist[i]){
			        mininlist = mylist[i];
			      }
			    }
	 System.out.println("Maximum number = "  + maxinlist + " Minimum number = " + mininlist);
			  }
	}