/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19. 

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */
package basicAlgorithms.codingBat.logic1;

public class O24_logic1_TeenSum {

	public int teenSum(int a, int b) {
		  if((( a > 12) && ( a < 20)) || (( b > 12) && ( b < 20))){
			  return 19;
		  }
		  return a + b;
	}

	public static void main(String[] args) {
		/*
		teenSum(3, 4) → 7	7	OK	    
		teenSum(10, 13) → 19	19	OK	    
		teenSum(13, 2) → 19	19	OK	    
		teenSum(3, 19) → 19	19	OK	    
		teenSum(13, 13) → 19	19	OK	    
		teenSum(10, 10) → 20	20	OK	    
		teenSum(6, 14) → 19	19	OK	    
		teenSum(15, 2) → 19	19	OK	    
		teenSum(19, 19) → 19	19	OK	    
		teenSum(19, 20) → 19	19	OK	    
		teenSum(2, 18) → 19	19	OK	    
		teenSum(12, 4) → 16	16	OK	    
		teenSum(2, 20) → 22	22	OK	    
		teenSum(2, 17) → 19	19	OK	    
		teenSum(2, 16) → 19	19	OK	    
		teenSum(6, 7) → 13	13	OK
		 */

	}

}
