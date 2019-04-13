/*
Given an array of ints, return true if it contains no 1's or it contains no 4's. 

no14({1, 2, 3}) → true
no14({1, 2, 3, 4}) → false
no14({2, 3, 4}) → true
 */
package basicAlgorithms.codingBat.array2;

public class O23_Array2_No14 {

	public boolean no14(int[] nums) {
		  boolean one = false;
		  boolean four = false ;
		  for(int n : nums){
			  if(n == 1){
				  one = true;
			  }
			  if(n == 4){
				  four = true;
			  }
			  if(one && four){
				  return false;
			  }
		  }
		  return !one || !false;
	}

	public static void main(String[] args) {
		/*
		no14({1, 2, 3}) → true	true	OK	    
		no14({1, 2, 3, 4}) → false	false	OK	    
		no14({2, 3, 4}) → true	true	OK	    
		no14({1, 1, 4, 4}) → false	false	OK	    
		no14({2, 2, 4, 4}) → true	true	OK	    
		no14({2, 3, 4, 1}) → false	false	OK	    
		no14({2, 1, 1}) → true	true	OK	    
		no14({1, 4}) → false	false	OK	    
		no14({2}) → true	true	OK	    
		no14({2, 1}) → true	true	OK	    
		no14({1}) → true	true	OK	    
		no14({4}) → true	true	OK	    
		no14({}) → true	true	OK	    
		no14({1, 1, 1, 1}) → true	true	OK	    
		no14({9, 4, 4, 1}) → false	false	OK	    
		no14({4, 2, 3, 1}) → false	false	OK	    
		no14({4, 2, 3, 5}) → true	true	OK	    
		no14({4, 4, 2}) → true	true	OK	    
		no14({1, 4, 4}) → false
		 */

	}

}
