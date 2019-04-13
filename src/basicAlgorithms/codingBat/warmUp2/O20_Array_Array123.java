/*

Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 

array123({1, 1, 2, 3, 1}) → true
array123({1, 1, 2, 4, 1}) → false
array123({1, 1, 2, 1, 2, 3}) → true
 */
package basicAlgorithms.codingBat.warmUp2;

public class O20_Array_Array123 {
	public static boolean array123(int[] nums) {
		  // Note: iterate < length-2, so can use i+1 and i+2 in the loop
		  for (int i=0; i < (nums.length-2); i++) {
		    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
		  }
		  return false;
		}
	
	public static void main(String[] args) {
	int[] no1 = {1, 1, 2, 3, 1};
	int[] no2 = {1, 1, 2, 4, 1};
	int[] no3 = {1, 1, 2, 1, 2, 3};
	int[] no4 = {1, 1, 2, 1, 2, 1};
	int[] no5 = {1, 2, 3, 1, 2, 3};
	int[] no6 = {1, 2, 3};
	int[] no7 = {1, 1, 1};
	int[] no8 = {1, 2};
	int[] no9 = {1};
	int[] no10 = {};
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no1));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no2));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no3) );
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no4));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no5));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no6));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no7));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no8));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no9));
	System.out.println("Given an array of ints, return true if .. 1, 2, 3, .. " +array123(no10));
	
	}

}
