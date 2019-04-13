/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so 
that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and 
every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array. 

fix45({5, 4, 9, 4, 9, 5}) → {9, 4, 5, 4, 5, 9}
fix45({1, 4, 1, 5}) → {1, 4, 5, 1}
fix45({1, 4, 1, 5, 5, 4, 1}) → {1, 4, 5, 1, 1, 4, 5}
 */
package basicAlgorithms.codingBat.array3;

import java.util.ArrayList;
import java.util.List;

public class O13_Array3_Fix45 {

	public int[] fix45(int[] nums) {
		  while(true){
			  List<Integer> a= new ArrayList<Integer>();
			  List<Integer> b= new ArrayList<Integer>();
			  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
				  if(nums[ctr] == 4){
					  a.add(ctr);
				  }
				  if(nums[ctr] == 5){
					  b.add(ctr);
				  }
			  }
			  for(int ctr = 0 ; ctr < a.size() ; ++ctr){
				  int t = nums[a.get(ctr) + 1];
				  nums[a.get(ctr) + 1] = nums[b.get(ctr)];
				  nums[b.get(ctr)] = t;
				  
			  }
			  boolean order = true;
			  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
				  if(nums[ctr] == 4 && nums[ctr] == 5){
					  order = false;
					  break;
				  }
				  if(order){
					  break;
				  }
				  
			  }
			  return nums;
		  }
	}

	public static void main(String[] args) {

		/*
		fix45({5, 4, 9, 4, 9, 5}) → {9, 4, 5, 4, 5, 9}	{9, 4, 5, 4, 5, 9}	OK	    
		fix45({1, 4, 1, 5}) → {1, 4, 5, 1}	{1, 4, 5, 1}	OK	    
		fix45({1, 4, 1, 5, 5, 4, 1}) → {1, 4, 5, 1, 1, 4, 5}	{1, 4, 5, 1, 1, 4, 5}	OK	    
		fix45({4, 9, 4, 9, 5, 5, 4, 9, 5}) → {4, 5, 4, 5, 9, 9, 4, 5, 9}	{4, 5, 4, 5, 9, 9, 4, 5, 9}	OK	    
		fix45({5, 5, 4, 1, 4, 1}) → {1, 1, 4, 5, 4, 5}	{1, 1, 4, 5, 4, 5}	OK	    
		fix45({4, 2, 2, 5}) → {4, 5, 2, 2}	{4, 5, 2, 2}	OK	    
		fix45({4, 2, 4, 2, 5, 5}) → {4, 5, 4, 5, 2, 2}	{4, 5, 4, 5, 2, 2}	OK	    
		fix45({4, 2, 4, 5, 5}) → {4, 5, 4, 5, 2}	{4, 5, 4, 5, 2}	OK	    
		fix45({1, 1, 1}) → {1, 1, 1}	{1, 1, 1}	OK	    
		fix45({4, 5}) → {4, 5}	{4, 5}	OK	    
		fix45({5, 4, 1}) → {1, 4, 5}	{1, 4, 5}	OK	    
		fix45({}) → {}	{}	OK	    
		fix45({5, 4, 5, 4, 1}) → {1, 4, 5, 4, 5}	{5, 4, 1, 4, 5}	X	    
		fix45({4, 5, 4, 1, 5}) → {4, 5, 4, 5, 1}	{4, 5, 4, 5, 1}	OK	    
		fix45({3, 4, 5}) → {3, 4, 5}	{3, 4, 5}	OK	    
		fix45({4, 1, 5}) → {4, 5, 1}	{4, 5, 1}	OK	    
		fix45({5, 4, 1}) → {1, 4, 5}	{1, 4, 5}	OK	    
		fix45({2, 4, 2, 5}) → {2, 4, 5, 2}	{2, 4, 5, 2}
		 */

	}

}
