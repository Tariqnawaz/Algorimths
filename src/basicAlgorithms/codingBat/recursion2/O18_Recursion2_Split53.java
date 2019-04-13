/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are 
multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.) 

split53({1,1}) → true
split53({1, 1, 1}) → false
split53({2, 4, 2}) → true

 */
package basicAlgorithms.codingBat.recursion2;

public class O18_Recursion2_Split53 {
	
	public boolean s(int start , int[] nums, int a , int b){
		if(start == nums.length){
			return a == b;
		}
		
		if(nums[start] % 3 == 0){
			return s(start + 1, nums, a + nums[start], b);
		}
		else if(nums[start] % 5 == 0){
			return s(start + 1, nums, a , b+ nums[start]);
		}
		else if(!s(start+1, nums, a + nums[start], b)){
			return s(start + 1, nums, a, b + nums[start]);
		}
		return true;
	}
	
	
	public boolean split53(int[] nums) {
		 int a = 0;
		  int b = 0;
		  return s(0, nums, a, b);
	}

	public static void main(String[] args) {
		/*
		split53({1,1}) → true	true	OK	    
		split53({1, 1, 1}) → false	false	OK	    
		split53({2, 4, 2}) → true	true	OK	    
		split53({2, 2, 2, 1}) → false	false	OK	    
		split53({3, 3, 5, 1}) → true	true	OK	    
		split53({3, 5, 8}) → false	false	OK	    
		split53({2, 4, 6}) → true	true	OK	    
		split53({3, 5, 6, 10, 3, 3}) → true	true	OK
		 */

	}

}
