/*
Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, 
a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0. 

array11({1, 2, 11}, 0) → 1
array11({11, 11}, 0) → 2
array11({1, 2, 3, 4}, 0) → 0
 */
package basicAlgorithms.codingBat.recursion1;

public class O26_Recursion1_Array11 {

	public int array11(int[] nums, int index) {
		if(nums.length < 1){
			return 0;
		}
		if(index == nums.length - 1){
			  if(nums[index] == 11){
				  return 1;
			  }
			  return 0;
		  }
		if(nums[index] == 11){
			  return 1 + array11(nums, index + 1);
		  }	
		  return array11(nums, index + 1);
	}

	public static void main(String[] args) {
		/*
		array11({1, 2, 11}, 0) → 1	1	OK	    
		array11({11, 11}, 0) → 2	2	OK	    
		array11({1, 2, 3, 4}, 0) → 0	0	OK	    
		array11({1, 11, 3, 11, 11}, 0) → 3	3	OK	    
		array11({11}, 0) → 1	1	OK	    
		array11({1}, 0) → 0	0	OK	    
		array11({}, 0) → 0	0	OK	    
		array11({11, 2, 3, 4, 11, 5}, 0) → 2	2	OK	    
		array11({11, 5, 11}, 0) → 2	2	OK
		 */

	}

}
