package newpack;

public class  SumTwoElementGivenArray11 {

		static void check(int[] arr,int num){
			for(int i = 0;i < arr.length;i++){
			for(int x = 0;x < arr.length;x++){
				if(arr[i] + arr[x] == num){
					System.out.println("Index 1 : "+i+" Index 2 : "+x);
					}
				}
			}

		}
		public static void eleventh(String[] args) {
			int[] arr = {1,2,3,4,5,6};
				check(arr,6);
			}
		}

