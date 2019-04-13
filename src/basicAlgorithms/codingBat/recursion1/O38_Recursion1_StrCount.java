/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping. 

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
 */
package basicAlgorithms.codingBat.recursion1;

public class O38_Recursion1_StrCount {

	public int strCount(String str, String sub) {
		  if(str.length() < sub.length()){
			  return 0;
		  }
		  if(str.substring(0,sub.length()).equals(sub)){
			  return 1 + strCount(str.substring(sub.length()), sub);
		  }else{
			  return strCount(str.substring(1), sub);
		  }
	}

	public static void main(String[] args) {
		/*
		strCount("catcowcat", "cat") → 2	2	OK	    
		strCount("catcowcat", "cow") → 1	1	OK	    
		strCount("catcowcat", "dog") → 0	0	OK	    
		strCount("cacatcowcat", "cat") → 2	2	OK	    
		strCount("xyx", "x") → 2	2	OK	    
		strCount("iiiijj", "i") → 4	4	OK	    
		strCount("iiiijj", "ii") → 2	2	OK	    
		strCount("iiiijj", "iii") → 1	1	OK	    
		strCount("iiiijj", "j") → 2	2	OK	    
		strCount("iiiijj", "jj") → 1	1	OK	    
		strCount("aaabababab", "ab") → 4	4	OK	    
		strCount("aaabababab", "aa") → 1	1	OK	    
		strCount("aaabababab", "a") → 6	6	OK	    
		strCount("aaabababab", "b") → 4	4	OK	  
		 */

	}

}
