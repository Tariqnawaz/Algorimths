/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings. 

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
package basicAlgorithms.codingBat.string_1;

public class O30_String_HasBad {
	public static boolean hasBad(String str) {
	    if(str.length() < 3){
	    return false;
	  }
	  if(str.substring(0,3).equals("bad")){
	    return true;
	  }
	  if(str.length() < 4){
	    return false;
	  }
	  if(str.substring(1,4).equals("bad")){
	    return true;
	  }
	  return false;

	}

	public static void main(String[] args) {
		System.out.println("return true if bad appears.. "+hasBad("badxx") );
		System.out.println("return true if bad appears.. "+hasBad("xbadxx"));
		System.out.println("return true if bad appears.. "+hasBad("xxbadxx"));
		System.out.println("return true if bad appears.. "+hasBad("code"));
		System.out.println("return true if bad appears.. "+hasBad("bad"));
		System.out.println("return true if bad appears.. "+hasBad("ba"));
		System.out.println("return true if bad appears.. "+hasBad("xba"));
		System.out.println("return true if bad appears.. "+hasBad("xbad"));
		System.out.println("return true if bad appears.. "+hasBad(""));
		
		
	
	}

}
