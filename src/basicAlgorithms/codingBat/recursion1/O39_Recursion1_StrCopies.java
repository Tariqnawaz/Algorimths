/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be 
non-negative. 

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
 */
package basicAlgorithms.codingBat.recursion1;

public class O39_Recursion1_StrCopies {

	public boolean strCopies(String str, String sub, int n) {
		  if(str.length() < sub.length()){
			  return n == 0;
		  }
		  if(str.substring(0,sub.length()).equals(sub)){
			  return strCopies(str.substring(1), sub, n - 1);
		  }else{
			  return strCopies(str.substring(1), sub, n);
		  }
	}

	public static void main(String[] args) {
		/*
		strCopies("catcowcat", "cat", 2) → true	true	OK	    
		strCopies("catcowcat", "cow", 2) → false	false	OK	    
		strCopies("catcowcat", "cow", 1) → true	true	OK	    
		strCopies("iiijjj", "i", 3) → true	true	OK	    
		strCopies("iiijjj", "i", 4) → false	false	OK	    
		strCopies("iiijjj", "ii", 2) → true	true	OK	    
		strCopies("iiijjj", "ii", 3) → false	false	OK	    
		strCopies("iiijjj", "x", 3) → false	false	OK	    
		strCopies("iiijjj", "x", 0) → true	true	OK	    
		strCopies("iiiiij", "iii", 3) → true	true	OK	    
		strCopies("iiiiij", "iii", 4) → false	false	OK	    
		strCopies("ijiiiiij", "iiii", 2) → true	true	OK	    
		strCopies("ijiiiiij", "iiii", 3) → false	false	OK	    
		strCopies("dogcatdogcat", "dog", 2) → true	true	OK
		 */

	}

}
