/*

Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4. 

arrayFront9({1, 2, 9, 3, 4}) → true
arrayFront9({1, 2, 3, 4, 9}) → false
arrayFront9({1, 2, 3, 4, 5}) → false
 */
package basicAlgorithms.codingBat.warmUp2;

public class O19_ArrayFront9 {

	public static boolean arrayFront9(int[] nums) {
		  // First figure the end for the loop
		  int end = nums.length;
		  if (end > 4) end = 4;
		  
		  for (int i=0; i<end; i++) {
		    if (nums[i] == 9) return true;
		  }
		  
		  return false;
		}
	public static void main(String[] args) {
		/*System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({1, 2, 9, 3, 4}));
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({1, 2, 3, 4, 9}));
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({1, 2, 3, 4, 5}) );
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({9, 2, 3}) );
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({1, 9, 9}));
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({1, 2, 3}) );
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({1, 9}));
		System.out.println("return true if one of the first 4 elements in the array is a 9"+arrayFront9({5, 5}));*/

	}

}
