 package newpack;

 import java.util.Scanner;

 public class ReverseArray12{
			 
		 public static void twelfth (String[] args) {


			 Scanner sc = new Scanner(System.in);

			 System.out.print("Enter size of the array: ");
			 int n = sc.nextInt();
			 int numbers[] = new int[n];
			 System.out.println("Enter array elements: ");

			 for (int i = 0; i < n; ++i) {
				 numbers[i] = sc.nextInt();
			 }
		      System.out.println("Original array: ");
		      for (int i = 0; i < numbers.length; i++) {
		    	System.out.print(numbers[i] + " ");
		        }
		      System.out.println("Array in reverse order: ");
		         
				
		    for (int i = numbers.length-1; i >= 0; i--) {
		  	System.out.print(numbers[i] + " ");
		        }  
		    } 

		}
