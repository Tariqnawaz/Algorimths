/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
See also: Introduction to Mod 

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */
package basicAlgorithms.codingBat.logic1;

public class O23_logic1_NearTen {

	public boolean nearTen(int num) {
		  return num % 10 < 3 || num % 10 > 7;
	}

	public static void main(String[] args) {
		/*
		nearTen(12) → true	true	OK	    
		nearTen(17) → false	false	OK	    
		nearTen(19) → true	true	OK	    
		nearTen(31) → true	true	OK	    
		nearTen(6) → false	false	OK	    
		nearTen(10) → true	true	OK	    
		nearTen(11) → true	true	OK	    
		nearTen(21) → true	true	OK	    
		nearTen(22) → true	true	OK	    
		nearTen(23) → false	false	OK	    
		nearTen(54) → false	false	OK	    
		nearTen(155) → false	false	OK	    
		nearTen(158) → true	true	OK	    
		nearTen(3) → false	false	OK	    
		nearTen(1) → true	true	OK
		 */

	}

}
