/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences 
(in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string. 

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
package basicAlgorithms.codingBat.string2;

public class O15_String_EndOther {
	
	public static boolean endOther(String a, String b) {
		  if(a.length() > b.length()){
		    return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
		  }
		  
		  return b.substring(b.length() - a.length()).equalsIgnoreCase(a);
		}
	public static void main(String[] args) {
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("Hiabc", "abc"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("AbC", "HiaBc"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("abc", "abXabc"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("Hiabc", "abcd"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("Hiabc", "bc"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("Hiabcx", "bc"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("abc", "abc"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("xyz", "12xyz"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("yz", "12xz"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("Z", "12xz"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("12", "12"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("abcXYZ", "abcDEF"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("ab", "ab12"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("ab", "12ab"));
		System.out.println("return true if either of the strings appears at the very end.. "+endOther("ab", "12ab"));
		
	}

}
