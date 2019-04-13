/*

Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that 
if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5. 

inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true
 */
package basicAlgorithms.codingBat.logic1;

public class O31_logic1_InOrderEqual {

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  return (!equalOk && a < b && b < c) || (equalOk && a <= b && b <=c);
	}

	public static void main(String[] args) {
		/*
		inOrderEqual(2, 5, 11, false) → true	true	OK	    
		inOrderEqual(5, 7, 6, false) → false	false	OK	    
		inOrderEqual(5, 5, 7, true) → true	true	OK	    
		inOrderEqual(5, 5, 7, false) → false	false	OK	    
		inOrderEqual(2, 5, 4, false) → false	false	OK	    
		inOrderEqual(3, 4, 3, false) → false	false	OK	    
		inOrderEqual(3, 4, 4, false) → false	false	OK	    
		inOrderEqual(3, 4, 3, true) → false	false	OK	    
		inOrderEqual(3, 4, 4, true) → true	true	OK	    
		inOrderEqual(1, 5, 5, true) → true	true	OK	    
		inOrderEqual(5, 5, 5, true) → true	true	OK	    
		inOrderEqual(2, 2, 1, true) → false	false	OK	    
		inOrderEqual(9, 2, 2, true) → false	false	OK	    
		inOrderEqual(0, 1, 0, true) → false	false	OK
		 */

	}

}
