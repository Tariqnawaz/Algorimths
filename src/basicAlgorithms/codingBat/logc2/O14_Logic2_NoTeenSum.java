/*
Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 
15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. 
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum(). 

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
 */
package basicAlgorithms.codingBat.logc2;

public class O14_Logic2_NoTeenSum {

	public int noTeenSum(int a, int b, int c) {
		  if(((a > 12) && (a < 15)) || ((a > 16) && (a < 20))){
			  a = 0;
		  }
		  if(((b > 12) && (b < 15)) || ((b > 16) && (b < 20))){
			  b = 0;
		  }
		  if(((c > 12) && (c < 15)) || ((c > 16) && (c < 20))){
			  c = 0;
		  }
		  return a + b +c ;
	}

	public static void main(String[] args) {
		/*
		noTeenSum(1, 2, 3) → 6	6	OK	    
		noTeenSum(2, 13, 1) → 3	3	OK	    
		noTeenSum(2, 1, 14) → 3	3	OK	    
		noTeenSum(2, 1, 15) → 18	18	OK	    
		noTeenSum(2, 1, 16) → 19	19	OK	    
		noTeenSum(2, 1, 17) → 3	3	OK	    
		noTeenSum(17, 1, 2) → 3	3	OK	    
		noTeenSum(2, 15, 2) → 19	19	OK	    
		noTeenSum(16, 17, 18) → 16	16	OK	    
		noTeenSum(17, 18, 19) → 0	0	OK	    
		noTeenSum(15, 16, 1) → 32	32	OK	    
		noTeenSum(15, 15, 19) → 30	30	OK	    
		noTeenSum(15, 19, 16) → 31	31	OK	    
		noTeenSum(5, 17, 18) → 5	5	OK	    
		noTeenSum(17, 18, 16) → 16	16	OK	    
		noTeenSum(17, 19, 18) → 0	0	OK
		3022746
		 */

	}

}

