/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the 
remainder, e.g. 17 % 10 is 7. 

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */
package basicAlgorithms.codingBat.logic1;

public class O32_logic1_LastDigit {

	public boolean lastDigit(int a, int b, int c) {
		  return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
	}

	public static void main(String[] args) {
		/*
		lastDigit(23, 19, 13) → true	true	OK	    
		lastDigit(23, 19, 12) → false	false	OK	    
		lastDigit(23, 19, 3) → true	true	OK	    
		lastDigit(23, 19, 39) → true	true	OK	    
		lastDigit(1, 2, 3) → false	false	OK	    
		lastDigit(1, 1, 2) → true	true	OK	    
		lastDigit(1, 2, 2) → true	true	OK	    
		lastDigit(14, 25, 43) → false	false	OK	    
		lastDigit(14, 25, 45) → true	true	OK	    
		lastDigit(248, 106, 1002) → false	false	OK	    
		lastDigit(248, 106, 1008) → true	true	OK	    
		lastDigit(10, 11, 20) → true	true	OK	    
		lastDigit(0, 11, 0) → true	true	OK	
		 */

	}

}
