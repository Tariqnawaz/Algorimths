/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively 
(no loops or multiplication) the total number of blocks in such a triangle with the given number of rows. 

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
 */
package basicAlgorithms.codingBat.recursion1;

public class O15_Recursion1_Triangle {

	public int triangle(int rows) {
		  if(rows < 2){
			  return rows;
		  }
		  return rows + triangle(rows - 1);
	}

	public static void main(String[] args) {
		/*
		triangle(0) → 0	0	OK	    
		triangle(1) → 1	1	OK	    
		triangle(2) → 3	3	OK	    
		triangle(3) → 6	6	OK	    
		triangle(4) → 10	10	OK	    
		triangle(5) → 15	15	OK	    
		triangle(6) → 21	21	OK	    
		triangle(7) → 28	28	OK
		 */

	}

}
