/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3. 

midThree({1, 2, 3, 4, 5}) → {2, 3, 4}
midThree({8, 6, 7, 5, 3, 0, 9}) → {7, 5, 3}
midThree({1, 2, 3}) → {1, 2, 3}
 */
package basicAlgorithms.codingBat.array1;

public class O32_Array1_MidThree {
	
	public int[] midThree(int[] nums) {
		  return new int[] {nums[nums.length / 2 - 1] , nums[nums.length / 2 ] , nums[nums.length / 2 + 1]};
		}

	public static void main(String[] args) {
		
		/*
		midThree({1, 2, 3, 4, 5}) → {2, 3, 4}	{2, 3, 4}	OK	    
		midThree({8, 6, 7, 5, 3, 0, 9}) → {7, 5, 3}	{7, 5, 3}	OK	    
		midThree({1, 2, 3}) → {1, 2, 3}
		 */
	}

}
