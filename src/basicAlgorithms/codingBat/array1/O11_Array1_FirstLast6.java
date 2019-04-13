/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. 

firstLast6({1, 2, 6}) → true
firstLast6({6, 1, 2, 3}) → true
firstLast6({13, 6, 1, 2, 3}) → false
 */
package basicAlgorithms.codingBat.array1;

public class O11_Array1_FirstLast6 {
	
	public static boolean firstLast6(int[] nums) {
		   return nums[0] == 6 || nums[nums.length - 1] == 6;
		  
		}

	public static void main(String[] args) {
		
		int[] no1 = {1, 2, 6};
		int[] no2 = {6, 1, 2, 3};
		int[] no3 = {13, 6, 1, 2, 3};
		int[] no4 = {13, 6, 1, 2, 6};
		int[] no5 = {3, 2, 1};
		int[] no6 = {3, 6};
		int[] no7 = {6};
		int[] no8 = {3};
		int[] no9 = {5,6};
		int[] no10 = {5,5};
		
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no1));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no2));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no3));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no4));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no5));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no6));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no7));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no8));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no9));
		System.out.println(" return true if 6 appears as either the first or last element in the array ... "+firstLast6(no10));
	}

}
