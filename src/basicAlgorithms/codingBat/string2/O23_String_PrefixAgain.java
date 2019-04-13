/*

Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? 
Assume that the string is not empty and that N is in the range 1..str.length(). 

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */
package basicAlgorithms.codingBat.string2;

public class O23_String_PrefixAgain {
	
	public static boolean prefixAgain(String str, int n) {
		  return str.indexOf(str.substring(0 , n) ,n) !=-1;
	}

	
	public static void main(String[] args) {
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("abXYabc", 1));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("abXYabc", 2));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("abXYabc", 3));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("xyzxyxyxy", 2));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("xyzxyxyxy", 3));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("Hi12345Hi6789Hi10", 1));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("Hi12345Hi6789Hi10", 2));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("Hi12345Hi6789Hi10", 3));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("Hi12345Hi6789Hi10", 4) );
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("a", 1) );
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("aa", 1));
		System.out.println("consider the prefix string made of the first N chars of the string.. "+prefixAgain("ab", 1));
		
	}

}
