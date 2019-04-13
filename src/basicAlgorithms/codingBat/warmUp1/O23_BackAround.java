/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
The original string will be length 1 or more. 

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
package basicAlgorithms.codingBat.warmUp1;

public class O23_BackAround {
	public static String backAround(String str) {
		  String back = str.substring(str.length()-1);
		  return back + str + back;
		}
	public static void main(String[] args) {
	System.out.println("return a new string with the last char added at the front and back:- " +backAround("cat"));
	System.out.println("return a new string with the last char added at the front and back:- " +backAround("Hello"));
	System.out.println("return a new string with the last char added at the front and back:- " +backAround("a"));
	System.out.println("return a new string with the last char added at the front and back:- " +backAround("abc"));
	System.out.println("return a new string with the last char added at the front and back:- " +backAround("read"));
	System.out.println("return a new string with the last char added at the front and back:- " +backAround("boo"));
	}
}
