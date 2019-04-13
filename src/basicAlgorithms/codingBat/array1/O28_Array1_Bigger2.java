/*
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. 
In event of a tie, return a. 

biggerTwo({1, 2}, {3, 4}) → {3, 4}
biggerTwo({3, 4}, {1, 2}) → {3, 4}
biggerTwo({1, 1}, {1, 2}) → {1, 2}
 */
package basicAlgorithms.codingBat.array1;

public class O28_Array1_Bigger2 {

	public int[] biggerTwo(int[] a, int[] b) {
		  int aPlus = a[0] + a[1];
		  int bPlus = b[0] + b[1];
		  
		  if(aPlus == bPlus ){
		  return a;
		  }
		  
		  if(aPlus > bPlus ){
		   return a;
		  }
		  return b;
		  
		}
	public static void main(String[] args) {
		
		/*
		biggerTwo({1, 2}, {3, 4}) → {3, 4}	{3, 4}	OK	    
		biggerTwo({3, 4}, {1, 2}) → {3, 4}	{3, 4}	OK	    
		biggerTwo({1, 1}, {1, 2}) → {1, 2}	{1, 2}	OK	    
		biggerTwo({2, 1}, {1, 1}) → {2, 1}	{2, 1}	OK	    
		biggerTwo({2, 2}, {1, 3}) → {2, 2}	{2, 2}	OK	    
		biggerTwo({1, 3}, {2, 2}) → {1, 3}	{1, 3}	OK	    
		biggerTwo({6, 7}, {3, 1}) → {6, 7}
		 */
	}

}
