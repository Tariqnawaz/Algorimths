/*
We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk 
beginning at the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start 
end end index will both be valid indexes into the array with start <= end. 

sumHeights({5, 3, 6, 7, 2}, 2, 4) → 6
sumHeights({5, 3, 6, 7, 2}, 0, 1) → 2
sumHeights({5, 3, 6, 7, 2}, 0, 4) → 11
 */
package basicAlgorithms.codingBat.ap1;

public class O26_AP1_SumHeigths {

	public int sumHeights(int[] heights, int start, int end) {
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
