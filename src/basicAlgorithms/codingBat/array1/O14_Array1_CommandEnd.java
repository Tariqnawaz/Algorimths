/*

Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more. 

commonEnd({1, 2, 3}, {7, 3}) → true
commonEnd({1, 2, 3}, {7, 3, 2}) → false
commonEnd({1, 2, 3}, {1, 3}) → true
 */
package basicAlgorithms.codingBat.array1;

public class O14_Array1_CommandEnd {
	
	public boolean commonEnd(int[] a, int[] b) {
		  return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
		}

	public static void main(String[] args) {
		
		/*
		 *commonEnd({1, 2, 3}, {7, 3}) → true	true	OK	    
		commonEnd({1, 2, 3}, {7, 3, 2}) → false	false	OK	    
		commonEnd({1, 2, 3}, {1, 3}) → true	true	OK	    
		commonEnd({1, 2, 3}, {1}) → true	true	OK	    
		commonEnd({1, 2, 3}, {2}) → false
		 */
	}

}
