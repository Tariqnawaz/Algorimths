/*

Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of 
considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call
will pass in index as 0. 

array220({1, 2, 20}, 0) → true
array220({3, 30}, 0) → true
array220({3}, 0) → false
 */
package basicAlgorithms.codingBat.recursion1;

public class O27_Recursion1_Array220 {

	public boolean array220(int[] nums, int index) {
		  if(nums.length < 2 || index == nums.length - 1){
			  return false;
		  }
		  if(10 * nums[index] == nums[index+1]){
			  return true;
		  }
		  return array220(nums, index + 1);
	}

	public static void main(String[] args) {
		/*
		array220({1, 2, 20}, 0) → true	true	OK	    
		array220({3, 30}, 0) → true	true	OK	    
		array220({3}, 0) → false	false	OK	    
		array220({}, 0) → false	false	OK	    
		array220({3, 3, 30, 4}, 0) → true	true	OK	    
		array220({2, 19, 4}, 0) → false	false	OK	    
		array220({20, 2, 21}, 0) → false	false	OK	    
		array220({20, 2, 21, 210}, 0) → true	true	OK	    
		array220({2, 200, 2000}, 0) → true	true	OK	    
		array220({0, 0}, 0) → true	true	OK	    
		array220({1, 2, 3, 4, 5, 6}, 0) → false	false	OK	    
		array220({1, 2, 3, 4, 5, 50, 6}, 0) → true	true	OK	    
		array220({1, 2, 3, 4, 5, 51, 6}, 0) → false	false	OK	    
		array220({1, 2, 3, 4, 4, 50, 500, 6}, 0) → true	true	OK
		 */

	}

}
