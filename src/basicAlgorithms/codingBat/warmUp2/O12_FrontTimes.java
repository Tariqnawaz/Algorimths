/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string
is less than length 3. Return n copies of the front; 

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
package basicAlgorithms.codingBat.warmUp2;

public class O12_FrontTimes {
	public static String frontTimes(String str, int n) {
		  String result = "";
		  for(int i = 1 ; i<=n ; i++){
		    if(str.length() >= 3){
		       String firstThree = str.substring(0,3);
		       result += firstThree;
		    }else{
		       result += str;
		    }
		  }
		  return result;
		}

	/*coding bat solution
	 public String frontTimes(String str, int n) {
	  int frontLen = 3;
	  if (frontLen > str.length()) {
	    frontLen = str.length();
	  }
	  String front = str.substring(0, frontLen);
	  
	  String result = "";
	  for (int i=0; i<n; i++) {
	    result = result + front;
	  }
	  return result;
	}
	 */
	public static void main(String[] args) {
		System.out.println("Return n copies of the front:- "+frontTimes("Chocolate", 2));
		System.out.println("Return n copies of the front:- "+frontTimes("Chocolate", 3));
		System.out.println("Return n copies of the front:- "+frontTimes("Abc", 3));
		System.out.println("Return n copies of the front:- "+frontTimes("Ab", 4));
		System.out.println("Return n copies of the front:- "+frontTimes("A", 4));
		System.out.println("Return n copies of the front:- "+frontTimes("", 4));
		System.out.println("Return n copies of the front:- "+frontTimes("Abc", 0));
		
	}

}
