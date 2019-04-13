/*
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*". 

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
 */
package basicAlgorithms.codingBat.recursion1;

public class O29_Recursion1_PairStar {

	public String pairStar(String str) {
		  if(str.length() < 2){
			  return str;
		  }
		  StringBuffer s = new StringBuffer();
		  s.append(str.subSequence(0,1));
		  if(str.substring(0,1).equals(str.subSequence(1,2))){
			  s.append("*");
		  }
		  s.append(pairStar(str.substring(1)));
		  return s.toString();
		  
	}

	public static void main(String[] args) {
		/*
		pairStar("hello") → "hel*lo"	"hel*lo"	OK	    
		pairStar("xxyy") → "x*xy*y"	"x*xy*y"	OK	    
		pairStar("aaaa") → "a*a*a*a"	"a*a*a*a"	OK	    
		pairStar("aaab") → "a*a*ab"	"a*a*ab"	OK	    
		pairStar("aa") → "a*a"	"a*a"	OK	    
		pairStar("a") → "a"	"a"	OK	    
		pairStar("") → ""	""	OK	    
		pairStar("noadjacent") → "noadjacent"	"noadjacent"	OK	    
		pairStar("abba") → "ab*ba"	"ab*ba"	OK	    
		pairStar("abbba") → "ab*b*ba"	"ab*b*ba"	OK
		 */

	}

}
