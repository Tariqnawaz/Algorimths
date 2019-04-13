/*
Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). 
Return the count of the number of times that the two elements differ by 2 or less, but are not equal. 

matchUp({1, 2, 3}, {2, 3, 10}) → 2
matchUp({1, 2, 3}, {2, 3, 5}) → 3
matchUp({1, 2, 3}, {2, 3, 3}) → 2
 */
package basicAlgorithms.codingBat.array2;

public class O26_Array2_MatchUp {

	public int matchUp(int[] nums1, int[] nums2) {
		  int res = 0;
		  for(int ctr = 0 ; ctr < nums1.length; ++ctr){
			  int x = Math.abs(nums1[ctr] - nums2[ctr]);
			  if( (x > 0 )  && (x  < 3)){
				  ++res;
			  }
		  }
		  return res;
	}

	public static void main(String[] args) {

		/*
		matchUp({1, 2, 3}, {2, 3, 10}) → 2	2	OK	    
		matchUp({1, 2, 3}, {2, 3, 5}) → 3	3	OK	    
		matchUp({1, 2, 3}, {2, 3, 3}) → 2	2	OK	    
		matchUp({5, 3}, {5, 5}) → 1	1	OK	    
		matchUp({5, 3}, {4, 4}) → 2	2	OK	    
		matchUp({5, 3}, {3, 3}) → 1	1	OK	    
		matchUp({5, 3}, {2, 2}) → 1	1	OK	    
		matchUp({5, 3}, {1, 1}) → 1	1	OK	    
		matchUp({5, 3}, {0, 0}) → 0	0	OK	    
		matchUp({4}, {4}) → 0	0	OK	    
		matchUp({4}, {5}) → 1
		 */

	}

}
