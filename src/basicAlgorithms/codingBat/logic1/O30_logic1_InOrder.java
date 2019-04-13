/*
Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be 
greater than a. 

inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
 */
package basicAlgorithms.codingBat.logic1;

public class O30_logic1_InOrder {

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  return (!bOk && b > a && c > b) || (bOk &&  c > b);
	}

	public static void main(String[] args) {
		/*
		inOrder(1, 2, 4, false) → true	true	OK	    
		inOrder(1, 2, 1, false) → false	false	OK	    
		inOrder(1, 1, 2, true) → true	true	OK	    
		inOrder(3, 2, 4, false) → false	false	OK	    
		inOrder(2, 3, 4, false) → true	true	OK	    
		inOrder(3, 2, 4, true) → true	true	OK	    
		inOrder(4, 2, 2, true) → false	false	OK	    
		inOrder(4, 5, 2, true) → false	false	OK	    
		inOrder(2, 4, 6, true) → true	true	OK	    
		inOrder(7, 9, 10, false) → true	true	OK	    
		inOrder(7, 5, 6, true) → true	true	OK	    
		inOrder(7, 5, 4, true) → false	false	OK
		 */

	}

}
