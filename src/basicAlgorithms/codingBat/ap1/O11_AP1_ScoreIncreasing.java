/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more. 

scoresIncreasing({1, 3, 4}) → true
scoresIncreasing({1, 3, 2}) → false
scoresIncreasing({1, 1, 4}) → true
 */
package basicAlgorithms.codingBat.ap1;

public class O11_AP1_ScoreIncreasing {

	public boolean scoresIncreasing(int[] scores) {
		 for(int ctr = 0;ctr < scores.length-1;++ctr ){
			 if(scores[ctr] > scores[ctr + 1]){
				 return false;
			 }
		 }
		 return true;
	}

	public static void main(String[] args) {
		/*
		scoresIncreasing({1, 3, 4}) → true	true	OK	    
		scoresIncreasing({1, 3, 2}) → false	false	OK	    
		scoresIncreasing({1, 1, 4}) → true	true	OK	    
		scoresIncreasing({1, 1, 2, 4, 4, 7}) → true	true	OK	    
		scoresIncreasing({1, 1, 2, 4, 3, 7}) → false	false	OK	    
		scoresIncreasing({-5, 4, 11}) → true	true	OK
		 */

	}

}
