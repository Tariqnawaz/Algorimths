/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, 
then omit one of the chars, so "abc" and "cat" yields "abcat". 

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
package basicAlgorithms.codingBat.string_1;

public class O33_String_ConCat {
	public static String conCat(String a, String b) {
		  if(a.length() == 0 || b.length() == 0){
		   return a + b;
		  }
		  if(a.substring(a.length()-1).equals(b.substring(0,1))){
		   return a + b.substring(1);
		  }
		  return a + b;
		}

	public static void main(String[] args) {
		System.out.println("return the result..." + conCat("abc", "cat"));
		System.out.println("return the result..." + conCat("dog", "cat"));
		System.out.println("return the result..." + conCat("abc", ""));
		System.out.println("return the result..." + conCat("", "cat"));
		System.out.println("return the result..." + conCat("pig", "g"));
		System.out.println("return the result..." + conCat("pig", "doggy"));
		
	}

}
