/*

Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, 
returning 0 if the array is length 0. 

sum2({1, 2, 3}) → 3
sum2({1, 1}) → 2
sum2({1, 1, 1, 1}) → 2
 */
package basicAlgorithms.codingBat.array1;

public class O19_Array1_Sum2 {
	
	public int sum2(int[] nums) {
		  if(nums.length == 0){
		   return 0;
		  }
		  if(nums.length < 2){
		   return nums[0];
		  }
		  return nums[0] + nums[1];
		}
	/*
	int res = 0;
	for(int ctr = 0 ; ctr < 2 && ctr < nums.length; ctr++){
	  res += nums[ctr];
	}
	return res;
	 */
	public static void main(String[] args) {

		/*
		sum2({1, 2, 3}) → 3	3	OK	    
		sum2({1, 1}) → 2	2	OK	    
		sum2({1, 1, 1, 1}) → 2	2	OK	    
		sum2({1, 2}) → 3	3	OK	    
		sum2({1}) → 1	1	OK	    
		sum2({}) → 0	0	OK	    
		sum2({4, 5, 6}) → 9	9	OK	    
		sum2({4}) → 4
		 */
	}

}
