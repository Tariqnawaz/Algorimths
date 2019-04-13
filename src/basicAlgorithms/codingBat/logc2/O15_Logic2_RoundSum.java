/*

For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round 
down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. 
To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent 
level as roundSum(). 

roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10
 */
package basicAlgorithms.codingBat.logc2;

public class O15_Logic2_RoundSum {

	public int roundSum(int a, int b, int c) {
		  return ( (a + 5) / 10) * 10 + ((b + 5) / 10) * 10 + ((c + 5) / 10) * 10;
	}

	public static void main(String[] args) {
		/*
		roundSum(16, 17, 18) → 60	60	OK	    
		roundSum(12, 13, 14) → 30	30	OK	    
		roundSum(6, 4, 4) → 10	10	OK	    
		roundSum(4, 6, 5) → 20	20	OK	    
		roundSum(4, 4, 6) → 10	10	OK	    
		roundSum(9, 4, 4) → 10	10	OK	    
		roundSum(0, 0, 1) → 0	0	OK	    
		roundSum(0, 9, 0) → 10	10	OK	    
		roundSum(10, 10, 19) → 40	40	OK	    
		roundSum(20, 30, 40) → 90	90	OK	    
		roundSum(45, 21, 30) → 100	100	OK	    
		roundSum(23, 11, 26) → 60	60	OK	    
		roundSum(23, 24, 25) → 70	70	OK	    
		roundSum(25, 24, 25) → 80	80	OK	    
		roundSum(23, 24, 29) → 70	70	OK	    
		roundSum(11, 24, 36) → 70	70	OK	    
		roundSum(24, 36, 32) → 90	90	OK	    
		roundSum(14, 12, 26) → 50	50	OK	    
		roundSum(12, 10, 24) → 40	40	OK
		 */

	}

}
