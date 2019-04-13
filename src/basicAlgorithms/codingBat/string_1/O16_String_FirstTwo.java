/*

Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2,
return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string. 

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */
package basicAlgorithms.codingBat.string_1;

public class O16_String_FirstTwo {

	public static String firstTwo(String str) {
		String firstTwo = "";
		  if(str.length()>=2){
		   firstTwo = str.substring(0,2);
		  }else{
		   firstTwo = str;
		  }
		  return firstTwo;
		}
	public static void main(String[] args) {
		System.out.println(" return the string made of its first two chars..."+firstTwo("Hello"));
		System.out.println(" return the string made of its first two chars..."+firstTwo("abcdefg"));
		System.out.println(" return the string made of its first two chars..."+firstTwo("ab"));
		System.out.println(" return the string made of its first two chars..."+firstTwo("a"));
		System.out.println(" return the string made of its first two chars..."+firstTwo(""));
		System.out.println(" return the string made of its first two chars..."+firstTwo("Kitten") );
		System.out.println(" return the string made of its first two chars..."+firstTwo("hi"));
		System.out.println(" return the string made of its first two chars..."+firstTwo("hiya"));
		
	}

}
