package newpack;
import java.util.*;
import java.io.*; 

		 public class AverageValueOfArray10{
		 public static void tenth(String[] args)
		 {
			 Scanner sc = new Scanner(System.in);

			 System.out.print("Enter size of the array: ");
			 int n = sc.nextInt();
			 int numbers[] = new int[n];
			 System.out.println("Enter array elements: ");

			 for (int i = 0; i < n; ++i) {
				 numbers[i] = sc.nextInt();
			 }
			 average(numbers);
		 }

		 public static void average(int input[]){
			 int sum = 0;
			 for(int i=0; i < input.length ; i++)
				 sum = sum + input[i];
			 double average = sum / input.length;
			 System.out.println("Average value of the array elements is : " + average);
		 }
		}


