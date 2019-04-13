/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8. 

sum28({2, 3, 2, 2, 4, 2}) → true
sum28({2, 3, 2, 2, 4, 2, 2}) → false
sum28({1, 2, 3, 4}) → false
 */
package basicAlgorithms.codingBat.array2;

public class O18_Array2_Sum28 {

	public boolean sum28(int[] nums) {
		int sum = 0;
		for(int n : nums){
			if(n == 2){
				sum += n;
			}
			if(sum > 8){
				break;
			}
		}
		return sum == 8;
	}

	public static void main(String[] args) {

		/*
		sum28({2, 3, 2, 2, 4, 2}) → true	true	OK	    
		sum28({2, 3, 2, 2, 4, 2, 2}) → false	false	OK	    
		sum28({1, 2, 3, 4}) → false	false	OK	    
		sum28({2, 2, 2, 2}) → true	true	OK	    
		sum28({1, 2, 2, 2, 2, 4}) → true	true	OK	    
		sum28({}) → false	false	OK	    
		sum28({2}) → false	false	OK	    
		sum28({8}) → false	false	OK	    
		sum28({2, 2, 2}) → false	false	OK	    
		sum28({2, 2, 2, 2, 2}) → false	false	OK	    
		sum28({1, 2, 2, 1, 2, 2}) → true	true	OK	    
		sum28({5, 2, 2, 2, 4, 2}) → true
		 */
	}

}
