/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. 
Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that 
is not a 3 or 4, and a 3 appears in the array before any 4. 

fix34({1, 3, 1, 4}) → {1, 3, 4, 1}
fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}
fix34({3, 2, 2, 4}) → {3, 4, 2, 2}
 */
package basicAlgorithms.codingBat.array3;

import java.util.ArrayList;
import java.util.List;

public class O12_Array3_Fix34 {

	public int[] fix34(int[] nums) {
		  List<Integer> a= new ArrayList<Integer>();
		  List<Integer> b= new ArrayList<Integer>();
		  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
			  if(nums[ctr] == 3){
				  a.add(ctr);
			  }
			  if(nums[ctr] == 4){
				  b.add(ctr);
			  }
		  }
		  for(int ctr = 0 ; ctr < a.size() ; ++ctr){
			  int t = nums[a.get(ctr) + 1];
			  nums[a.get(ctr) + 1] = nums[b.get(ctr)];
			  nums[b.get(ctr)] = t;
			  
		  }
		  return nums;
	}

	public static void main(String[] args) {

		/*
		fix34({1, 3, 1, 4}) → {1, 3, 4, 1}	{1, 3, 4, 1}	OK	    
		fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}	{1, 3, 4, 1, 1, 3, 4}	OK	    
		fix34({3, 2, 2, 4}) → {3, 4, 2, 2}	{3, 4, 2, 2}	OK	    
		fix34({3, 2, 3, 2, 4, 4}) → {3, 4, 3, 4, 2, 2}	{3, 4, 3, 4, 2, 2}	OK	    
		fix34({2, 3, 2, 3, 2, 4, 4}) → {2, 3, 4, 3, 4, 2, 2}	{2, 3, 4, 3, 4, 2, 2}	OK	    
		fix34({3, 1, 4}) → {3, 4, 1}	{3, 4, 1}	OK	    
		fix34({3, 4, 1}) → {3, 4, 1}	{3, 4, 1}	OK	    
		fix34({1, 1, 1}) → {1, 1, 1}	{1, 1, 1}	OK	    
		fix34({1}) → {1}	{1}	OK	    
		fix34({}) → {}	{}	OK	    
		fix34({7, 3, 7, 7, 4}) → {7, 3, 4, 7, 7}	{7, 3, 4, 7, 7}	OK	    
		fix34({3, 1, 4, 3, 1, 4}) → {3, 4, 1, 3, 4, 1}	{3, 4, 1, 3, 4, 1}	OK	    
		fix34({3, 1, 1, 3, 4, 4}) → {3, 4, 1, 3, 4, 1}	{3, 4, 1, 3, 4, 1}
		 */

	}

}
