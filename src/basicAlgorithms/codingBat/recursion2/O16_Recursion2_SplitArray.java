/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. 
Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.) 

splitArray({2, 2}) → true
splitArray({2, 3}) → false
splitArray({5, 2, 3}) → true
 */
package basicAlgorithms.codingBat.recursion2;

public class O16_Recursion2_SplitArray {
	
	public boolean s(int start , int[] nums, int a , int b){
		if(start == nums.length){
			return a == b;
		}
		if(!s(start+1, nums, a + nums[start], b)){
			return s(start + 1, nums, a, b + nums[start]);
		}
		return true;
	}
	
	public boolean splitArray(int[] nums) {
		  int a = 0;
		  int b = 0;
		  return s(0, nums, a, b);
	}

	public static void main(String[] args) {
		/*
		splitArray({2, 2}) → true	true	OK	    
		splitArray({2, 3}) → false	false	OK	    
		splitArray({5, 2, 3}) → true	true	OK	    
		splitArray({5, 2, 2}) → false	false	OK	    
		splitArray({1, 1, 1, 1, 1, 1}) → true	true	OK	    
		splitArray({1, 1, 1, 1, 1}) → false	false	OK	    
		splitArray({}) → true	true	OK	    
		splitArray({1}) → false	false	OK	    
		splitArray({3, 5}) → false	false	OK	    
		splitArray({5, 3, 2}) → true	true	OK	    
		splitArray({2,2,10,10,1,1}) → true	true	OK	    
		splitArray({1,2,2,10,10,1,1}) → false	false	OK	    
		splitArray({1,2,3,10,10,1,1}) → true	true	OK
		 */

	}

}
