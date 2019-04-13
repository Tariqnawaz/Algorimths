/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit 
chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length. 

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */
package basicAlgorithms.codingBat.string_1;

public class O39_String_minCat {
	public static String minCat(String a, String b) {
		  if(a.length() == b.length()){
		    return a + b;
		  }
		  
		  if(a.length() < b.length()){
		   return a + b.substring(b.length() - a.length()) ;
		  }
		  return a.substring(a.length() - b.length())  + b ;
		}
	public static void main(String[] args) {
		System.out.println("omit chars from the longer string so it is the same length... "+minCat("Hello", "Hi"));
		System.out.println("omit chars from the longer string so it is the same length... "+minCat("Hello", "java"));
		System.out.println("omit chars from the longer string so it is the same length... "+minCat("java", "Hello"));
		System.out.println("omit chars from the longer string so it is the same length... "+minCat("abc", "x"));
		System.out.println("omit chars from the longer string so it is the same length... "+minCat("x", "abc"));
		System.out.println("omit chars from the longer string so it is the same length... "+minCat("abc", ""));
		
	}

}
