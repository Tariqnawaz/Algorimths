/*
Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at 
index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method <br>int average(int[] scores, int start, int end) 
{ which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after
 your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact. 

scoresAverage({2, 2, 4, 4}) → 4
scoresAverage({4, 4, 4, 2, 2, 2}) → 4
scoresAverage({3, 4, 5, 1, 2, 3}) → 4
 */
package basicAlgorithms.codingBat.ap1;

public class O14_AP1_ScoresAverage {

	public int scoresAverage(int[] scores) {
		  int a  = 0;
		  int b  = 0;
		  
		  for(int ctr = 0;ctr < scores.length /2 ; ++ctr){
			  a += scores[ctr];
		  }
		  a /= scores.length / 2;
		  for(int ctr = scores.length / 2;ctr < scores.length; ++ctr){
			  b += scores[ctr];
		  }
		  b /= scores.length / 2;
		  if(a > b){
			  return a ;
		  }
		  return b;
	}

	public static void main(String[] args) {
		/*
		scoresAverage({2, 2, 4, 4}) → 4	4	OK	    
		scoresAverage({4, 4, 4, 2, 2, 2}) → 4	4	OK	    
		scoresAverage({3, 4, 5, 1, 2, 3}) → 4	4	OK	    
		scoresAverage({5, 6}) → 6	6	OK	    
		scoresAverage({5, 4}) → 5	5	OK	    
		scoresAverage({5, 4, 5, 6, 2, 1, 2, 3}) → 5	5	OK
		 */

	}

}
