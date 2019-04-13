/*

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j. 

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
package basicAlgorithms.codingBat.string_1;

public class O14_MakeOutWord {
	
	public static String makeOutWord(String out, String word) {
		  return  out.substring(0,out.length() /2) + word + out.substring(out.length() /2);
		}
	public static void main(String[] args) {
		System.out.println("return a new string.."+makeOutWord("<<>>", "Yay"));
		System.out.println("return a new string.."+makeOutWord("<<>>", "WooHoo"));
		System.out.println("return a new string.."+makeOutWord("[[]]", "word") );
		System.out.println("return a new string.."+makeOutWord("HHoo", "Hello"));
		System.out.println("return a new string.."+makeOutWord("abyz", "YAY"));
		
	}

}
