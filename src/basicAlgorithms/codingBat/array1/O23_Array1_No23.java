/*
Given an int array length 2, return true if it does not contain a 2 or 3. 

no23({4, 5}) → true
no23({4, 2}) → false
no23({3, 5}) → false
 */
package basicAlgorithms.codingBat.array1;

public class O23_Array1_No23 {

	public boolean no23(int[] nums) {
		  return !(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
		}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
