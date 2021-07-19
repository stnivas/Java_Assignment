
import java.util.Arrays;
	 
public class sortArrayOfPasitiveInteger3{

	  static void rearrange(int[] array, int num) {
	    
      
	     int value[] = array.clone();
	     int small = 0, large = num - 1;
	     boolean first = true;
	 
	        
	      for (int i = 0; i < num; i++) {
	            if (first)
	                array[i] = value[large--];
	            else
	                array[i] = value[small++];
	 
	          
	        }
	    }
	
	  public static void main(String[] args)
	    {
	        int mylist[] = new int[] {5,10,15,20,25,30,35,40,45,50 };
	 
	   System.out.println("Array Before Sorting : ");
	        System.out.println(Arrays.toString(mylist));
	 
	        rearrange(mylist, mylist.length);

	        System.out.println("Array After Sorting  ");
	        System.out.println(Arrays.toString(mylist));
	    }
	}


