/*

Given an int array length 2, return true if it contains a 2 or a 3. 

has23({2, 5}) → true
has23({4, 3}) → true
has23({4, 5}) → false
 */
package basicAlgorithms.codingBat.array1;

public class O22_Array1_Has23 {
	
	public boolean has23(int[] nums) {
		  return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
				
			}

	public static void main(String[] args) {
			
		/*
		has23({2, 5}) → true	true	OK	    
		has23({4, 3}) → true	true	OK	    
		has23({4, 5}) → false	false	OK	    
		has23({2, 2}) → true	true	OK	    
		has23({3, 2}) → true	true	OK	    
		has23({3, 3}) → true	true	OK	    
		has23({7, 7}) → false	false	OK	    
		has23({3, 9}) → true	true	OK	    
		has23({9, 5}) → false	
		 */
	}

}
