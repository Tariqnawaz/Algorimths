/*

Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20. 

sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
 */
package basicAlgorithms.codingBat.logic1;

public class O15_logic1_SortaSum {

	public int sortaSum(int a, int b) {
		if((a+b > 9) && (a+b < 20)){
			return 20;
		}
		return a+b;
	}

	public static void main(String[] args) {
		/*
		sortaSum(3, 4) → 7	7	OK	    
		sortaSum(9, 4) → 20	20	OK	    
		sortaSum(10, 11) → 21	21	OK	    
		sortaSum(12, -3) → 9	9	OK	    
		sortaSum(-3, 12) → 9	9	OK	    
		sortaSum(4, 5) → 9	9	OK	    
		sortaSum(4, 6) → 20	20	OK	    
		sortaSum(14, 7) → 21	21	OK	    
		sortaSum(14, 6) → 20	20	OK
		 */

	}

}
