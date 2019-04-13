/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string. 

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
 */
package basicAlgorithms.codingBat.recursion1;

public class O30_Recursion1_EndX {

	public String endX(String str) {
		 if(str.length() < 2){
			 return str;
		 }
		 StringBuffer s = new StringBuffer();
		 if(str.substring(0, 1).equals("x")){
			 s.append(endX(str.substring(1)));
			 s.append("x");
		 }
		 else{
			 s.append(str.substring(0 ,1));
			 s.append(endX(str.substring(1)));
		 }
		 return s.toString();
	}

	public static void main(String[] args) {
		/*
		endX("xxre") → "rexx"	"rexx"	OK	    
		endX("xxhixx") → "hixxxx"	"hixxxx"	OK	    
		endX("xhixhix") → "hihixxx"	"hihixxx"	OK	    
		endX("hiy") → "hiy"	"hiy"	OK	    
		endX("h") → "h"	"h"	OK	    
		endX("x") → "x"	"x"	OK	    
		endX("xx") → "xx"	"xx"	OK	    
		endX("") → ""	""	OK	    
		endX("bxx") → "bxx"	"bxx"	OK	    
		endX("bxax") → "baxx"	"baxx"	OK	    
		endX("axaxax") → "aaaxxx"	"aaaxxx"	OK	    
		endX("xxhxi") → "hixxx"	"hixxx"	OK
		 */

	}

}
