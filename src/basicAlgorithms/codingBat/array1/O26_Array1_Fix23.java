/*

Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array. 

fix23({1, 2, 3}) → {1, 2, 0}
fix23({2, 3, 5}) → {2, 0, 5}
fix23({1, 2, 1}) → {1, 2, 1}
 */
package basicAlgorithms.codingBat.array1;

public class O26_Array1_Fix23 {

	public int[] fix23(int[] nums) {
		 if(nums[0] == 2 &&  nums[1] == 3){
			 return new int[] {nums[0] , 0 ,nums[2]};
		 }
		 if(nums[1] == 2 &&  nums[2] == 3){
			 return new int[] {nums[0] , nums[1] ,0};
		 }
		 return new int[] {nums[0] , nums[1] ,nums[2]};
	}

	public static void main(String[] args) {
		
		/*
		fix23({1, 2, 3}) → {1, 2, 0}	{1, 2, 0}	OK	    
		fix23({2, 3, 5}) → {2, 0, 5}	{2, 0, 5}	OK	    
		fix23({1, 2, 1}) → {1, 2, 1}	{1, 2, 1}	OK	    
		fix23({3, 2, 1}) → {3, 2, 1}	{3, 2, 1}	OK	    
		fix23({2, 2, 3}) → {2, 2, 0}	{2, 2, 0}	OK	    
		fix23({2, 3, 3}) → {2, 0, 3}
		 */
	}

}
