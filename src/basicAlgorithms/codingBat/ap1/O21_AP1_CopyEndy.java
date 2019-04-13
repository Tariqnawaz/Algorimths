/*
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" 
containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain 
at least "count" endy numbers. 

copyEndy({9, 11, 90, 22, 6}, 2) → {9, 90}
copyEndy({9, 11, 90, 22, 6}, 3) → {9, 90, 6}
copyEndy({12, 1, 1, 13, 0, 20}, 2) → {1, 1}
 */
package basicAlgorithms.codingBat.ap1;

import java.util.ArrayList;
import java.util.List;

public class O21_AP1_CopyEndy {

	public int[] copyEndy(int[] nums, int count) {
		List<Integer> a = new ArrayList<Integer>();
		  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
			  if((nums[ctr] > -1 && nums[ctr] < 11) || (nums[ctr] > 89 && nums[ctr] < 101) ){
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
			copyEndy({9, 11, 90, 22, 6}, 2) → {9, 90}	{9, 90}	OK	    
			copyEndy({9, 11, 90, 22, 6}, 3) → {9, 90, 6}	{9, 90, 6}	OK	    
			copyEndy({12, 1, 1, 13, 0, 20}, 2) → {1, 1}	{1, 1}	OK	    
			copyEndy({12, 1, 1, 13, 0, 20}, 3) → {1, 1, 0}	{1, 1, 0}	OK	    
			copyEndy({0}, 1) → {0}	{0}	OK	    
			copyEndy({10, 11, 90}, 2) → {10, 90}	{10, 90}	OK	    
			copyEndy({90, 22, 100}, 2) → {90, 100}	{90, 100}	OK	    
			copyEndy({12, 11, 10, 89, 101, 4}, 1) → {10}	{10}	OK	    
			copyEndy({13, 2, 2, 0}, 2) → {2, 2}	{2, 2}	OK	    
			copyEndy({13, 2, 2, 0}, 3) → {2, 2, 0}	{2, 2, 0}	OK	    
			copyEndy({13, 2, 13, 2, 0, 30}, 2) → {2, 2}	{2, 2}	OK	    
			copyEndy({13, 2, 13, 2, 0, 30}, 3) → {2, 2, 0}	{2, 2, 0}	OK
			 */

	}

}
