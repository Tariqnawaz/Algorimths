/*
Given an array of ints, return the number of 9's in the array. 

arrayCount9({1, 2, 9}) → 1
arrayCount9({1, 9, 9}) → 2
arrayCount9({1, 9, 9, 3, 9}) → 3
 */
package basicAlgorithms.codingBat.warmUp2;

public class O18_Array_ArrayCount9 {
	public static int arrayCount9(int[] nums) {
		  int count=0;
		  for(int i=0 ; i<nums.length; i++){
		  if(nums[i] == 9){
		  count++;
		  }
		  }
		return  count;
		}
	public static void main(String[] args) {
		/*System.out.println(" return the number of 9's" +arrayCount9({1, 2, 9}));
		System.out.println(" return the number of 9's" +arrayCount9({1, 9, 9}));
		System.out.println(" return the number of 9's" +arrayCount9({1, 9, 9, 3, 9}));
		System.out.println(" return the number of 9's" +arrayCount9({1, 2, 3}));
		System.out.println(" return the number of 9's" +arrayCount9({}));
		System.out.println(" return the number of 9's" +arrayCount9({4, 2, 4, 3, 1}));
		System.out.println(" return the number of 9's" +arrayCount9({9, 2, 4, 3, 1}));*/
		
	}

}
