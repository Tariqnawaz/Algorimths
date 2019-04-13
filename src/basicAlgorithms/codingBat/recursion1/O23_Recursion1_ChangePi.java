/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". 

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */
package basicAlgorithms.codingBat.recursion1;

public class O23_Recursion1_ChangePi {

	public String changePi(String str) {
		  StringBuffer s = new StringBuffer();
		  if(str.length() < 2){
			  return str;
		  }
		  if(str.substring(0, 2).equals("pi")){
			  s.append("3.14");
			  s.append(changePi(str.substring(2)));
			  return s.toString();
		  }else{
			  s.append(str.substring(0 , 1));
			  s.append(changePi(str.substring(1)));
			  return s.toString();
		  }
	}

	public static void main(String[] args) {
		/*
		changePi("xpix") → "x3.14x"	"x3.14x"	OK	    
		changePi("pipi") → "3.143.14"	"3.143.14"	OK	    
		changePi("pip") → "3.14p"	"3.14p"	OK	    
		changePi("pi") → "3.14"	"3.14"	OK	    
		changePi("hip") → "hip"	"hip"	OK	    
		changePi("p") → "p"	"p"	OK	    
		changePi("x") → "x"	"x"	OK	    
		changePi("") → ""	""	OK	    
		changePi("pixx") → "3.14xx"	"3.14xx"	OK	    
		changePi("xyzzy") → "xyzzy"	"xyzzy"	OK
		 */

	}

}
