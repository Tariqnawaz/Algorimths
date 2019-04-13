/*
Given an array of ints, return true if every element is a 1 or a 4. 

only14({1, 4, 1, 4}) → true
only14({1, 4, 2, 4}) → false
only14({1, 1}) → true
 */
package basicAlgorithms.codingBat.array2;

public class O21_Array2_Only14 {

	public boolean only14(int[] nums) {
		  for(int n : nums){
			  if( (n != 1) && (n != 4)  ){
				  return false;
			  }
		  }
		  return true;
	}

	public static void main(String[] args) {

		/*
		only14({1, 4, 1, 4}) → true	true	OK	    
		only14({1, 4, 2, 4}) → false	false	OK	    
		only14({1, 1}) → true	true	OK	    
		only14({4, 1}) → true	true	OK	    
		only14({2}) → false	false	OK	    
		only14({}) → true	true	OK	    
		only14({1, 4, 1, 3}) → false	false	OK	    
		only14({3, 1, 3}) → false	false	OK	    
		only14({1}) → true	true	OK	    
		only14({4}) → true	true	OK	    
		only14({3, 4}) → false	false	OK	    
		only14({1, 3, 4}) → false	false	OK	    
		only14({1, 1, 1}) → true	true	OK	    
		only14({1, 1, 1, 5}) → false	false	OK	    
		only14({4, 1, 4, 1}) → true
		 */
	}

}
