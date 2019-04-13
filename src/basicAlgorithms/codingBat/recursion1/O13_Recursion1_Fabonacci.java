/*

The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 
(essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence. 

fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
 */
package basicAlgorithms.codingBat.recursion1;

public class O13_Recursion1_Fabonacci {

	public int fibonacci(int n) {
		  if(n < 2){
			  return n;
		  }
		  return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		/*
		 fibonacci(0) → 0	0	OK	    
		fibonacci(1) → 1	1	OK	    
		fibonacci(2) → 1	1	OK	    
		fibonacci(3) → 2	2	OK	    
		fibonacci(4) → 3	3	OK	    
		fibonacci(5) → 5	5	OK	    
		fibonacci(6) → 8	8	OK	    
		fibonacci(7) → 13	13	OK
		 */

	}

}
