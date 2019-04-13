/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: 
all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.) 

groupSum5(0, {2, 5, 10, 4}, 19) → true
groupSum5(0, {2, 5, 10, 4}, 17) → true
groupSum5(0, {2, 5, 10, 4}, 12) → false
 */
package basicAlgorithms.codingBat.recursion2;

public class O14_Recursion2_GroupSum5 {

	public boolean groupSum5(int start, int[] nums, int target) {
		if(target == 0 && start == nums.length){
			  return true;
		  }
		if(start >= nums.length){
			  return false;
		  }
		if(!(nums[start] % 5 == 0) && !groupSum5(start + 1, nums, target - nums[start])){
			return groupSum5(start + 1, nums, target);
		}else if((nums[start] % 5 == 0) && (start < nums.length - 1) && (nums[start + 1] == 1)){
			return groupSum5(start + 2, nums, target - nums[start]);
		}else if(nums[start] % 5 == 0){
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		else{
			return true;
		}
		
	}

	public static void main(String[] args) {
		/*
		groupSum5(0, {2, 5, 10, 4}, 19) → true	true	OK	    
		groupSum5(0, {2, 5, 10, 4}, 17) → true	true	OK	    
		groupSum5(0, {2, 5, 10, 4}, 12) → false	false	OK	    
		groupSum5(0, {2, 5, 4, 10}, 12) → false	false	OK	    
		groupSum5(0, {3, 5, 1}, 4) → false	false	OK	    
		groupSum5(0, {3, 5, 1}, 5) → true	true	OK	    
		groupSum5(0, {1, 3, 5}, 5) → true	true	OK	    
		groupSum5(0, {3, 5, 1}, 9) → false	false	OK	    
		groupSum5(0, {2, 5, 10, 4}, 7) → false	false	OK	    
		groupSum5(0, {2, 5, 10, 4}, 15) → true	true	OK	    
		groupSum5(0, {2, 5, 10, 4}, 11) → false	false	OK	    
		groupSum5(0, {1}, 1) → true	true	OK	    
		groupSum5(0, {9}, 1) → false	false	OK	    
		groupSum5(0, {9}, 0) → true	true	OK	    
		groupSum5(0, {}, 0) → true	true	OK
		 */

	}

}
