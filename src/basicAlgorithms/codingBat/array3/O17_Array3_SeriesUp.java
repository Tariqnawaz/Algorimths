/*
 Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the 
 array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2. 

seriesUp(3) → {1, 1, 2, 1, 2, 3}
seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
seriesUp(2) → {1, 1, 2}
 */
package basicAlgorithms.codingBat.array3;

public class O17_Array3_SeriesUp {

	public int[] seriesUp(int n) {
		int[] a = new int[n * (n + 1) / 2];
		int ctr = 0;
		for(int r = 0 ; r < n ;++r){
			for(int c = 0; c<=r;++c){
				a[ctr] = c + 1;
				++ctr;
			}
		}
		return a;
	}

	public static void main(String[] args) {

		/*
		seriesUp(3) → {1, 1, 2, 1, 2, 3}	{1, 1, 2, 1, 2, 3}	OK	    
		seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}	OK	    
		seriesUp(2) → {1, 1, 2}	{1, 1, 2}	OK	    
		seriesUp(1) → {1}	{1}	OK	    
		seriesUp(0) → {}	{}	OK	    
		seriesUp(6) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}
		 */

	}

}
