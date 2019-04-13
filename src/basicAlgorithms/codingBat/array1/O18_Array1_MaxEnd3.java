/*
Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. 
Return the changed array. 

maxEnd3({1, 2, 3}) → {3, 3, 3}
maxEnd3({11, 5, 9}) → {11, 11, 11}
maxEnd3({2, 11, 3}) → {3, 3, 3}
 */
package basicAlgorithms.codingBat.array1;

public class O18_Array1_MaxEnd3 {

	public int[] maxEnd3(int[] nums) {
		  if(nums[0] > nums[2]){
		     return new int[]{nums[0],nums[0],nums[0]};
		     }
		  
		     return new int[]{nums[2],nums[2],nums[2]};
		}
	
	public static void main(String[] args) {
		
		/*
		maxEnd3({1, 2, 3}) → {3, 3, 3}	{3, 3, 3}	OK	    
		maxEnd3({11, 5, 9}) → {11, 11, 11}	{11, 11, 11}	OK	    
		maxEnd3({2, 11, 3}) → {3, 3, 3}	{3, 3, 3}	OK	    
		maxEnd3({11, 3, 3}) → {11, 11, 11}	{11, 11, 11}	OK	    
		maxEnd3({3, 11, 11}) → {11, 11, 11}	{11, 11, 11}	OK	    
		maxEnd3({2, 2, 2}) → {2, 2, 2}	{2, 2, 2}	OK	    
		maxEnd3({2, 11, 2}) → {2, 2, 2}	{2, 2, 2}	OK	    
		maxEnd3({0, 0, 1}) → {1, 1, 1}
		 */
	}

}
