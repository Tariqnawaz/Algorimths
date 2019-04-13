/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other. 

haveThree({3, 1, 3, 1, 3}) → true
haveThree({3, 1, 3, 3}) → false
haveThree({3, 4, 3, 3, 4}) → false
 */
package basicAlgorithms.codingBat.array2;

import java.util.ArrayList;
import java.util.List;

public class O30_Array2_HaveThree {

	public boolean haveThree(int[] nums) {
		  List<Integer> a  = new ArrayList<Integer>();
		  for(int ctr = 0 ; ctr < nums.length ; ++ ctr){
			  if(nums[ctr] == 3){
				  a.add(ctr);
			  }
			  if(a.size() > 3){
				  return false;
			  }
		  }
		  if(a.size() < 3){
			  return false;
		  }
		  
		  return (a.get(2) - a.get(1) > 1) && (a.get(1) - a.get(0) > 1); 
	}

	public static void main(String[] args) {

		/*
		haveThree({3, 1, 3, 1, 3}) → true	true	OK	    
		haveThree({3, 1, 3, 3}) → false	false	OK	    
		haveThree({3, 4, 3, 3, 4}) → false	false	OK	    
		haveThree({1, 3, 1, 3, 1, 2}) → false	false	OK	    
		haveThree({1, 3, 1, 3, 1, 3}) → true	true	OK	    
		haveThree({1, 3, 3, 1, 3}) → false	false	OK	    
		haveThree({1, 3, 1, 3, 1, 3, 4, 3}) → false	false	OK	    
		haveThree({3, 4, 3, 4, 3, 4, 4}) → true	true	OK	    
		haveThree({3, 3, 3}) → false	false	OK	    
		haveThree({1, 3}) → false	false	OK	    
		haveThree({3}) → false	false	OK	    
		haveThree({1}) → false
		 */

	}

}
