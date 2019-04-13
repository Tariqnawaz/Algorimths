/*
Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, 
such as with {3, 4, 5} or {3, 5, 5}. 

scoresClump({3, 4, 5}) → true
scoresClump({3, 4, 6}) → false
scoresClump({1, 3, 5, 5}) → true
 */
package basicAlgorithms.codingBat.ap1;

public class O13_AP1_ScoresClump {

	public boolean scoresClump(int[] scores) {
		if(scores.length < 3){
			 return false;
		}
		
		for(int ctr = 0;ctr < scores.length-2;++ctr ){
			
			if(Math.abs(scores[ctr] - scores[ctr + 1])  < 3 && 
					Math.abs(scores[ctr + 1] - scores[ctr + 2])  < 3 	&&
					Math.abs(scores[ctr] - scores[ctr + 2])  < 3 ){
				return true;
			}
		 }
		 return false;
	}

	public static void main(String[] args) {
		/*
		scoresClump({3, 4, 5}) → true	true	OK	    
		scoresClump({3, 4, 6}) → false	false	OK	    
		scoresClump({1, 3, 5, 5}) → true	true	OK	    
		scoresClump({2, 4, 5, 6}) → true	true	OK	    
		scoresClump({2, 4, 5, 7}) → false	false	OK	    
		scoresClump({2, 4, 4, 7}) → true	true	OK	    
		scoresClump({3, 3, 6, 7, 9}) → false	false	OK	    
		scoresClump({3, 3, 7, 7, 9}) → true	true	OK	    
		scoresClump({4, 5, 8}) → false	false	OK	
		 */

	}

}
