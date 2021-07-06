package newpack;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement4{
 
public static void fourth(String[] args) {

    Scanner in = new Scanner(System.in);

   int[] myarray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};


  System.out.println("Original Array : "+Arrays.toString(myarray));

    System.out.println("Select index of above array to add an element between 0 to " + myarray.length );

    int Indexposition = in.nextInt();

    System.out.println("Enter the number to add to the element list " );

    int newValue = in.nextInt();
   
  for(int i=myarray.length-1; i > Indexposition; i--){
	  
    myarray[i] = myarray[i-1];
   }
   myarray[Indexposition] = newValue;
   System.out.println("New Array: "+Arrays.toString(myarray));
 
 
	}

}
