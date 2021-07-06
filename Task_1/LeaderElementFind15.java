 package newpack;

 import java.util.Scanner;

 public class LeaderElementFind15{

public static void fifteenth (String[]args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter size of the array: ");
	int n = sc.nextInt();
	int nums[] = new int[n];
	System.out.println("Enter array elements: ");

	for (int i = 0; i < n; ++i) {
		nums[i] = sc.nextInt();
	}
	for (int i = 0; i < nums.length; i++) {
		boolean isLeader=true;
		for (int j = i+1; j < nums.length; j++) {
			if(nums[i] <= nums[j])
			{
				isLeader=false;
				break;
			}
		}
		if(isLeader)
			System.out.print(nums[i]+" ");
	}
}
}


