/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a 
length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. 
The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code) 

fizzArray(4) → {0, 1, 2, 3}
fizzArray(1) → {0}
fizzArray(10) → {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
 */
package basicAlgorithms.codingBat.array2;

public class O20_Array2_FizzArray {

	public int[] fizzArray(int n) {
		  int[] a = new int[n];
		  for(int ctr = 0 ; ctr < n ; ++ctr){
			  a[ctr] = ctr;
		  }
		  return a;
	}

	public static void main(String[] args) {

		/*
		fizzArray(4) → {0, 1, 2, 3}	{0, 1, 2, 3}	OK	    
		fizzArray(1) → {0}	{0}	OK	    
		fizzArray(10) → {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}	OK	    
		fizzArray(0) → {}	{}	OK	    
		fizzArray(2) → {0, 1}	{0, 1}	OK	    
		fizzArray(7) → {0, 1, 2, 3, 4, 5, 6}
		 */

	}

}
