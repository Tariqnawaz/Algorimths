/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's 

more14({1, 4, 1}) → true
more14({1, 4, 1, 4}) → false
more14({1, 1}) → true
 */
package basicAlgorithms.codingBat.array2;

public class O19_Array2_More14 {

	public boolean more14(int[] nums) {
		  int one = 0;
		  int four = 0;
		  
		  for(int n : nums){
			  if(n == 1){
				  ++one;
			  }
			  if(n == 4){
				  ++four;
			  }
		  }
		  return one > four;
	}

	public static void main(String[] args) {

		/*
		more14({1, 4, 1}) → true	true	OK	    
		more14({1, 4, 1, 4}) → false	false	OK	    
		more14({1, 1}) → true	true	OK	    
		more14({1, 6, 6}) → true	true	OK	    
		more14({1}) → true	true	OK	    
		more14({1, 4}) → false	false	OK	    
		more14({6, 1, 1}) → true	true	OK	    
		more14({1, 6, 4}) → false	false	OK	    
		more14({1, 1, 4, 4, 1}) → true	true	OK	    
		more14({1, 1, 6, 4, 4, 1}) → true	true	OK	    
		more14({}) → false	false	OK	    
		more14({4, 1, 4, 6}) → false	false	OK	    
		more14({4, 1, 4, 6, 1}) → false	false	OK	    
		more14({1, 4, 1, 4, 1, 6}) → true
		 */

	}

}
