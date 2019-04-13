/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0. 

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
package basicAlgorithms.codingBat.string_1;

public class O24_String_WithOutEnd2 {
	public static String withouEnd2(String str) {
		  if(str.length()>1){
		  return str.substring(1,str.length()-1);
		  }else{
		  return "";
		  }
		}

	public static void main(String[] args) {
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2("Hello"));
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2("abc"));
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2("ab"));
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2("a"));
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2(""));
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2("coldy"));
	System.out.println("return a version without both the first and last char of the string.."+withouEnd2("java code"));
	
	}

}
