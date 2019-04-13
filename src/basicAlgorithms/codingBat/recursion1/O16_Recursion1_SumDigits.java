/*
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide 
(/) by 10 removes the rightmost digit (126 / 10 is 12). 

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
 */
package basicAlgorithms.codingBat.recursion1;

public class O16_Recursion1_SumDigits {

	public int sumDigits(int n) {
		  if( n < 10){
			  return n;
		  }
		  return sumDigits(n / 10) + n % 10;
	}

	public static void main(String[] args) {
		/*
		sumDigits(126) → 9	9	OK	    
		sumDigits(49) → 13	13	OK	    
		sumDigits(12) → 3	3	OK	    
		sumDigits(10) → 1	1	OK	    
		sumDigits(1) → 1	1	OK	    
		sumDigits(0) → 0	0	OK	    
		sumDigits(730) → 10	10	OK	    
		sumDigits(1111) → 4	4	OK	    
		sumDigits(11111) → 5	5	OK	    
		sumDigits(10110) → 3	3	OK	    
		sumDigits(235) → 10	10	OK
		 */

	}

}
