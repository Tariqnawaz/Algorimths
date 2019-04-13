/*

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. 
Return true if the given value is everywhere in the array. 

isEverywhere({1, 2, 1, 3}, 1) → true
isEverywhere({1, 2, 1, 3}, 2) → false
isEverywhere({1, 2, 1, 3, 4}, 1) → false
 */
package basicAlgorithms.codingBat.array2;

public class O24_Array24_IsEveryWhere {

	public boolean isEverywhere(int[] nums, int val) {
		  for(int ctr = 0; ctr < nums.length - 1 ; ++ctr){
			  if(!((nums[ctr] == val ) || (nums[ctr + 1] == val))){
				  return false;
			  }
		  }
		  return true;
	}

	public static void main(String[] args) {

		/*
		isEverywhere({1, 2, 1, 3}, 1) → true	true	OK	    
		isEverywhere({1, 2, 1, 3}, 2) → false	false	OK	    
		isEverywhere({1, 2, 1, 3, 4}, 1) → false	false	OK	    
		isEverywhere({2, 1, 2, 1}, 1) → true	true	OK	    
		isEverywhere({2, 1, 2, 1}, 2) → true	true	OK	    
		isEverywhere({2, 1, 2, 3, 1}, 2) → false	false	OK	    
		isEverywhere({3, 1}, 3) → true	true	OK	    
		isEverywhere({3, 1}, 2) → false	false	OK	    
		isEverywhere({3}, 1) → true	true	OK	    
		isEverywhere({}, 1) → true	true	OK	    
		isEverywhere({1, 2, 1, 2, 3, 2, 5}, 2) → true	true	OK	    
		isEverywhere({1, 2, 1, 1, 1, 2}, 2) → false	false	OK	    
		isEverywhere({2, 1, 2, 1, 1, 2}, 2) → false	false	OK	    
		isEverywhere({2, 1, 2, 2, 2, 1, 1, 2}, 2) → false	false	OK	    
		isEverywhere({2, 1, 2, 2, 2, 1, 2, 1}, 2) → true	true	OK	    
		isEverywhere({2, 1, 2, 1, 2}, 2) → true
		 */

	}

}
