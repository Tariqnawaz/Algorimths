/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
package basicAlgorithms.codingBat.warmUp1;

public class O41_EveryNth {
	public static String everyNth(String str, int n) {
		  String result = "";
		  
		  // Look at every nth char
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return the string made starting with char 0:- "+everyNth("Miracle", 2));
		System.out.println("return the string made starting with char 0:- "+everyNth("abcdefg", 2));
		System.out.println("return the string made starting with char 0:- "+everyNth("abcdefg", 3));
		System.out.println("return the string made starting with char 0:- "+everyNth("Chocolate", 3));
		System.out.println("return the string made starting with char 0:- "+everyNth("Chocolates", 3));
		System.out.println("return the string made starting with char 0:- "+everyNth("Chocolates", 4));
		System.out.println("return the string made starting with char 0:- "+everyNth("Chocolates", 100));
	}

}
