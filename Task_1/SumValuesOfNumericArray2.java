package newpack;
import java.util.Arrays;
class SumValuesOfNumericArray2 {  
    public static void second(String[] args) {  
        
	    int[] arr = new int[]{1, 2, 3, 4, 5};
	           int sum = 0;
	           System.out.println("Array Elements : " + Arrays.toString(arr));
	           for (int i = 0; i < arr.length; i++) {
	               sum = sum + arr[i];
	           }
	           System.out.println("Sum of all the elements of an array: " + sum);
		   }
 } 
  