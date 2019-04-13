/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. 
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value. 

has271({1, 2, 7, 1}) → true
has271({1, 2, 8, 1}) → false
has271({2, 7, 1}) → true
 */
package basicAlgorithms.codingBat.warmUp2;

public class O27_Array_Has271_U {
	public boolean has271(int[] nums) {
		  // Iterate < length-2, so can use i+1 and i+2 in the loop.
		  // Return true immediately when seeing 271.
		  for (int i=0; i < (nums.length-2); i++) {
		    int val = nums[i];
		    if (nums[i+1] == (val + 5) &&
		      Math.abs(nums[i+2] - (val-1)) <= 2)  return true;
		  }
		  
		  // If we get here ... none found.
		  return false;
		}	
	public static void main(String[] args) {
		// output
		/*
		 	has271({1, 2, 7, 1}) → true	true	OK	    
			has271({1, 2, 8, 1}) → false	false	OK	    
			has271({2, 7, 1}) → true	true	OK	    
			has271({3, 8, 2}) → true	true	OK	    
			has271({2, 7, 3}) → true	true	OK	    
			has271({2, 7, 4}) → false	false	OK	    
			has271({2, 7, -1}) → true	true	OK	    
			has271({2, 7, -2}) → false	false	OK	    
			has271({4, 5, 3, 8, 0}) → true	true	OK	    
			has271({2, 7, 5, 10, 4}) → true	true	OK	    
			has271({2, 7, -2, 4, 9, 3}) → true	true	OK	    
			has271({2, 7, 5, 10, 1}) → false	false	OK	    
			has271({2, 7, -2, 4, 10, 2}) → false	
		 */

	}

}
