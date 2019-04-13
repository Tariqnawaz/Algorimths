/*

When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise. 

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
 */
package basicAlgorithms.codingBat.logic1;

public class O11_logic1_CigarParty {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		  return cigars > 39 && (isWeekend || cigars < 61);
	}

	public static void main(String[] args) {
		/*
		cigarParty(30, false) → false	false	OK	    
		cigarParty(50, false) → true	true	OK	    
		cigarParty(70, true) → true	true	OK	    
		cigarParty(30, true) → false	false	OK	    
		cigarParty(50, true) → true	true	OK	    
		cigarParty(60, false) → true	true	OK	    
		cigarParty(61, false) → false	false	OK	    
		cigarParty(40, false) → true	true	OK	    
		cigarParty(39, false) → false	false	OK	    
		cigarParty(40, true) → true	true	OK	    
		cigarParty(39, true) → false	false	OK
		 */

	}

}
