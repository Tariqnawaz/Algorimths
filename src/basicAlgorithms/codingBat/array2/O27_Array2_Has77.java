/*

Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}. 

has77({1, 7, 7}) → true
has77({1, 7, 1, 7}) → true
has77({1, 7, 1, 1, 7}) → false
 */
package basicAlgorithms.codingBat.array2;

public class O27_Array2_Has77 {

	public boolean has77(int[] nums) {
		for(int ctr = 0 ; ctr < nums.length - 1; ++ctr){
			  if( nums[ctr]  == 7 && nums[ctr] == nums[ctr + 1]){
				 return true;
			  }
		  }
		
		for(int ctr = 0 ; ctr < nums.length - 2; ++ctr){
			  if( nums[ctr]  == 7 && nums[ctr] == nums[ctr + 2]){
				 return true;
			  }
		  }
		return false;
	}

	public static void main(String[] args) {
		
		/*
		has77({1, 7, 7}) → true	true	OK	    
		has77({1, 7, 1, 7}) → true	true	OK	    
		has77({1, 7, 1, 1, 7}) → false	false	OK	    
		has77({7, 7, 1, 1, 7}) → true	true	OK	    
		has77({2, 7, 2, 2, 7, 2}) → false	false	OK	    
		has77({2, 7, 2, 2, 7, 7}) → true	true	OK	    
		has77({7, 2, 7, 2, 2, 7}) → true	true	OK	    
		has77({7, 2, 6, 2, 2, 7}) → false	false	OK	    
		has77({7, 7, 7}) → true	true	OK	    
		has77({7, 1, 7}) → true	true	OK	    
		has77({7, 1, 1}) → false	false	OK	    
		has77({1, 2}) → false	false	OK	    
		has77({1, 7}) → false	false	OK	    
		has77({7}) → false
		 */

	}

}
