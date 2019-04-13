/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more 
digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.) 

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */
package basicAlgorithms.codingBat.string3;

public class O20_String3_SumNumbers {

	public static int sumNumbers(String str) {
		  int old = 0;
		  int sum = 0;
		  
		  for(Character c :str.toCharArray()){
			 if(Character.isDigit(c)){
				 old = 10 * old + Integer.parseInt(c.toString());
			 }else{
				 sum +=old;
				 old = 0;
			 }
		  }
		  return sum += old;
	}

	public static void main(String[] args) {
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("abc123xyz"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("aa11b33"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("7 11"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("Chocolate"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("5hoco1a1e"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("5$$1;;1!!"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers("a1234bb11"));
		System.out.println("return the sum of the numbers appearing in the string.... "+sumNumbers(""));
		
	
	}

}
