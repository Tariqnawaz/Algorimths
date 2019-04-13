/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars. 

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */
package basicAlgorithms.codingBat.recursion1;

public class O22_Recursion1_ChangeXY {

	public String changeXY(String str) {
		  if(str.length() < 2){
			  if(str.equals("x")){
				  return "y";
			  }
			  return str;
		  }
		  StringBuffer s = new StringBuffer();
		  s.append(changeXY(str.substring(0, 1)));
		  s.append(changeXY(str.substring(1)));
		  return s.toString();
	}

	public static void main(String[] args) {
		/*
		changeXY("codex") → "codey"	"codey"	OK	    
		changeXY("xxhixx") → "yyhiyy"	"yyhiyy"	OK	    
		changeXY("xhixhix") → "yhiyhiy"	"yhiyhiy"	OK	    
		changeXY("hiy") → "hiy"	"hiy"	OK	    
		changeXY("h") → "h"	"h"	OK	    
		changeXY("x") → "y"	"y"	OK	    
		changeXY("") → ""	""	OK	    
		changeXY("xxx") → "yyy"	"yyy"	OK	    
		changeXY("yyhxyi") → "yyhyyi"	"yyhyyi"	OK	    
		changeXY("hihi") → "hihi"	"hihi"	OK
		 */

	}

}
