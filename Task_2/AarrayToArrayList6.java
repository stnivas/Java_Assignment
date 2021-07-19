import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AarrayToArrayList6 {

	public static void main(String[] args) {
		
		String [] myanimals= {"dog","cat","goat","cow","hourse","ox"};
		
		System.out.println(Arrays.toString(myanimals));
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		List<String>myanimallist=Arrays.asList(myanimals);
	
		System.out.println("Length of the Array : " + myanimallist.size());
		
		System.out.println("Choose any number between 0 to "+myanimallist.size());
		
		int choosednNumber =input.nextInt();
		
		System.out.println(myanimallist.get(choosednNumber));
		
	}
}