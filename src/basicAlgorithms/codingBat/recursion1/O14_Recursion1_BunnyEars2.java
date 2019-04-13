/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication). 

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
 */
package basicAlgorithms.codingBat.recursion1;

public class O14_Recursion1_BunnyEars2 {

	public int bunnyEars2(int bunnies) {
		  if(bunnies < 1){
			  return 0;
		  }
		  if(bunnies % 2 == 0){
			  return 3 + bunnyEars2(bunnies - 1);
		  }
		  return 2 + bunnyEars2(bunnies - 1);
	}

	public static void main(String[] args) {
		/*
		bunnyEars2(0) → 0	0	OK	    
		bunnyEars2(1) → 2	2	OK	    
		bunnyEars2(2) → 5	5	OK	    
		bunnyEars2(3) → 7	7	OK	    
		bunnyEars2(4) → 10	10	OK	    
		bunnyEars2(5) → 12	12	OK	    
		bunnyEars2(6) → 15	15	OK	    
		bunnyEars2(10) → 25	25	OK
		 */

	}

}
