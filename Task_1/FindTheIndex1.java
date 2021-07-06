package newpack;
import java.util.Scanner;
import java.util.Arrays;
public class FindTheIndex1{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);

           int studentid[] = {34, 56, 99, 56, 13, 33, 60, 90,};
           System.out.println("Please enter the any number from this : " + Arrays.toString(studentid));

           int b = in.nextInt();

           for (int i = 0; i < studentid.length; i++) {

               if (b == studentid[i]) {

                   System.out.println("index of " +b +" is : " +i);

               }
           }
 	  }
}
