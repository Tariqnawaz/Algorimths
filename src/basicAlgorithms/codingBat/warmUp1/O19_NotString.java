/*
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the
string unchanged. Note: use .equals() to compare 2 strings. 

notString("candy") ="not candy"
notString("x") = "not x"
notString("not bad") = "not bad"
 */

package basicAlgorithms.codingBat.warmUp1;

public class O19_NotString {
	public static String notString(String str) {
		  String checkFirstThreeChar = "";
		  if(str.length() >= 3){
		    checkFirstThreeChar = str.substring(0,3);
		    if(checkFirstThreeChar.equals("not")){
		    return str;
		    }else{
		    return "not " + str;
		    }
		  }
		   return "not " + str;
		}
	/* coding bat solution
	 public String notString(String str) {
	  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
	    return str;
	  }
	  
	  return "not " + str;
	}
	 */
	public static void main(String[] args) {
		System.out.println("return the string:- " + notString("candy") );
		System.out.println("return the string:- " + notString("x") );
		System.out.println("return the string:- " + notString("not bad"));
		System.out.println("return the string:- " + notString("bad"));
		System.out.println("return the string:- " + notString("not"));
		System.out.println("return the string:- " + notString("is not"));
		System.out.println("return the string:- " + notString("no"));
	}

}
