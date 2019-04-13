/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array. 

has12({1, 3, 2}) → true
has12({3, 1, 2}) → true
has12({3, 1, 4, 5, 2}) → true
 */
package basicAlgorithms.codingBat.array2;

public class O28_Array2_Has12 {

	public boolean has12(int[] nums) {
		  boolean one = false;
		  for(int n : nums){
			  if(n == 1 ){
				  one = true;
			  }
			  if(n == 2  && one ){
				  return true;
			  }
		  }
		  return false;
	}

	public static void main(String[] args) {

		/*
		has12({1, 3, 2}) → true	true	OK	    
		has12({3, 1, 2}) → true	true	OK	    
		has12({3, 1, 4, 5, 2}) → true	true	OK	    
		has12({3, 1, 4, 5, 6}) → false	false	OK	    
		has12({3, 1, 4, 1, 6, 2}) → true	true	OK	    
		has12({2, 1, 4, 1, 6, 2}) → true	true	OK	    
		has12({2, 1, 4, 1, 6}) → false	false	OK	    
		has12({3, 5, 9}) → false	false	OK	    
		has12({3, 5, 1}) → false	false	OK	    
		has12({3, 2, 1}) → false	false	OK	    
		has12({1, 2}) → true	true	OK	    
		has12({1, 1}) → false	false	OK	    
		has12({1}) → false	false	OK	    
		has12({}) → false
		 */

	}

}
