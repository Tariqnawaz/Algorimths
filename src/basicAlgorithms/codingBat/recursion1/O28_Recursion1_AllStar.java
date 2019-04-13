/*

Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*". 

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
 */
package basicAlgorithms.codingBat.recursion1;

public class O28_Recursion1_AllStar {

	public String allStar(String str) {
		  if(str.length() < 2){
			  return str;
		  }
		  StringBuffer s = new StringBuffer();
		  s.append(str.substring(0,1));
		  s.append("*");
		  s.append(allStar(str.substring(1)));
		  return s.toString();
	}

	public static void main(String[] args) {
		/*
		allStar("hello") → "h*e*l*l*o"	"h*e*l*l*o"	OK	    
		allStar("abc") → "a*b*c"	"a*b*c"	OK	    
		allStar("ab") → "a*b"	"a*b"	OK	    
		allStar("a") → "a"	"a"	OK	    
		allStar("") → ""	""	OK	    
		allStar("3.14") → "3*.*1*4"	"3*.*1*4"	OK	    
		allStar("Chocolate") → "C*h*o*c*o*l*a*t*e"	"C*h*o*c*o*l*a*t*e"	OK	    
		allStar("1234") → "1*2*3*4"	"1*2*3*4"	OK
		 */

	}

}
