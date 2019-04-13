/*

The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?"
representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each 
correct answer, -1 for each incorrect answer, and +0 for each blank answer. 

scoreUp({"a", "a", "b", "b"}, {"a", "c", "b", "c"}) → 6
scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "c"}) → 11
scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "b"}) → 16
 */
package basicAlgorithms.codingBat.ap1;

public class O23_AP1_ScoreUp {

	public int scoreUp(String[] key, String[] answers) {
		  int score = 0;
		  for(int ctr = 0 ;ctr < key.length; ++ctr){
			  if(key[ctr] == answers[ctr]){
				  score +=4;
			  }
			  else if(answers[ctr] != "?"){
				  score -=	1;
			  }
		  }
		  return score;
	}

	public static void main(String[] args) {
		/*
		scoreUp({"a", "a", "b", "b"}, {"a", "c", "b", "c"}) → 6	6	OK	    
		scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "c"}) → 11	11	OK	    
		scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "b"}) → 16	16	OK	    
		scoreUp({"a", "a", "b", "b"}, {"?", "c", "b", "?"}) → 3	3	OK	    
		scoreUp({"a", "a", "b", "b"}, {"?", "c", "?", "?"}) → -1	-1	OK	    
		scoreUp({"a", "a", "b", "b"}, {"c", "?", "b", "b"}) → 7	7	OK	    
		scoreUp({"a", "a", "b", "b"}, {"c", "?", "b", "?"}) → 3	3	OK	    
		scoreUp({"a", "b", "c"}, {"a", "c", "b"}) → 2	2	OK	    
		scoreUp({"a", "a", "b", "b", "c", "c"}, {"a", "c", "a", "c", "a", "c"}) → 4	4	OK	    
		scoreUp({"a", "a", "b", "b", "c", "c"}, {"a", "c", "?", "?", "a", "c"}) → 6	6	OK	    
		scoreUp({"a", "a", "b", "b", "c", "c"}, {"a", "c", "?", "?", "c", "c"}) → 11	11	OK	    
		scoreUp({"a", "b", "c"}, {"a", "b", "c"}) → 12	12	OK	 
		 */

	}

}
