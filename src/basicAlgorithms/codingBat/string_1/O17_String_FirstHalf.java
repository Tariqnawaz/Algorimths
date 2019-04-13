/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
package basicAlgorithms.codingBat.string_1;

public class O17_String_FirstHalf {
	public static String firstHalf(String str) {
		  return str.substring(0,str.length()/2);
		}

	public static void main(String[] args) {
		System.out.println("return the first half..."+firstHalf("WooHoo"));
		System.out.println("return the first half..."+firstHalf("HelloThere"));
		System.out.println("return the first half..."+firstHalf("abcdef"));
		System.out.println("return the first half..."+firstHalf("ab"));
		System.out.println("return the first half..."+firstHalf(""));
		System.out.println("return the first half..."+firstHalf("0123456789"));
		System.out.println("return the first half..."+firstHalf("kitten"));
		
	}

}
