/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
since the "xx", "aa", and "az" substrings appear in the same place in both strings. 

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
package basicAlgorithms.codingBat.warmUp2;

public class O21_String_StringMatch_U {
	public static int stringMatch(String a, String b) {
		  // Figure which string is shorter.
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  
		  // Look at both substrings starting at i
		  for (int i=0; i<len-1; i++) {
		    String aSub = a.substring(i, i+2);
		    String bSub = b.substring(i, i+2);
		    if (aSub.equals(bSub)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
		}
	public static void main(String[] args) {
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("xxcaazz", "xxbaaz"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("abc", "abc"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("abc", "axc"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("hello", "he"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("he", "hello"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("h", "hello"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("", "hello"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("aabbccdd", "abbbxxd"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("aaxxaaxx", "iaxxai"));
	System.out.println("return the number of the positions where they contain the same length 2 substring.."+stringMatch("iaxxai", "aaxxaaxx"));
	}

}
