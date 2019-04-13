/*

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1. 

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
package basicAlgorithms.codingBat.string_1;

public class O20_String_NonStart {

	public static String nonStart(String a, String b) {
		  String first = a.substring(1,a.length());
		    String second = b.substring(1,b.length());
		    
		    return first + second;
		}
	public static void main(String[] args) {
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("Hello", "There"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("java", "code"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("shotl", "java"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("ab", "xy"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("ab", "x"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("x", "ac"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("a", "x"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("kit", "kat"));
		System.out.println("return their concatenation, except omit the first char of each.."+nonStart("mart", "dart"));
		
	}

}
