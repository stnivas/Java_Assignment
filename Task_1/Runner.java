import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of the array: ");
            int n = sc.nextInt();
            int numbers[] = new int[n];
            System.out.println("Enter array elements: ");

            for (int i = 0; i < n; ++i) {
                numbers[i] = sc.nextInt();
            }
            average(numbers);
        }

        public static void average(int input[]){
            int sum = 0;
            for(int i=0; i < input.length ; i++)
                sum = sum + input[i];
            //calculate average value
            double average = sum / input.length;
            System.out.println("Average value of the array elements is : " + average);
        }

//    public static int[] arrayinput(){
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter length of String array");
//
//        int length = in.nextInt();
//
//        String[] input = new String[length];
//        System.out.println("Please enter Element of String array");
//
//        for (int i = 0; i < length; i++) {
//            String userInput = in.next();
//            input[i] = userInput;
//        }
//        System.out.println("The String array from the input is : ");
//
//        System.out.println(Arrays.toString(input));
//        return input;
//    }

}


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter length of String array");
//
//        int length = in.nextInt();
//
//        String[] input = new String[length];
//
//        int[] array = new int[10];
//        System.out.println("Please enter Element of String array");
//
//        for (int i = 0; i < length; i++) {
//            String userInput = in.next();
//            input[i] = userInput;
//        }
//        System.out.println("The String array from the input is : ");
//
//        System.out.println(Arrays.toString(input));
//
//        int n = input.length;
//        System.out.println("Minimum element of array: " + getMin(input,n);
//        System.out.println("Maximum element of array: " +
//    }
//    static int getMin(int[] arr, int n) {
//        return Arrays.stream(arr).min().getAsInt();
//    }
//
//    static int getMax(int arr[], int n) {
//        return Arrays.stream(arr).max().getAsInt();
//    }
