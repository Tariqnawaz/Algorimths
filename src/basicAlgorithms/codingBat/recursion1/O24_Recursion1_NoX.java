/*
Given a string, compute recursively a new string where all the 'x' chars have been removed. 

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
 */
package basicAlgorithms.codingBat.recursion1;

public class O24_Recursion1_NoX {

	public String noX(String str) {
		 StringBuffer s = new StringBuffer();
		  if(str.length() < 1){
			  return str;
		  }
		  if(str.substring(0, 1).equals("x")){
			   s.append(noX(str.substring(1)));
			  return s.toString();
		  }else{
			  s.append(str.substring(0 , 1));
			  s.append(noX(str.substring(1)));
			  return s.toString();
		  }
	}

	public static void main(String[] args) {
		/*
		noX("xaxb") → "ab"	"ab"	OK	    
		noX("abc") → "abc"	"abc"	OK	    
		noX("xx") → ""	""	OK	    
		noX("") → ""	""	OK	    
		noX("axxbxx") → "ab"	"ab"	OK	    
		noX("Hellox") → "Hello"	"Hello"	OK
		 */

	}

}
