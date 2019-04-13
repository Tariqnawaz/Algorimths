/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo". 

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
package basicAlgorithms.codingBat.warmUp2;

public class O15_SubString_StringBits {
	public static String stringBits(String str) {
		  String result = "";
		  // Note: the loop increments i by 2
		  for (int i=0; i<str.length(); i+=2) {
		    result = result + str.substring(i, i+1);
		    // Alternately could use str.charAt(i)
		  }
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return a new string made of every other char starting with the first"+stringBits("Hello") );
		System.out.println("return a new string made of every other char starting with the first"+stringBits("Hi") );
		System.out.println("return a new string made of every other char starting with the first"+stringBits("Heeololeo"));
		System.out.println("return a new string made of every other char starting with the first"+stringBits("HiHiHi"));
		System.out.println("return a new string made of every other char starting with the first"+stringBits(""));
		System.out.println("return a new string made of every other char starting with the first"+stringBits("Greetings"));
		System.out.println("return a new string made of every other char starting with the first"+stringBits("Chocoate"));
		System.out.println("return a new string made of every other char starting with the first"+stringBits("pi"));
		System.out.println("return a new string made of every other char starting with the first"+stringBits("Hello Kitten"));
		System.out.println("return a new string made of every other char starting with the first"+stringBits("hxaxpxpxy") );
	}

}
