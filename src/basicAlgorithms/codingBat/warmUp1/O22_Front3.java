/*
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front. 

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */
package basicAlgorithms.codingBat.warmUp1;

public class O22_Front3 {
	public static String front3(String str) {
		  if(str.length() >= 3){
		   String front = str.substring(0,3);
		   return front + front + front;
		  }
		  return str + str + str;
		}
	/*coding bat solution
	public String front3(String str) {
	  String front;
	  
	  if (str.length() >= 3) {
	    front = str.substring(0, 3);
	  }
	  else {
	    front = str;
	  }
	
	  return front + front + front;
	}
	 */
	public static void main(String[] args) {
	System.out.println("Return a new string which is 3 copies of the front:- "+front3("Java"));
	System.out.println("Return a new string which is 3 copies of the front:- "+front3("Chocolate"));
	System.out.println("Return a new string which is 3 copies of the front:- "+front3("abc"));
	System.out.println("Return a new string which is 3 copies of the front:- "+front3("abcXYZ"));
	System.out.println("Return a new string which is 3 copies of the front:- "+front3("ab"));
	System.out.println("Return a new string which is 3 copies of the front:- "+front3("a") );
	System.out.println("Return a new string which is 3 copies of the front:- "+front3(""));
	
	}

}
