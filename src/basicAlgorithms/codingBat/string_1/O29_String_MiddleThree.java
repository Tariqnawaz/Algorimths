/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3. 

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
package basicAlgorithms.codingBat.string_1;

public class O29_String_MiddleThree {
	public static String middleThree(String str) {
		  return str.substring(str.length() / 2 -1 , str.length() / 2 + 2) ;
		}

	public static void main(String[] args) {
		System.out.println("return the string length 3 from its middle..." +middleThree("Candy"));
		System.out.println("return the string length 3 from its middle..." +middleThree("and"));
		System.out.println("return the string length 3 from its middle..." +middleThree("solving") );
		System.out.println("return the string length 3 from its middle..." +middleThree("Hi yet Hi"));
		System.out.println("return the string length 3 from its middle..." +middleThree("java yet java"));
		System.out.println("return the string length 3 from its middle..." +middleThree("Chocolate"));
		System.out.println("return the string length 3 from its middle..." +middleThree("XabcxyzabcX") );
		
	
	}

}
