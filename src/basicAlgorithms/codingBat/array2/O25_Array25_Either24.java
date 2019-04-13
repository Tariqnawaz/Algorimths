/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both. 

either24({1, 2, 2}) → true
either24({4, 4, 1}) → true
either24({4, 4, 1, 2, 2}) → false
 */
package basicAlgorithms.codingBat.array2;

public class O25_Array25_Either24 {

	public boolean either24(int[] nums) {
		boolean two = false;
		boolean four = false;
		for(int ctr = 0; ctr < nums.length - 1 ; ++ctr){
			
			if ( (nums[ctr] == 2 ) && (nums[ctr ] == nums[ctr + 1] )){
				two = true;
			}
			
			if ( (nums[ctr] == 4 ) && (nums[ctr ] == nums[ctr + 1] )){
				four = true;
			}
			if(two && four){
				return false;
			}
		  }
		  return two || four;
	}

	public static void main(String[] args) {

		/*
		either24({1, 2, 2}) → true	true	OK	    
		either24({4, 4, 1}) → true	true	OK	    
		either24({4, 4, 1, 2, 2}) → false	false	OK	    
		either24({1, 2, 3, 4}) → false	false	OK	    
		either24({3, 5, 9}) → false	false	OK	    
		either24({1, 2, 3, 4, 4}) → true	true	OK	    
		either24({2, 2, 3, 4}) → true	true	OK	    
		either24({1, 2, 3, 2, 2, 4}) → true	true	OK	    
		either24({1, 2, 3, 2, 2, 4, 4}) → false	false	OK	    
		either24({1, 2}) → false	false	OK	    
		either24({2, 2}) → true	true	OK	    
		either24({4, 4}) → true	true	OK	    
		either24({2}) → false	false	OK	    
		either24({}) → false
		 */

	}

}
