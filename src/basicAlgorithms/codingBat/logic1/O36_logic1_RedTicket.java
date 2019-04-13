/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same,
the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0. 

redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
 */
package basicAlgorithms.codingBat.logic1;

public class O36_logic1_RedTicket {

	public int redTicket(int a, int b, int c) {
		  if(a == 2 && b == 2 && c== 2){
			  return 10;
		  }
		  if(a == b  && b== c){
			  return 5;
		  }
		  if(b  != a && c != a){
			  return 1;
		  }
		  return 0;
	}

	public static void main(String[] args) {
		/*
		 redTicket(2, 2, 2) → 10	10	OK	    
		redTicket(2, 2, 1) → 0	0	OK	    
		redTicket(0, 0, 0) → 5	5	OK	    
		redTicket(2, 0, 0) → 1	1	OK	    
		redTicket(1, 1, 1) → 5	5	OK	    
		redTicket(1, 2, 1) → 0	0	OK	    
		redTicket(1, 2, 0) → 1	1	OK	    
		redTicket(0, 2, 2) → 1	1	OK	    
		redTicket(1, 2, 2) → 1	1	OK	    
		redTicket(0, 2, 0) → 0	0	OK	    
		redTicket(1, 1, 2) → 0	0	OK
		 */

	}

}
