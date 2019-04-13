/*

Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2. 

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
package basicAlgorithms.codingBat.string_1;

public class O25_String_MiddleTwo {
	public static String middleTwo(String str) {
		  String firstStringLastChar = str.substring(str.length() / 2 - 1 , str.length() / 2);
		  String secondChar = str.substring(str.length() / 2  , str.length() / 2 + 1);
		  return firstStringLastChar + secondChar  ;
		}
	public static void main(String[] args) {
		System.out.println("return a string made of the middle two chars,..."+middleTwo("string"));
		System.out.println("return a string made of the middle two chars,..."+middleTwo("code"));
		System.out.println("return a string made of the middle two chars,..."+middleTwo("Practice"));
		System.out.println("return a string made of the middle two chars,..."+middleTwo("ab"));
		System.out.println("return a string made of the middle two chars,..."+middleTwo("0123456789"));
	}

}
