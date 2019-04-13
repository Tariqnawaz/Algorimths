/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there 
are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array 
{1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values). 

groupSumClump(0, {2, 4, 8}, 10) → true
groupSumClump(0, {1, 2, 4, 8, 1}, 14) → true
groupSumClump(0, {2, 4, 4, 8}, 14) → false
 */
package basicAlgorithms.codingBat.recursion2;

public class O15_Recursion2_GroupSumClump {

	public boolean groupSumClump(int start, int[] nums, int target) {
		if(start == 0){
			int pos = 1;
			int old = -1;
			int sum = -1;
			int[] nums2 = new int[nums.length + 2];
			nums2[0] = 0;
			for(int ctr = 0 ; ctr < nums.length ; ++ctr){
				if(ctr == 0){
					nums2[pos] = nums[ctr];
					old = nums[ctr];
					sum = nums[ctr];
					++pos;
				}else{
					if(old != nums[ctr]){
						nums2[pos - 1] = sum;
						nums2[pos - 1] = nums[ctr];
						old = nums[ctr];
						sum = nums[ctr];
						++pos;	
					}else{
						sum +=nums[ctr];
					}
				}
			}
			nums2[pos] = -1;
			return groupSumClump(start + 1, nums2, target);
			
		}
		if(target == 0){
			return true;
		}
		if(nums[start] == - 1){
			return false;
		}
		if(!groupSumClump(start + 1, nums, target - nums[start])){
			return groupSumClump(start + 1, nums, target);
		}else{
			return true;
		}
	}

	public static void main(String[] args) {
		/*
		groupSumClump(0, {2, 4, 8}, 10) → true	false	X	    
		groupSumClump(0, {1, 2, 4, 8, 1}, 14) → true	true	OK	    
		groupSumClump(0, {2, 4, 4, 8}, 14) → false	false	OK	    
		groupSumClump(0, {8, 2, 2, 1}, 9) → true	false	X	    
		groupSumClump(0, {8, 2, 2, 1}, 11) → false	false	OK	    
		groupSumClump(0, {1}, 1) → true	true	OK	    
		groupSumClump(0, {9}, 1) → false	false	OK
		 */

	}

}
