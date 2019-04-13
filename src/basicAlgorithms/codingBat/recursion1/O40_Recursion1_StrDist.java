/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length. 

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
 */
package basicAlgorithms.codingBat.recursion1;

public class O40_Recursion1_StrDist {

	public int strDist(String str, String sub) {
		  if(str.length() < sub.length()){
			  return 0;
		  }
		  if(!str.substring(0,sub.length()).equals(sub)){
			  return strDist(str.substring(1), sub);
		  }
		  if(!str.substring(str.length() -sub.length()).equals(sub)){
			  return strDist(str.substring(0 , str.length() - 1), sub);
		  }
		  return str.length();
	}

	public static void main(String[] args) {
		/*
		strDist("catcowcat", "cat") → 9	9	OK	    
		strDist("catcowcat", "cow") → 3	3	OK	    
		strDist("cccatcowcatxx", "cat") → 9	9	OK	    
		strDist("abccatcowcatcatxyz", "cat") → 12	12	OK	    
		strDist("xyx", "x") → 3	3	OK	    
		strDist("xyx", "y") → 1	1	OK	    
		strDist("xyx", "z") → 0	0	OK	    
		strDist("z", "z") → 1	1	OK	    
		strDist("x", "z") → 0	0	OK	    
		strDist("", "z") → 0	0	OK	    
		strDist("hiHellohihihi", "hi") → 13	13	OK	    
		strDist("hiHellohihihi", "hih") → 5	5	OK	    
		strDist("hiHellohihihi", "o") → 1	1	OK	    
		strDist("hiHellohihihi", "ll") → 2	2	OK	  
		 */

	}

}
