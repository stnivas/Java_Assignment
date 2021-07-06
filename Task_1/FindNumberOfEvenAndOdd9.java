package newpack;
import java.util.Arrays;
import java.util.Scanner;

public class  FindNumberOfEvenAndOdd9{
 public static void ninth(String[] args)
 {
	 Scanner sc = new Scanner(System.in);

	 System.out.print("Enter size of the array: ");
	 int n = sc.nextInt();

	 int numbers[] = new int[n];
	 System.out.println("Enter array elements: ");
	 for (int i = 0; i < n; ++i) {
		 numbers[i] = sc.nextInt();
	 }
	 displayOddEven(numbers);
	 sc.close();
 }
	public static void displayOddEven(int[] numbers) {
		// traverse through the array
		for (int i : numbers) {
			if (i % 2 == 0)       // even
				System.out.println(i + ": Even");
			else               // odd
				System.out.println(i + ": Odd");
		}
 }
}