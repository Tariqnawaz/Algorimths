/*

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2. 

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
package basicAlgorithms.codingBat.string_1;

public class O18_String_WithOutEnd {

	public static String withoutEnd(String str) {
		  return str.substring(1,str.length()-1);
		}

	public static void main(String[] args) {
		System.out.println("return a version without the first and last char.."+withoutEnd("Hello"));
		System.out.println("return a version without the first and last char.."+withoutEnd("java"));
		System.out.println("return a version without the first and last char.."+withoutEnd("coding"));
		System.out.println("return a version without the first and last char.."+withoutEnd("code"));
		System.out.println("return a version without the first and last char.."+withoutEnd("ab"));
		System.out.println("return a version without the first and last char.."+withoutEnd("Chocolate!"));
		System.out.println("return a version without the first and last char.."+withoutEnd("kitten"));
		System.out.println("return a version without the first and last char.."+withoutEnd("woohoo"));
		
	}

}
