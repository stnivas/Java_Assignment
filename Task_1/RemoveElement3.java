package newpack;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement3 {
	 
	public static void third(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] mylist= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		System.out.println("Original Array : "+Arrays.toString(mylist));
		System.out.println("Select index of above array to remove between 0 to " + mylist.length );

		int removeIndex = in.nextInt();

		System.out.println("Selected index is + "+removeIndex+ "and the value of the element is "+mylist[removeIndex]);

		for(int i = removeIndex; i < mylist.length -1; i++){
			mylist[i] = mylist[i + 1];
		}

		System.out.println("After removing the selected element: "+Arrays.toString(mylist));
	 }
	 }

