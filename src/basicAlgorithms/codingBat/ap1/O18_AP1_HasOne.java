/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit. 

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
 */
package basicAlgorithms.codingBat.ap1;

public class O18_AP1_HasOne {

	public boolean hasOne(int n) {
		String s = (new Integer(n).toString());
		for(char c : s.toCharArray()){
			if(c == '1'){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		/*
		hasOne(10) → true	true	OK	    
		hasOne(22) → false	false	OK	    
		hasOne(220) → false	false	OK	    
		hasOne(212) → true	true	OK	    
		hasOne(1) → true	true	OK	    
		hasOne(9) → false	false	OK	    
		hasOne(211112) → true	true	OK	    
		hasOne(121121) → true	true	OK	    
		hasOne(222222) → false	false	OK	    
		hasOne(56156) → true	true	OK	    
		hasOne(56556) → false	false	OK	
		 */

	}

}
