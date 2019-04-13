/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other. 

modThree({2, 1, 3, 5}) → true
modThree({2, 1, 2, 5}) → false
modThree({2, 4, 2, 5}) → true
 */
package basicAlgorithms.codingBat.array2;

public class O29_Array2_ModThree {

	public boolean modThree(int[] nums) {
		for(int ctr = 0 ; ctr < nums.length - 2; ++ctr){
			  if( nums[ctr]  % 2  == nums[ctr + 1] % 2 &&  nums[ctr + 1] % 2 == nums[ctr + 2] % 2){
				 return true;
			  }
		  }
		return false;
	}

	public static void main(String[] args) {

		/*
		modThree({2, 1, 3, 5}) → true	true	OK	    
		modThree({2, 1, 2, 5}) → false	false	OK	    
		modThree({2, 4, 2, 5}) → true	true	OK	    
		modThree({1, 2, 1, 2, 1}) → false	false	OK	    
		modThree({9, 9, 9}) → true	true	OK	    
		modThree({1, 2, 1}) → false	false	OK	    
		modThree({1, 2}) → false	false	OK	    
		modThree({1}) → false	false	OK	    
		modThree({}) → false	false	OK	    
		modThree({9, 7, 2, 9}) → false	false	OK	    
		modThree({9, 7, 2, 9, 2, 2}) → false	false	OK	    
		modThree({9, 7, 2, 9, 2, 2, 6}) → true
		 */

	}

}
