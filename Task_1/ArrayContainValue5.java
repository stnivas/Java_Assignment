package newpack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayContainValue5{

public static void fifth(String[] args) {
	Scanner in = new Scanner(System.in);
  int[] myarray1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};

	System.out.println("Enter any number from below to check the status : "+ Arrays.toString(myarray1));

	System.out.println(contain(myarray1, in.nextInt()));

	System.out.println("Enter any random number to check the status : "+ Arrays.toString(myarray1));

	System.out.println(contain(myarray1, in.nextInt()));
		    }
  public static boolean contain(int[] arrays, int num){
		        for (int x: arrays){
		            if (x == num)
		                return true;
		        }
		        return false;
		    }
		}

	


