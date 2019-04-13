/*
Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given 
index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0. 

array6({1, 6, 4}, 0) → true
array6({1, 4}, 0) → false
array6({6}, 0) → true
 */
package basicAlgorithms.codingBat.recursion1;

public class O25_Recursion1_Array6 {

	public boolean array6(int[] nums, int index) {
		  if(index < nums.length){
			  if(nums[index] == 6){
				  return true;
			  }
			  return array6(nums, index + 1);
		  }
		  return false;
	}

	public static void main(String[] args) {
		/*
		array6({1, 6, 4}, 0) → true	true	OK	    
		array6({1, 4}, 0) → false	false	OK	    
		array6({6}, 0) → true	true	OK	    
		array6({}, 0) → false	false	OK	    
		array6({6, 2, 2}, 0) → true	true	OK	    
		array6({2, 5}, 0) → false	false	OK	    
		array6({1, 9, 4, 6, 6}, 0) → true	true	OK	    
		array6({2, 5, 6}, 0) → true	true	OK
		 */

	}

}
