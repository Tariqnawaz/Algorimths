/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, 
with the additional constraint that all 6's must be chosen. (No loops needed.) 

groupSum6(0, {5, 6, 2}, 8) → true
groupSum6(0, {5, 6, 2}, 9) → false
groupSum6(0, {5, 6, 2}, 7) → false
 */
package basicAlgorithms.codingBat.recursion2;

public class O12_Recursion2_GroupSum6 {

	public boolean groupSum6(int start, int[] nums, int target) {
		  if(target == 0 && start == nums.length){
			  return true;
		  }
		  if(start == nums.length){
			  return false;
		  }
		  if(nums[start] != 6 && !groupSum6(start + 1, nums, target - nums[start])){
			  return groupSum6(start + 1, nums, target);
		  }
		  else if(nums[start] == 6){
			  return groupSum6(start + 1, nums, target - nums[start]);
		  }
		  else{
			  return true;
		  }
	}

	public static void main(String[] args) {
		/*
		groupSum6(0, {5, 6, 2}, 8) → true	true	OK	    
		groupSum6(0, {5, 6, 2}, 9) → false	false	OK	    
		groupSum6(0, {5, 6, 2}, 7) → false	false	OK	    
		groupSum6(0, {1}, 1) → true	true	OK	    
		groupSum6(0, {9}, 1) → false	false	OK	    
		groupSum6(0, {}, 0) → true	true	OK	    
		groupSum6(0, {3, 2, 4, 6}, 8) → true	true	OK	    
		groupSum6(0, {6, 2, 4, 3}, 8) → true	true	OK	    
		groupSum6(0, {5, 2, 4, 6}, 9) → false	false	OK	    
		groupSum6(0, {6, 2, 4, 5}, 9) → false	false	OK	    
		groupSum6(0, {3, 2, 4, 6}, 3) → false	false	OK	    
		groupSum6(0, {1, 6, 2, 6, 4}, 12) → true	true	OK	    
		groupSum6(0, {1, 6, 2, 6, 4}, 13) → true	true	OK	    
		groupSum6(0, {1, 6, 2, 6, 4}, 4) → false	false	OK	    
		groupSum6(0, {1, 6, 2, 6, 4}, 9) → false	false	OK	    
		groupSum6(0, {1, 6, 2, 6, 5}, 14) → true	true	OK	    
		groupSum6(0, {1, 6, 2, 6, 5}, 15) → true	true	OK	    
		groupSum6(0, {1, 6, 2, 6, 5}, 16) → false	false	OK
		 */

	}

}
