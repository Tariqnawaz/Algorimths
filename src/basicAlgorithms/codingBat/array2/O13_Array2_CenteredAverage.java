/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. 
If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. 
You may assume that the array is length 3 or more. 

centeredAverage({1, 2, 3, 4, 100}) → 3
centeredAverage({1, 1, 5, 5, 10, 8, 7}) → 5
centeredAverage({-10, -4, -2, -4, -2, 0}) → -3
 */
package basicAlgorithms.codingBat.array2;

public class O13_Array2_CenteredAverage {

	public int centeredAverage(int[] nums) {
		int min = Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 int sum = 0;
		 for(int n : nums){
			 min = Math.min(min, n);
			 max = Math.max(max, n);
			 sum +=n;
		 }
		 return (sum - max - min) / (nums.length - 2);
	}
	
	public static void main(String[] args) {
		/*
			centeredAverage({1, 2, 3, 4, 100}) → 3	3	OK	    
			centeredAverage({1, 1, 5, 5, 10, 8, 7}) → 5	5	OK	    
			centeredAverage({-10, -4, -2, -4, -2, 0}) → -3	-3	OK	    
			centeredAverage({5, 3, 4, 6, 2}) → 4	4	OK	    
			centeredAverage({5, 3, 4, 0, 100}) → 4	4	OK	    
			centeredAverage({100, 0, 5, 3, 4}) → 4	4	OK	    
			centeredAverage({4, 0, 100}) → 4	4	OK	    
			centeredAverage({0, 2, 3, 4, 100}) → 3	3	OK	    
			centeredAverage({1, 1, 100}) → 1	1	OK	    
			centeredAverage({7, 7, 7}) → 7	7	OK	    
			centeredAverage({1, 7, 8}) → 7	7	OK	    
			centeredAverage({1, 1, 99, 99}) → 50	50	OK	    
			centeredAverage({1000, 0, 1, 99}) → 50	50	OK	    
			centeredAverage({4, 4, 4, 4, 5}) → 4	4	OK	    
			centeredAverage({4, 4, 4, 1, 5}) → 4	4	OK	    
			centeredAverage({6, 4, 8, 12, 3}) → 6
		 */

	}

}
