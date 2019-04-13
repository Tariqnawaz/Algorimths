/*
Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, 
if you are asleep, you do not answer. 

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 */
package basicAlgorithms.codingBat.logic1;

public class O25_logic1_AnswerCell {

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  return (!isMorning || isMom) && !isAsleep;
	}

	public static void main(String[] args) {
		/*
		answerCell(false, false, false) → true	true	OK	    
		answerCell(false, false, true) → false	false	OK	    
		answerCell(true, false, false) → false	false	OK	    
		answerCell(true, true, false) → true	true	OK	    
		answerCell(false, true, false) → true	true	OK	    
		answerCell(true, true, true) → false	false	OK
		 */

	}

}
