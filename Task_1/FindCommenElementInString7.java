package newpack;

public class FindCommenElementInString7 {

public static void seventhsec(String[] args) {
		
	String[] numArray1 = {"Java", "c++", "Python","SQL"};
	String[] numArray2 = {".Net", "c++", "Clojure", "Java", "Java Script", "Python","SQL"};
		  
	 for(int firstone = 0; firstone < numArray1.length; firstone++){
	 for(int secondone = 0; secondone < numArray2.length; secondone++){
		   
	 if(numArray1[firstone].equals(numArray2[secondone])){
		 
		 System.out.println(numArray1[firstone]);
		  break;
		    }
		   }
		  }
		 }
		}

