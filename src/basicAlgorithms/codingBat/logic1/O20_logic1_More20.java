/*

Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod 

more20(20) → false
more20(21) → true
more20(22) → true

 */
package basicAlgorithms.codingBat.logic1;

public class O20_logic1_More20 {

	public boolean more20(int n) {
		  return n % 20 == 1 || n % 20 ==2;
	}

	public static void main(String[] args) {
		/*
		more20(20) → false	false	OK	    
		more20(21) → true	true	OK	    
		more20(22) → true	true	OK	    
		more20(23) → false	false	OK	    
		more20(25) → false	false	OK	    
		more20(30) → false	false	OK	    
		more20(31) → false	false	OK	    
		more20(59) → false	false	OK	    
		more20(60) → false	false	OK	    
		more20(61) → true	true	OK	    
		more20(62) → true	true	OK	    
		more20(1020) → false	false	OK	    
		more20(1021) → true	true	OK	    
		more20(1000) → false	false	OK	    
		more20(1001) → true	true	OK	    
		more20(50) → false	false	OK	    
		more20(55) → false	false	OK	    
		more20(40) → false	false	OK	    
		more20(41) → true	true	OK	    
		more20(39) → false	false	OK	    
		more20(42) → true	true	OK	 
		 */

	}

}
