/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}. 

reverse3({1, 2, 3}) → {3, 2, 1}
reverse3({5, 11, 9}) → {9, 11, 5}
reverse3({7, 0, 0}) → {0, 0, 7}
 */
package basicAlgorithms.codingBat.array1;

public class O17_Array1_Reverse3 {

	public int[] reverse3(int[] nums) {
		  return new int[]{nums[2] , nums[1] ,nums[0]};
		}

	public static void main(String[] args) {
		/*
		reverse3({1, 2, 3}) → {3, 2, 1}	{3, 2, 1}	OK	    
		reverse3({5, 11, 9}) → {9, 11, 5}	{9, 11, 5}	OK	    
		reverse3({7, 0, 0}) → {0, 0, 7}	{0, 0, 7}	OK	    
		reverse3({2, 1, 2}) → {2, 1, 2}	{2, 1, 2}	OK	    
		reverse3({1, 2, 1}) → {1, 2, 1}	{1, 2, 1}	OK	    
		reverse3({2, 11, 3}) → {3, 11, 2}	{3, 11, 2}	OK	    
		reverse3({0, 6, 5}) → {5, 6, 0}	{5, 6, 0}	OK	    
		reverse3({7, 2, 3}) → {3, 2, 7}
		 */
	}

}
