/*

Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2. 

scores100({1, 100, 100}) → true
scores100({1, 100, 99, 100}) → false
scores100({100, 1, 100, 100}) → true
 */
package basicAlgorithms.codingBat.ap1;

public class O12_AP1_Scores100 {

	public boolean scores100(int[] scores) {
		 for(int ctr = 0;ctr < scores.length-1;++ctr ){
			 if(scores[ctr] == 100 &&  scores[ctr] == scores[ctr + 1]){
				 return true;
			 }
		 }
		 return false;
	}

	public static void main(String[] args) {
		/*
		scores100({1, 100, 100}) → true	true	OK	    
		scores100({1, 100, 99, 100}) → false	false	OK	    
		scores100({100, 1, 100, 100}) → true	true	OK	    
		scores100({100, 1, 100, 1}) → false	false	OK	    
		scores100({1, 2, 3, 4, 5}) → false	false	OK	    
		scores100({1, 2, 100, 4, 5}) → false	false	OK
		 */

	}

}
