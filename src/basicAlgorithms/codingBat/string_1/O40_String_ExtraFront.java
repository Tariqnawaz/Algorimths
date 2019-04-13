/*
 Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If 
 there are fewer than 2 chars, use whatever is there. 

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
 */
package basicAlgorithms.codingBat.string_1;

public class O40_String_ExtraFront {
	public static String extraFront(String str) {
		  if(str.length() >= 2){
		   String first = str.substring(0 , 2);
		   return first + first + first ;
		  }
		  return str + str + str;
		}

	public static void main(String[] args) {
		System.out.println("return a new string made of 3 copies of the first 2 chars.. "+extraFront("Hello"));
		System.out.println("return a new string made of 3 copies of the first 2 chars.. "+extraFront("ab"));
		System.out.println("return a new string made of 3 copies of the first 2 chars.. "+extraFront("H"));
		System.out.println("return a new string made of 3 copies of the first 2 chars.. "+extraFront(""));
		System.out.println("return a new string made of 3 copies of the first 2 chars.. "+extraFront("Candy"));
		System.out.println("return a new string made of 3 copies of the first 2 chars.. "+extraFront("Code"));
		
	}

}
