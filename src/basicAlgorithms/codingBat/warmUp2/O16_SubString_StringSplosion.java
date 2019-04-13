/*
Given a non-empty string like "Code" return a string like "CCoCodCode". 

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
package basicAlgorithms.codingBat.warmUp2;

public class O16_SubString_StringSplosion {
	public static String stringSplosion(String str) {
		  String result = "";
		  // On each iteration, add the substring of the chars 0..i
		  for (int i=0; i<str.length(); i++) {
		    result = result + str.substring(0, i+1);
		  }
		  return result;
		}
	public static void main(String[] args) {
	System.out.println("return a string like CCoCodCode" + stringSplosion("Code"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("abc"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("ab"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("x"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("fade"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("There"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("Kitten"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("Bye"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("Good"));
	System.out.println("return a string like CCoCodCode" + stringSplosion("Bad"));
	}
}
