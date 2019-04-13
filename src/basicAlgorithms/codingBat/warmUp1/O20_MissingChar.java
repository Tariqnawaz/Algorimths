/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char
in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 

missingChar("kitten", 1) = "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
package basicAlgorithms.codingBat.warmUp1;

public class O20_MissingChar {
	public static String missingChar(String str, int n) {
		  if(n < str.length()){
		  String fornt = str.substring(0,n);
		  String back = str.substring(n+1 , str.length());
		  return fornt + back;
		  }
		  return str;
		}
	/*coding bat solution
	 public String missingChar(String str, int n) {
	  String front = str.substring(0, n);
	  
	  // Start this substring at n+1 to omit the char.
	  // Can also be shortened to just str.substring(n+1)
	  // which goes through the end of the string.
	  String back = str.substring(n+1, str.length());
	  
	  return front + back;
	}
	 */
	public static void main(String[] args) {
		System.out.println("the char at index n has been removed:- " + missingChar("kitten", 1));
		System.out.println("the char at index n has been removed:- " + missingChar("kitten", 0));
		System.out.println("the char at index n has been removed:- " + missingChar("kitten", 4));
		System.out.println("the char at index n has been removed:- " + missingChar("Hi", 0));
		System.out.println("the char at index n has been removed:- " + missingChar("Hi", 1));
		System.out.println("the char at index n has been removed:- " + missingChar("code", 0));
		System.out.println("the char at index n has been removed:- " + missingChar("code", 1));
		System.out.println("the char at index n has been removed:- " + missingChar("code", 2));
		System.out.println("the char at index n has been removed:- " + missingChar("code", 3) );
		System.out.println("the char at index n has been removed:- " + missingChar("chocolate", 8));
		
	}

}
