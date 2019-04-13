/*

Given a string and an int N, return a string made of N repetitions of the last N characters of the string. You may assume 
that N is between 0 and the length of the string, inclusive. 

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
 */
package basicAlgorithms.codingBat.string2;

public class O20_String_RepeatEnd {

	public static String repeatEnd(String str, int n) {
		String result = new String();
		String lastChar = "";
		  for(int i = 0 ; i< n ; i ++){
		   lastChar = str.substring(str.length() - n);
		   result = result  + lastChar;
		  }
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return a string made of N repetitions.. "+repeatEnd("Hello", 3));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("Hello", 2));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("Hello", 1));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("Hello", 0));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("abc", 3));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("1234", 2));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("1234", 3));
		System.out.println("return a string made of N repetitions.. "+repeatEnd("", 0));
		
	}

}
