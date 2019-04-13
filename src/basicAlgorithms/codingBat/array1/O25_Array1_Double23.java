/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2. 

double23({2, 2}) → true
double23({3, 3}) → true
double23({2, 3}) → false
 */
package basicAlgorithms.codingBat.array1;

public class O25_Array1_Double23 {

	public boolean double23(int[] nums) {
		  if(nums.length < 2){
			  return false;
		  }
		  return ( (nums[0] == 2) && (nums[1] == 2) ) || ( (nums[0] == 3) && (nums[1] == 3) );
	}

	public static void main(String[] args) {
		
		/*
		double23({2, 2}) → true	true	OK	    
		double23({3, 3}) → true	true	OK	    
		double23({2, 3}) → false	false	OK	    
		double23({3, 2}) → false	false	OK	    
		double23({4, 5}) → false	false	OK	    
		double23({2}) → false	false	OK	    
		double23({3}) → false	false	OK	    
		double23({}) → false	false	OK	    
		double23({3, 4}) → false
		 */
	}

}
