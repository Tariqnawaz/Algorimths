/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod 

old35(3) → true
old35(10) → true
old35(15) → false
 */
package basicAlgorithms.codingBat.logic1;

public class O21_logic1_Old35 {

	public boolean old35(int n) {
		return (n % 3 == 0 || n % 5 == 0) && n % (3 * 5) !=0; 
	}

	public static void main(String[] args) {
		/*
		old35(3) → true	true	OK	    
		old35(10) → true	true	OK	    
		old35(15) → false	false	OK	    
		old35(5) → true	true	OK	    
		old35(9) → true	true	OK	    
		old35(8) → false	false	OK	    
		old35(7) → false	false	OK	    
		old35(6) → true	true	OK	    
		old35(17) → false	false	OK	    
		old35(18) → true	true	OK	    
		old35(29) → false	false	OK	    
		old35(20) → true	true	OK	    
		old35(21) → true	true	OK	    
		old35(22) → false	false	OK	    
		old35(45) → false	false	OK	    
		old35(99) → true	true	OK	
		 */

	}

}
