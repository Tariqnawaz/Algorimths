/*
Given a string, return a new string where the first and last chars have been exchanged. 

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

package basicAlgorithms.codingBat.warmUp1;

public class O21_FrontBack {

	public static String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}
	public static void main(String[] args) {
	System.out.println("the first and last chars have been exchanged:- " + frontBack("code"));
	System.out.println("the first and last chars have been exchanged:- " + frontBack("a") );
	System.out.println("the first and last chars have been exchanged:- " + frontBack("ab"));
	System.out.println("the first and last chars have been exchanged:- " + frontBack("abc"));
	System.out.println("the first and last chars have been exchanged:- " + frontBack(""));
	System.out.println("the first and last chars have been exchanged:- " + frontBack("Chocolate") );
	System.out.println("the first and last chars have been exchanged:- " + frontBack("aavJ"));
	System.out.println("the first and last chars have been exchanged:- " + frontBack("hello"));
	}

}
