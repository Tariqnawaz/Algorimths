/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups). 

squareUp(3) → {0, 0, 1, 0, 2, 1, 3, 2, 1}
squareUp(2) → {0, 1, 2, 1}
squareUp(4) → {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}
 */
package basicAlgorithms.codingBat.array3;

public class O16_Array3_SquareUp {

	public int[] squareUp(int n) {
		int[] a = new int[n * n];
		for(int r = 0 ; r < n ; ++r){
			for(int c = 0 ; c < n ; ++c){
				if(c < n - r -1){
					a[r*n+c] =0;
				}
				else{
					a[r*n+c] =n - c;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {

		/*
		squareUp(3) → {0, 0, 1, 0, 2, 1, 3, 2, 1}	{0, 0, 1, 0, 2, 1, 3, 2, 1}	OK	    
		squareUp(2) → {0, 1, 2, 1}	{0, 1, 2, 1}	OK	    
		squareUp(4) → {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}	{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}	OK	    
		squareUp(1) → {1}	{1}	OK	    
		squareUp(0) → {}	{}	OK	    
		squareUp(6) → {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1}	{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1}	OK	    

		 */

	}

}
