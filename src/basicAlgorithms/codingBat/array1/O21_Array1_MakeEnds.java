/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more. 

makeEnds({1, 2, 3}) → {1, 3}
makeEnds({1, 2, 3, 4}) → {1, 4}
makeEnds({7, 4, 6, 2}) → {7, 2}
 */
package basicAlgorithms.codingBat.array1;

public class O21_Array1_MakeEnds {

	public int[] makeEnds(int[] nums) {
		  return new int[]{nums[0] , nums[nums.length - 1]};
		}
	
	public static void main(String[] args) {

		/*
		makeEnds({1, 2, 3}) → {1, 3}	{1, 3}	OK	    
		makeEnds({1, 2, 3, 4}) → {1, 4}	{1, 4}	OK	    
		makeEnds({7, 4, 6, 2}) → {7, 2}	{7, 2}	OK	    
		makeEnds({1, 2, 2, 2, 2, 2, 2, 3}) → {1, 3}	{1, 3}	OK	    
		makeEnds({7, 4}) → {7, 4}	{7, 4}	OK	    
		makeEnds({7}) → {7, 7}	{7, 7}	OK	    
		makeEnds({5, 2, 9}) → {5, 9}	{5, 9}	OK	    
		makeEnds({2, 3, 4, 1}) → {2, 1}
		 */
	}

}
