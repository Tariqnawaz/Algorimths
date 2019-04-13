/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere. 

has22({1, 2, 2}) → true
has22({1, 2, 1, 2}) → false
has22({2, 1, 2}) → false
 */
package basicAlgorithms.codingBat.array2;

public class O16_Array2_Has22 {

	public boolean has22(int[] nums) {
		  for(int ctr = 0;ctr < nums.length - 1;++ctr){
			  if((nums[ctr] == 2 ) && (nums[ctr] == nums[ctr + 1])){
				  return true;
			  }
		  }
		  return false;
	}

	public static void main(String[] args) {
		/*
		has22({1, 2, 2}) → true	true	OK	    
		has22({1, 2, 1, 2}) → false	false	OK	    
		has22({2, 1, 2}) → false	false	OK	    
		has22({2, 2, 1, 2}) → true	true	OK	    
		has22({1, 3, 2}) → false	false	OK	    
		has22({1, 3, 2, 2}) → true	true	OK	    
		has22({2, 3, 2, 2}) → true	true	OK	    
		has22({4, 2, 4, 2, 2, 5}) → true	true	OK	    
		has22({1, 2}) → false	false	OK	    
		has22({2, 2}) → true	true	OK	    
		has22({2}) → false	false	OK	    
		has22({}) → false	false	OK	    
		has22({3, 3, 2, 2}) → true	true	OK	    
		has22({5, 2, 5, 2}) → false
		 */

	}

}
