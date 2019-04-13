/*

(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, 
return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double. For example, with 
the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end. 

sumHeights2({5, 3, 6, 7, 2}, 2, 4) → 7
sumHeights2({5, 3, 6, 7, 2}, 0, 1) → 2
sumHeights2({5, 3, 6, 7, 2}, 0, 4) → 15
 */
package basicAlgorithms.codingBat.ap1;

public class O26_AP1_SumHeigths2 {

	public int sumHeights2(int[] heights, int start, int end) {
		int res = 0;
		  for(int ctr = start ; ctr <= end -1 ;++ctr){
			  if(heights[ctr] > heights[ctr + 1]){
				  res += heights[ctr] - heights[ctr - 1];
			  }else{
				  res += 2 *  (heights[ctr + 1] - heights[ctr]);
			  }
		  }
		  return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
