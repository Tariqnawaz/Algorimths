/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives 
the left digit while the % "mod" n%10 gives the right digit.) 

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */
package basicAlgorithms.codingBat.logic1;

public class O39_logic1_ShareDigit {

	public boolean shareDigit(int a, int b) {
		  return ((a / 10 == b / 10) ||
				  (a / 10 == b % 10) ||
				  (a % 10 == b / 10) ||
				  (a % 10 == b % 10));
	}

	public static void main(String[] args) {
		/*
		shareDigit(12, 23) → true	true	OK	    
		shareDigit(12, 43) → false	false	OK	    
		shareDigit(12, 44) → false	false	OK	    
		shareDigit(23, 12) → true	true	OK	    
		shareDigit(23, 39) → true	true	OK	    
		shareDigit(23, 19) → false	false	OK	    
		shareDigit(30, 90) → true	true	OK	    
		shareDigit(30, 91) → false	false	OK	    
		shareDigit(55, 55) → true	true	OK	    
		shareDigit(55, 44) → false	false	OK
		 */

	}

}
