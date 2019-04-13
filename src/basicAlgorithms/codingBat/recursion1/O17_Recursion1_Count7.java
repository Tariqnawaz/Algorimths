/*

Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost 
digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 

count7(717) → 2
count7(7) → 1
count7(123) → 0
 */
package basicAlgorithms.codingBat.recursion1;

public class O17_Recursion1_Count7 {

	public static int count7(int n) {
		  if(n < 10){
			  if(n == 7){
				  return 1;
			  }
			  return 0;
		  }
		  return count7(n / 10) + count7(n % 10);
	}

	public static void main(String[] args) {
		System.out.println("inside main method");
		count7(717) ;	    
		count7(7) ;    
		count7(123);	    
		count7(77);	    
		count7(7123);   
		/*count7(771237) → 3	3	OK	    
		count7(771737) → 4	4	OK	    
		count7(47571) → 2	2	OK	    
		count7(777777) → 6	6	OK	    
		count7(70701277) → 4	4	OK	    
		count7(777576197) → 5	5	OK	    
		count7(99999) → 0	0	OK	    
		count7(99799) → 1	1	OK
		 */

	}

}
