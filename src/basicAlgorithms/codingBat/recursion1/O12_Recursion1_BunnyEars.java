/*
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively 
(without loops or multiplication). 

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
 */
package basicAlgorithms.codingBat.recursion1;

public class O12_Recursion1_BunnyEars {

	public int bunnyEars(int bunnies) {
		  if(bunnies < 1){
			  return 0;
		  }
		  return 2 + bunnyEars(bunnies - 1);
	}

	public static void main(String[] args) {
		/*
		bunnyEars(0) → 0	0	OK	    
		bunnyEars(1) → 2	2	OK	    
		bunnyEars(2) → 4	4	OK	    
		bunnyEars(3) → 6	6	OK	    
		bunnyEars(4) → 8	8	OK	    
		bunnyEars(5) → 10	10	OK	    
		bunnyEars(12) → 24	24	OK	    
		bunnyEars(50) → 100	100	OK	    
		bunnyEars(234) → 468	468	OK
		 */

	}

}
