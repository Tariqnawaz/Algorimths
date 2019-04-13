/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others. 

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */
package basicAlgorithms.codingBat.logic1;

public class O33_logic1_LessBy10 {

	public boolean lessBy10(int a, int b, int c) {
		  return Math.abs(a-b) >9 || Math.abs(a-c) >9 ||Math.abs(b-c) >9;
	}

	public static void main(String[] args) {
		/*
		lessBy10(1, 7, 11) → true	true	OK	    
		lessBy10(1, 7, 10) → false	false	OK	    
		lessBy10(11, 1, 7) → true	true	OK	    
		lessBy10(10, 7, 1) → false	false	OK	    
		lessBy10(-10, 2, 2) → true	true	OK	    
		lessBy10(2, 11, 11) → false	false	OK	    
		lessBy10(3, 3, 30) → true	true	OK	    
		lessBy10(3, 3, 3) → false	false	OK	    
		lessBy10(10, 1, 11) → true	true	OK	    
		lessBy10(10, 11, 1) → true	true	OK	    
		lessBy10(10, 11, 2) → false	false	OK	    
		lessBy10(3, 30, 3) → true	true	OK	    
		lessBy10(2, 2, -8) → true	true	OK	    
		lessBy10(2, 8, 12) → true	true	OK
		 */

	}

}
