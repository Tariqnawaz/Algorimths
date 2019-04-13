/*

We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, 
assuming we always use big bars before small bars. Return -1 if it can't be done. 

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */
package basicAlgorithms.codingBat.logc2;

public class O19_Logic2_MakeChocolate {

	public int makeChocolate(int small, int big, int goal) {
		  int big2 = goal / 5 ;
		  goal -= Math.min(big, big2) * 5;
		  if(goal > small){
			  return -1;
		  }
		  return goal;
	}

	public static void main(String[] args) {
		/*
		makeChocolate(4, 1, 9) → 4	4	OK	    
		makeChocolate(4, 1, 10) → -1	-1	OK	    
		makeChocolate(4, 1, 7) → 2	2	OK	    
		makeChocolate(6, 2, 7) → 2	2	OK	    
		makeChocolate(4, 1, 5) → 0	0	OK	    
		makeChocolate(4, 1, 4) → 4	4	OK	    
		makeChocolate(5, 4, 9) → 4	4	OK	    
		makeChocolate(9, 3, 18) → 3	3	OK	    
		makeChocolate(3, 1, 9) → -1	-1	OK	    
		makeChocolate(1, 2, 7) → -1	-1	OK	    
		makeChocolate(1, 2, 6) → 1	1	OK	    
		makeChocolate(1, 2, 5) → 0	0	OK	    
		makeChocolate(6, 1, 10) → 5	5	OK	    
		makeChocolate(6, 1, 11) → 6	6	OK	    
		makeChocolate(6, 1, 12) → -1	-1	OK	    
		makeChocolate(6, 1, 13) → -1	-1	OK	    
		makeChocolate(6, 2, 10) → 0	0	OK	    
		makeChocolate(6, 2, 11) → 1	1	OK	    
		makeChocolate(6, 2, 12) → 2	2	OK	    
		makeChocolate(60, 100, 550) → 50	50	OK	    
		makeChocolate(1000, 1000000, 5000006) → 6	6	OK	    
		makeChocolate(7, 1, 12) → 7	7	OK	    
		makeChocolate(7, 1, 13) → -1	-1	OK	    
		makeChocolate(7, 2, 13) → 3	3	OK	 
		 */

	}

}
