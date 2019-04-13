/*

We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. 
Use the % "mod" operator -- see Introduction to Mod 

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
 */
package basicAlgorithms.codingBat.logic1;

public class O19_logic1_SpecialEleven {

	public boolean specialEleven(int n) {
		  return  n % 11 < 2;
	}

	public static void main(String[] args) {
		/*
		specialEleven(22) → true	true	OK	    
		specialEleven(23) → true	true	OK	    
		specialEleven(24) → false	false	OK	    
		specialEleven(21) → false	false	OK	    
		specialEleven(11) → true	true	OK	    
		specialEleven(12) → true	true	OK	    
		specialEleven(10) → false	false	OK	    
		specialEleven(9) → false	false	OK	    
		specialEleven(8) → false	false	OK	    
		specialEleven(0) → true	true	OK	    
		specialEleven(1) → true	true	OK	    
		specialEleven(2) → false	false	OK	    
		specialEleven(121) → true	true	OK	    
		specialEleven(122) → true	true	OK	    
		specialEleven(123) → false	false	OK	    
		specialEleven(46) → false	false	OK	    
		specialEleven(49) → false	false	OK	    
		specialEleven(52) → false	false	OK	    
		specialEleven(54) → false	false	OK	    
		specialEleven(55) → true	true	OK	 
		 */

	}

}
