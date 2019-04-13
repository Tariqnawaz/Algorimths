/*

Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza". 

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
 */
package basicAlgorithms.codingBat.recursion1;

public class O34_Recursion1_StringClean {

	public String stringClean(String str) {
		  if(str.length() < 2){
			  return str;
		  }
		  if(str.substring(0,1).equals(str.subSequence(1,2)) ){
			  return stringClean(str.substring(1));
		  }
		  StringBuffer s = new StringBuffer();
		  s.append(str.substring(0 , 1));
		  s.append(stringClean(str.substring(1)));
		  return s.toString();
	}

	public static void main(String[] args) {
		/*
		stringClean("yyzzza") → "yza"	"yza"	OK	    
		stringClean("abbbcdd") → "abcd"	"abcd"	OK	    
		stringClean("Hello") → "Helo"	"Helo"	OK	    
		stringClean("XXabcYY") → "XabcY"	"XabcY"	OK	    
		stringClean("112ab445") → "12ab45"	"12ab45"	OK	    
		stringClean("Hello Bookkeeper") → "Helo Bokeper"	"Helo Bokeper"	OK
		 */

	}

}
