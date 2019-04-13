/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. 
Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper 
from splitOdd10(). (No loops needed.) 

splitOdd10({5, 5, 5}) → true
splitOdd10({5, 5, 6}) → false
splitOdd10({5, 5, 6, 1}) → true
 */
package basicAlgorithms.codingBat.recursion2;

public class O17_Recursion2_SplitOdd10 {

	public boolean s(int start , int[] nums, int a , int b){
		if(start == nums.length){
			return a % 10 == 0 && b % 2 == 1;
		}
		if(!s(start+1, nums, a + nums[start], b)){
			return s(start + 1, nums, a, b + nums[start]);
		}
		return true;
	}
	
	
	public boolean splitOdd10(int[] nums) {
		 int a = 0;
		  int b = 0;
		  return s(0, nums, a, b);
	}

	public static void main(String[] args) {
		/*
		splitOdd10({5, 5, 5}) → true	true	OK	    
		splitOdd10({5, 5, 6}) → false	false	OK	    
		splitOdd10({5, 5, 6, 1}) → true	true	OK	    
		splitOdd10({6, 5, 5, 1}) → true	true	OK	    
		splitOdd10({6, 5, 5, 1, 10}) → true	true	OK	    
		splitOdd10({6, 5, 5, 5, 1}) → false	false	OK	    
		splitOdd10({1}) → true	true	OK	    
		splitOdd10({}) → false	false	OK	    
		splitOdd10({10, 7, 5, 5}) → true	true	OK	    
		splitOdd10({10, 0, 5, 5}) → false	false	OK	    
		splitOdd10({10, 7, 5, 5, 2}) → true	true	OK	    
		splitOdd10({10, 7, 5, 5, 1}) → false	false	OK	  
		 */

	}

}
