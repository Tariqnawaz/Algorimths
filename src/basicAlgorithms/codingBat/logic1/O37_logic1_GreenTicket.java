/*

You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same,
the result is 20. If two of the numbers are the same, the result is 10. 

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */
package basicAlgorithms.codingBat.logic1;

public class O37_logic1_GreenTicket {

	public int greenTicket(int a, int b, int c) {
		  if(a !=b && b != c && a!=c){
			  return 0;
		  }
		  if(a ==b && b == c){
			  return 20;
		  }
		  return 10;
	}

	public static void main(String[] args) {
		/*
		greenTicket(1, 2, 3) → 0	0	OK	    
		greenTicket(2, 2, 2) → 20	20	OK	    
		greenTicket(1, 1, 2) → 10	10	OK	    
		greenTicket(2, 1, 1) → 10	10	OK	    
		greenTicket(1, 2, 1) → 10	10	OK	    
		greenTicket(3, 2, 1) → 0	0	OK	    
		greenTicket(0, 0, 0) → 20	20	OK	    
		greenTicket(2, 0, 0) → 10	10	OK	    
		greenTicket(0, 9, 10) → 0	0	OK	    
		greenTicket(0, 10, 0) → 10	10	OK	    
		greenTicket(9, 9, 9) → 20	20	OK	    
		greenTicket(9, 0, 9) → 10	10	OK
		 */

	}

}
