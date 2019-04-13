/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
The original array will be length 2 or more. 

makeMiddle({1, 2, 3, 4}) → {2, 3}
makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
makeMiddle({1, 2}) → {1, 2}
 */
package basicAlgorithms.codingBat.array1;

public class O29_Array1_MakeMiddle {

	public int[] makeMiddle(int[] nums) {
		  return new int[] {nums[nums.length /2 -1] , nums[nums.length / 2]};
		}
	
	public static void main(String[] args) {
		
		/*
		makeMiddle({1, 2, 3, 4}) → {2, 3}	{2, 3}	OK	    
		makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}	{2, 3}	OK	    
		makeMiddle({1, 2}) → {1, 2}	{1, 2}	OK	    
		makeMiddle({5, 2, 4, 7}) → {2, 4}	{2, 4}	OK	    
		makeMiddle({9, 0, 4, 3, 9, 1}) → {4, 3}
		 */
	}

}
