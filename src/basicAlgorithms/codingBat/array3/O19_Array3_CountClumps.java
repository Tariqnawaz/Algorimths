/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array. 

countClumps({1, 2, 2, 3, 4, 4}) → 2
countClumps({1, 1, 2, 1, 1}) → 2
countClumps({1, 1, 1, 1, 1}) → 1
 */
package basicAlgorithms.codingBat.array3;

public class O19_Array3_CountClumps {

	public int countClumps(int[] nums) {
		if(nums.length <2){
			return nums.length;
		}
		int old = nums[0];
		int f = 1;
		int res = 0;
		for(int ctr = 1; ctr< nums.length; ++ctr){
			if(nums[ctr] == old){
				++f;
			}
			else{
				if(f > 1){
					++res;
				}
				old = nums[ctr];
				f = 1;
			}
		}
		if(f > 1){
			++res;
		}
		return res;
	}

	public static void main(String[] args) {
		/*countClumps({1, 2, 2, 3, 4, 4}) → 2	2	OK	    
		countClumps({1, 1, 2, 1, 1}) → 2	2	OK	    
		countClumps({1, 1, 1, 1, 1}) → 1	1	OK	    
		countClumps({1, 2, 3}) → 0	0	OK	    
		countClumps({2, 2, 1, 1, 1, 2, 1, 1, 2, 2}) → 4	4	OK	    
		countClumps({0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}) → 4	4	OK	    
		countClumps({0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}) → 5	5	OK	    
		countClumps({0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}) → 5	5	OK	    
		countClumps({}) → 0*/

	}

}
