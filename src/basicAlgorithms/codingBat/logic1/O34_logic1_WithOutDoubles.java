/*
Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value,
 wrapping around to 1 if its value was 6. 

withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
 */
package basicAlgorithms.codingBat.logic1;

public class O34_logic1_WithOutDoubles {

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if(noDoubles && die1 == die2 && die1 == 6){
			  return 1 + die2;
		  }
		  if(noDoubles && die1 == die2){
			  return 1 + die1 + die2;
		  }
		  return die1 + die2;
	}

	public static void main(String[] args) {
		/*
		withoutDoubles(2, 3, true) → 5	5	OK	    
		withoutDoubles(3, 3, true) → 7	7	OK	    
		withoutDoubles(3, 3, false) → 6	6	OK	    
		withoutDoubles(2, 3, false) → 5	5	OK	    
		withoutDoubles(5, 4, true) → 9	9	OK	    
		withoutDoubles(5, 4, false) → 9	9	OK	    
		withoutDoubles(5, 5, true) → 11	11	OK	    
		withoutDoubles(5, 5, false) → 10	10	OK	    
		withoutDoubles(6, 6, true) → 7	7	OK	    
		withoutDoubles(6, 6, false) → 12	12	OK	    
		withoutDoubles(1, 6, true) → 7	7	OK	    
		withoutDoubles(6, 1, false) → 7	7	OK
		 */

	}

}
