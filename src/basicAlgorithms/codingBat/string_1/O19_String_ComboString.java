/*
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0). 

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */
package basicAlgorithms.codingBat.string_1;

public class O19_String_ComboString {
	public static String comboString(String a, String b) {
		  if(a.length() > b.length()){
		     return b + a + b;
		     }else{
		     return a + b + a;
		     }
		}

	public static void main(String[] args) {
		System.out.println("return a string of the form short+long+short...."+comboString("Hello", "hi"));
		System.out.println("return a string of the form short+long+short...."+comboString("hi", "Hello"));
		System.out.println("return a string of the form short+long+short...."+comboString("aaa", "b"));
		System.out.println("return a string of the form short+long+short...."+comboString("b", "aaa"));
		System.out.println("return a string of the form short+long+short...."+comboString("aaa", ""));
		System.out.println("return a string of the form short+long+short...."+comboString("", "bb"));
		System.out.println("return a string of the form short+long+short...."+comboString("aaa", "1234"));
		System.out.println("return a string of the form short+long+short...."+comboString("aaa", "bb"));
		System.out.println("return a string of the form short+long+short...."+comboString("a", "bb"));
		System.out.println("return a string of the form short+long+short...."+comboString("bb", "a"));
		System.out.println("return a string of the form short+long+short...."+comboString("xyz", "ab"));
		
	}

}
