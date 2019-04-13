/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at 
least "count" even numbers. 

copyEvens({3, 2, 4, 5, 8}, 2) → {2, 4}
copyEvens({3, 2, 4, 5, 8}, 3) → {2, 4, 8}
copyEvens({6, 1, 2, 4, 5, 8}, 3) → {6, 2, 4}
 */
package basicAlgorithms.codingBat.ap1;

import java.util.ArrayList;
import java.util.List;

public class O20_AP1_CopyEvens {

	public int[] copyEvens(int[] nums, int count) {
		  List<Integer> a = new ArrayList<Integer>();
		  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
			  if(nums[ctr] % 2 == 0){
				  a.add(nums[ctr]);
			  }
			  if(a.size() == count){
				  break;
			  }
		  }
		  int[] res = new int[count];
		  for(int ctr = 0 ; ctr < res.length ; ++ctr){
			  	  res[ctr] = a.get(ctr);
			}
		  return res;
	}

	public static void main(String[] args) {
		/*
		copyEvens({3, 2, 4, 5, 8}, 2) → {2, 4}	{2, 4}	OK	    
		copyEvens({3, 2, 4, 5, 8}, 3) → {2, 4, 8}	{2, 4, 8}	OK	    
		copyEvens({6, 1, 2, 4, 5, 8}, 3) → {6, 2, 4}	{6, 2, 4}	OK	    
		copyEvens({6, 1, 2, 4, 5, 8}, 4) → {6, 2, 4, 8}	{6, 2, 4, 8}	OK	    
		copyEvens({3, 1, 4, 1, 5}, 1) → {4}	{4}	OK	    
		copyEvens({2}, 1) → {2}	{2}	OK	    
		copyEvens({6, 2, 4, 8}, 2) → {6, 2}	{6, 2}	OK	    
		copyEvens({6, 2, 4, 8}, 3) → {6, 2, 4}	{6, 2, 4}	OK	    
		copyEvens({6, 2, 4, 8}, 4) → {6, 2, 4, 8}	{6, 2, 4, 8}	OK	    
		copyEvens({1, 8, 4}, 1) → {8}	{8}	OK	    
		copyEvens({1, 8, 4}, 2) → {8, 4}	{8, 4}	OK	    
		copyEvens({2, 8, 4}, 2) → {2, 8}	{2, 8}	OK
		 */

	}

}
