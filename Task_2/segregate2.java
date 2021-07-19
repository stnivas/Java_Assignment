import java.util.Arrays;

public class segregate2 {

	public static void main(String[] args) {
		
		int myarraylist[]= {0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		System.out.println("Array Before Segregating : " +Arrays.toString(myarraylist));
		int myvalue=0;
		for(int value=0; value<myarraylist.length;value++) {
			if(myarraylist[value]==0) {
				myarraylist[myvalue++]=myarraylist[value];
			}
		}

		while(myvalue<myarraylist.length) {
			myarraylist[myvalue++]=1;
		}
		System.out.print("Array Before Segregating : ");
		for(int values=0;values<myarraylist.length;values++) {
			
			System.out.print(myarraylist[values]+  "  ");
		}
	}

}
