/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.) 

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
 */
package basicAlgorithms.codingBat.string3;

public class O16_String3_SumDigits {

	public static int sumDigits(String str) {
		int res = 0;
		  for(Character c : str.toCharArray()){
			  if(Character.isDigit(c)){
				  res += Integer.parseInt(c.toString());
			  }
			  
		  }
		  return res;
	}

	public static void main(String[] args) {
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("aa1bc2d3"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("aa11b33"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("Chocolate"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("5hoco1a1e"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("123abc123"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits(""));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("Hello"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("X1z9b2"));
		System.out.println("Return 0 if there are no digits in the string... "+sumDigits("5432a"));
		
	}

}
