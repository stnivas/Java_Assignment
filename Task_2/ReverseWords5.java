public class ReverseWords5 {

	public static void main(String[] args) {
		String strList= "java is object oriented";
		
		System.out.print("String to Reverse Words : ");
		
		String strlist1="";
		String a[]=strList.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ") ;
		
		}
		System.out.println("");
		
		for (int i=a.length-1; i>=0; i--)
		{
			strlist1 = strlist1 + a[i] + " ";
		}
			System.out.println("String After Words are Reversed : " +strlist1);

		
	}

}