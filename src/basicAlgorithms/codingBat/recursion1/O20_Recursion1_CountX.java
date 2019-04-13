/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string. 

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
 */
package basicAlgorithms.codingBat.recursion1;

public class O20_Recursion1_CountX {

	public int countX(String str) {
		  if(str.length() < 2){
			  if(str.equals("x")){
				  return 1;
			  }
			  return 0;
		  }
		  return countX(str.substring(0, str.length() - 1)) + countX(str.substring(str.length() - 1));
	}

	public static void main(String[] args) {
		/*
		countX("xxhixx") → 4	4	OK	    
		countX("xhixhix") → 3	3	OK	    
		countX("hi") → 0	0	OK	    
		countX("h") → 0	0	OK	    
		countX("x") → 1	1	OK	    
		countX("") → 0	0	OK	    
		countX("hihi") → 0	0	OK	    
		countX("hiAAhi12hi") → 0	0	OK
		 */

	}

}
