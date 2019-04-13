/*
Given an array of ints length 3, return the sum of all the elements. 

sum3({1, 2, 3}) → 6
sum3({5, 11, 2}) → 18
sum3({7, 0, 0}) → 7
 */
package basicAlgorithms.codingBat.array1;

public class O15_Array1_Sum3 {

	public int sum3(int[] nums) {
		  return nums[0] + nums[1] + nums[2];
		}

	
	public static void main(String[] args) {
		
		/*
		sum3({1, 2, 3}) → 6	6	OK	    
		sum3({5, 11, 2}) → 18	18	OK	    
		sum3({7, 0, 0}) → 7	7	OK	    
		sum3({1, 2, 1}) → 4	4	OK	    
		sum3({1, 1, 1}) → 3	3	OK	    
		sum3({2, 7, 2}) → 11
		 */
	}

}
