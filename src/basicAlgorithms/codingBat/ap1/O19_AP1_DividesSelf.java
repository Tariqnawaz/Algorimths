/*
We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 
all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost 
digit, and / to discard the rightmost digit. 

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
 */
package basicAlgorithms.codingBat.ap1;

public class O19_AP1_DividesSelf {

	public boolean dividesSelf(int n) {
		String s = (new Integer(n).toString());
		for(char c : s.toCharArray()){
			int i = Character.getNumericValue(c);
			if(i == 0 || n % i != 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		dividesSelf(128) → true	true	OK	    
		dividesSelf(12) → true	true	OK	    
		dividesSelf(120) → false	false	OK	    
		dividesSelf(122) → true	true	OK	    
		dividesSelf(13) → false	false	OK	    
		dividesSelf(32) → false	false	OK	    
		dividesSelf(22) → true	true	OK	    
		dividesSelf(42) → false	false	OK	    
		dividesSelf(212) → true	true	OK	    
		dividesSelf(213) → false	false	OK	    
		dividesSelf(162) → true	true	OK	 
		 */

	}

}
