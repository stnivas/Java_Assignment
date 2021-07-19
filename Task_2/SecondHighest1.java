import java.util.Scanner;

public class SecondHighest1 {

	public static void main(String[] args) {
		int n,max;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the size of array");
		n=input.nextInt();
		int myarray[]=new int[n];
		System.out.println("Enter the array element: ");
		for (int i=0;i<n;i++)                                                            
			myarray[i]=input.nextInt();
			
			
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++) {
					if(myarray[i]>myarray[j]) {
						max =myarray[i];
						myarray[i]=myarray[j];
						myarray[j]=max;
						
					}
				}
		}
System.out.println("Second Largest element in given array : "+ myarray[n-2]) ;                                                                       
	}

}
