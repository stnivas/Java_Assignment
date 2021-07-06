package newpack;
 import java.util.Scanner;

  class Task1Runner{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your choice of Program");
		int choice=sc.nextInt();
		 
		 switch (choice) {
		 case 1:
			 System.out.println("Your choice is Program Number : " +choice + " and the Program is to Find index of an Array Element" );
			 FindTheIndex1 one = new FindTheIndex1();
			 one.main(args);
			 break;
			 
		 case 2:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to Sum value of Array Element");
			 SumValuesOfNumericArray2 sec = new SumValuesOfNumericArray2();
			 sec.second(args);
			 break;
		 

		case 3:
		 
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to Removing Specific element of an Array Element");
			 RemoveElement3 three = new RemoveElement3();
			 three.third(args);
			 break;
			 
		 case 4:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to Insert element into an Array Element");
			 InsertElement4 four = new InsertElement4();
			 four.fourth(args);
			 break;
                 

		case 5:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to Test Array Element");
			 ArrayContainValue5 five = new ArrayContainValue5();
			 five.fifth(args);
			 break;
			 
		 
		 case 6:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to find the maximum and minimum value of a numeric array");
			  maxMinArray6 six = new  maxMinArray6();
			  six.sixth(args);
			  break;
			 
		 case 7:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to find the common elements between two arrays");
		         FindCommenElement7 seven = new FindCommenElement7();
			 seven.seventh(args);
			 break;
             

         case 8:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to  find the common elements between two arrays of integers");
		         FindCommenElementInString7  seventwo = new FindCommenElementInString7();
			 seventwo.seventhsec(args);
			 break;
             

		 case 9:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to remove duplicate elements from an array.");
			 RemoveDuplicateElement8 eighth = new RemoveDuplicateElement8();
			 eighth.eight(args);
			 break;
			 
		 case 10:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to find the number of even and odd integers in a given array of integers");
			 FindNumberOfEvenAndOdd9  nine = new FindNumberOfEvenAndOdd9();
			 nine.ninth(args);
			 break;
			 
		 case 11:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to compute the average value of an array of integers except the largest and smallest values");
			 AverageValueOfArray10 ten = new  AverageValueOfArray10();
			 ten.tenth(args);
			 break;
			 
		 case 12:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to find the sum of the two elements of a given array which is equal to a  given integer");
			 SumTwoElementGivenArray11 eleven = new SumTwoElementGivenArray11();
			 eleven.eleventh(args);
			 break;
		 case 13:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to reverse an array of integer values.");
			 ReverseArray12 twelve = new ReverseArray12();
			 twelve.twelfth(args);
			 break;

			 
		 case 14:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to separate even and odd numbers of an array of integers");
			 SeparateEvenAndoddNumbers13 thirteen = new SeparateEvenAndoddNumbers13();
			 thirteen.thirteenth(args);
			 break;
		 case 15:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to sort a numeric array");
		         SortArray14 fourteen= new SortArray14();
			 fourteen.fourteenth(args);
			 break;
			 
		 case 16:
			 System.out.println("Your choice is Program Number : " +choice+ " and the Program is to print all the LEADERS in the array.");
			 LeaderElementFind15 fifteen = new LeaderElementFind15();
			 fifteen.fifteenth(args);
			 break;
		 }
      }
}

