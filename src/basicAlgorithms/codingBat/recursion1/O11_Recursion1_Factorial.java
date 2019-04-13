/*

Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops). 

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
 */
package basicAlgorithms.codingBat.recursion1;

public class O11_Recursion1_Factorial {

	public static int factorial(int n) {
		  if( n < 2){
			  return 1;
		  }
		  return n * factorial(n -1);
	}

	public static void main(String[] args) {
		
		factorial(1);	    
		factorial(8);    
		/*	factorial(3) → 6	6	OK	    
		factorial(4) → 24	24	OK	    
		factorial(5) → 120	120	OK	    
		factorial(6) → 720	720	OK	    
		factorial(7) → 5040	5040	OK	    
		factorial(8) → 40320	40320	OK	    
		factorial(12) → 479001600	479001600	OK
		 */
	}

}
