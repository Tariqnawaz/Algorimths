/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1. 

maxTriple({1, 2, 3}) → 3
maxTriple({1, 5, 3}) → 5
maxTriple({5, 2, 3}) → 5
 */
package basicAlgorithms.codingBat.array1;

public class O33_Array1_MaxTriple {

	public int maxTriple(int[] nums) {
		  int a = nums[0];
		  int b = nums[nums.length / 2];
		  int c = nums[nums.length - 1];
		  if((a > b) && (a > c)){
			  return a;
		  }
		  if(b > c){
			  return b;
		  }
		  return c;
	}

	public static void main(String[] args) {
		/*
		maxTriple({1, 2, 3}) → 3	3	OK	    
		maxTriple({1, 5, 3}) → 5	5	OK	    
		maxTriple({5, 2, 3}) → 5	5	OK	    
		maxTriple({1, 2, 3, 1, 1}) → 3	3	OK	    
		maxTriple({1, 7, 3, 1, 5}) → 5	5	OK	    
		maxTriple({5, 1, 3, 7, 1}) → 5	5	OK	    
		maxTriple({5, 1, 7, 3, 7, 8, 1}) → 5	5	OK	    
		maxTriple({5, 1, 7, 9, 7, 8, 1}) → 9	9	OK	    
		maxTriple({5, 1, 7, 3, 7, 8, 9}) → 9	9	OK	    
		maxTriple({2, 2, 5, 1, 1}) → 5
		 */
	}

}
