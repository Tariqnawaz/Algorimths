/*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present. 

frontPiece({1, 2, 3}) → {1, 2}
frontPiece({1, 2}) → {1, 2}
frontPiece({1}) → {1}
 */
package basicAlgorithms.codingBat.array1;

public class O34_Array1_FrontPiece {

	public int[] frontPiece(int[] nums) {
		  if(nums.length < 2){
			  return nums;
		  }
		  return new int[] {nums[0] , nums[1]};
	}

	public static void main(String[] args) {

/*
 frontPiece({1, 2, 3}) → {1, 2}	{1, 2}	OK	    
frontPiece({1, 2}) → {1, 2}	{1, 2}	OK	    
frontPiece({1}) → {1}	{1}	OK	    
frontPiece({}) → {}	{}	OK	    
frontPiece({6, 5, 0}) → {6, 5}	{6, 5}	OK	    
frontPiece({6, 5}) → {6, 5}	{6, 5}	OK	    
frontPiece({3, 1, 4, 1, 5}) → {3, 1}	{3, 1}	OK	    
frontPiece({6}) → {6}
 */
	}

}
