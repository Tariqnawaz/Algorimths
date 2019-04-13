/*

Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers 
on the other side. 

canBalance({1, 1, 1, 2, 1}) → true
canBalance({2, 1, 1, 2, 1}) → false
canBalance({10, 10}) → true
 */
package basicAlgorithms.codingBat.array3;

public class O14_Array3_CanBalance {

	public boolean canBalance(int[] nums) {
		  int a = 0;
		  int b = 0;
		  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
			  a += nums[ctr];
		  }
		  if(a == b){
			  return true;
		  }
		  for(int ctr = 0 ; ctr < nums.length ; ++ctr){
			  a -= nums[ctr];
			  b += nums[ctr];
			  if(a == b){
				  return true;
			  }
		  }
		  return false;
	}

	public static void main(String[] args) {

		/*
		canBalance({1, 1, 1, 2, 1}) → true	true	OK	    
		canBalance({2, 1, 1, 2, 1}) → false	false	OK	    
		canBalance({10, 10}) → true	true	OK	    
		canBalance({10, 0, 1, -1, 10}) → true	true	OK	    
		canBalance({1, 1, 1, 1, 4}) → true	true	OK	    
		canBalance({2, 1, 1, 1, 4}) → false	false	OK	    
		canBalance({2, 3, 4, 1, 2}) → false	false	OK	    
		canBalance({1, 2, 3, 1, 0, 2, 3}) → true	true	OK	    
		canBalance({1, 2, 3, 1, 0, 1, 3}) → false	false	OK	    
		canBalance({1}) → false	false	OK	    
		canBalance({1, 1, 1, 2, 1}) → true
		 */
	}

}
