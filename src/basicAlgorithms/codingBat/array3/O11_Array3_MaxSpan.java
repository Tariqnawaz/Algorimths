/*

Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. 
A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.) 

maxSpan({1, 2, 1, 1, 3}) → 4
maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
 */
package basicAlgorithms.codingBat.array3;

public class O11_Array3_MaxSpan {

	public int maxSpan(int[] nums) {
		  int max = 0;
		  for(int left = 0 ; left < nums.length;++left){
			  for(int right = 0 ; right < nums.length;++right){
				  if(nums[left] == nums[right] && right - left + 1 > max){
					  max = right - left + 1;
				  }
			  }
		  }
		  return max;
	}

	public static void main(String[] args) {

		/*
		maxSpan({1, 2, 1, 1, 3}) → 4	4	OK	    
		maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6	6	OK	    
		maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6	6	OK	    
		maxSpan({3, 3, 3}) → 3	3	OK	    
		maxSpan({3, 9, 3}) → 3	3	OK	    
		maxSpan({3, 9, 9}) → 2	2	OK	    
		maxSpan({3, 9}) → 1	1	OK	    
		maxSpan({3, 3}) → 2	2	OK	    
		maxSpan({}) → 0	0	OK	    
		maxSpan({1}) → 1
		 */

	}

}
