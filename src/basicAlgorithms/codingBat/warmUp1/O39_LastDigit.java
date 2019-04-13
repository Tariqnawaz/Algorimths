/*

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator 
computes remainders, so 17 % 10 is 7. 

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
package basicAlgorithms.codingBat.warmUp1;

public class O39_LastDigit {
	public static boolean lastDigit(int a, int b) {
		  if(a%10 == b%10){
		  return true;
		  }
		  return false;
		}
	/*coding bat solution
	 public boolean lastDigit(int a, int b) {
	  // True if the last digits are the same
	  return(a % 10 == b % 10);
	}
	 */
	public static void main(String[] args) {
		System.out.println("return true if they have the same last digit:- "+lastDigit(7, 17));
		System.out.println("return true if they have the same last digit:- "+lastDigit(6, 17));
		System.out.println("return true if they have the same last digit:- "+lastDigit(3, 113));
		System.out.println("return true if they have the same last digit:- "+lastDigit(114, 113));
		System.out.println("return true if they have the same last digit:- "+lastDigit(114, 4));
		System.out.println("return true if they have the same last digit:- "+lastDigit(10, 0));
		System.out.println("return true if they have the same last digit:- "+lastDigit(11, 0));
		
	}

}
