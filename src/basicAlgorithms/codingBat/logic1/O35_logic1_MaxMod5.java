/*
Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. 
However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2. 

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
 */
package basicAlgorithms.codingBat.logic1;

public class O35_logic1_MaxMod5 {

	public int maxMod5(int a, int b) {
		  if(a == b){
			  return 0;
		  }
		  if(a % 5 == b % 5){
			  return Math.min(a, b);
		  }
		  return Math.max(a, b);
	}

	public static void main(String[] args) {
		/*
		maxMod5(2, 3) → 3	3	OK	    
		maxMod5(6, 2) → 6	6	OK	    
		maxMod5(3, 2) → 3	3	OK	    
		maxMod5(8, 12) → 12	12	OK	    
		maxMod5(7, 12) → 7	7	OK	    
		maxMod5(11, 6) → 6	6	OK	    
		maxMod5(2, 7) → 2	2	OK	    
		maxMod5(7, 7) → 0	0	OK	    
		maxMod5(9, 1) → 9	9	OK	    
		maxMod5(9, 14) → 9	9	OK	    
		maxMod5(1, 2) → 2	2	OK
		 */

	}

}
