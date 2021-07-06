
     package newpack;
		import java.util.Arrays;
		import java.util.Scanner;

	 public class SortArray14
		{   
		public static void fourteenth(String[] args)   
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter size of the array: ");
			int n = sc.nextInt();
			int nums[] = new int[n];
			System.out.println("Enter array elements: ");

			for (int i = 0; i < n; ++i) {
				nums[i] = sc.nextInt();
			}
		Arrays.sort(nums);
		System.out.println("Elements of array sorted in ascending order: ");  

		for (int i = 0; i < nums.length; i++)
		{       
		System.out.println(nums[i]);
		 }   
		 }  
		}