/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or 
more. Note: Math.abs(num) computes the absolute value of a number. 

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */
package basicAlgorithms.codingBat.logc2;

public class O16_Logic2_CloseFar {

	public boolean closeFar(int a, int b, int c) {
		  return (Math.abs(a - b) < 2 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) ||
				  (Math.abs(a - c) < 2 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1);
	}
	
	public static void main(String[] args) {
		/*
		closeFar(1, 2, 10) → true	true	OK	    
		closeFar(1, 2, 3) → false	false	OK	    
		closeFar(4, 1, 3) → true	true	OK	    
		closeFar(4, 5, 3) → false	false	OK	    
		closeFar(4, 3, 5) → false	false	OK	    
		closeFar(-1, 10, 0) → true	true	OK	    
		closeFar(0, -1, 10) → true	true	OK	    
		closeFar(10, 10, 8) → true	true	OK	    
		closeFar(10, 8, 9) → false	false	OK	    
		closeFar(8, 9, 10) → false	false	OK	    
		closeFar(8, 9, 7) → false	false	OK	    
		closeFar(8, 6, 9) → true	true	OK	 
		 */

	}

}
