 package newpack; 
	import java.util.Arrays;
	import java.util.Scanner;

 public class SeparateEvenAndoddNumbers13{
			
			 public static void thirteenth(String[] args)
		     {

				 Scanner sc = new Scanner(System.in);

				 System.out.print("Enter size of the array: ");
				 int n = sc.nextInt();
				 int nums[] = new int[n];
				 System.out.println("Enter array elements: ");

				 for (int i = 0; i < n; ++i) {
					 nums[i] = sc.nextInt();
				 }
		        int result[];
		        System.out.println("Original Array ");
		        System.out.println(Arrays.toString(nums));

		        result = separateoddeven(nums);
		 
		        System.out.print("Array after separation ");
		        System.out.println(Arrays.toString(result));
		    }
			
		    static int [] separateoddeven(int value[])
		    {
		        int leftside = 0, rightside = value.length - 1;
		        while (leftside < rightside)
		        {
		            while (value[leftside]%2 == 0 && leftside < rightside)
		                leftside++;
		 
		            while (value[rightside]%2 == 1 && leftside < rightside)
		                rightside--;
		 
		            if (leftside < rightside)
		            {
		                int temp = value[leftside];
		                value[leftside] = value[rightside];
		                value[rightside] = temp;
		                leftside++;
		                rightside--;
		            }
		        }
		        return value;
		    }
		}

