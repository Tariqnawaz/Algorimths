/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third. 

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */
package basicAlgorithms.codingBat.logic1;

public class O29_logic_TwoAsOne {

	public boolean twoAsOne(int a, int b, int c) {
		  return (a + b == c) || (a + c == b) || (b + c == a);
	}

	public static void main(String[] args) {
		/*
		twoAsOne(1, 2, 3) → true	true	OK	    
		twoAsOne(3, 1, 2) → true	true	OK	    
		twoAsOne(3, 2, 2) → false	false	OK	    
		twoAsOne(2, 3, 1) → true	true	OK	    
		twoAsOne(5, 3, -2) → true	true	OK	    
		twoAsOne(5, 3, -3) → false	false	OK	    
		twoAsOne(2, 5, 3) → true	true	OK	    
		twoAsOne(9, 5, 5) → false	false	OK	    
		twoAsOne(9, 4, 5) → true	true	OK	    
		twoAsOne(5, 4, 9) → true	true	OK	    
		twoAsOne(3, 3, 0) → true	true	OK	    
		twoAsOne(3, 3, 2) → false	false	OK
		 */

	}

}
