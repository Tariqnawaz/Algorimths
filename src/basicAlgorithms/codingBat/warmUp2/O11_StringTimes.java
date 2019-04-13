/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string. 

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
package basicAlgorithms.codingBat.warmUp2;

public class O11_StringTimes {
	public static String stringTimes(String str, int n) {
		  String result ="";
		  for(int i = 1 ; i<= n ;i++){
		  result += str;
		  }
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("Hi", 2));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("Hi", 3));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("Hi", 1) );
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("Hi", 0));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("Hi", 5));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("Oh Boy!", 2));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("x", 4));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("", 4));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("code", 2));
		System.out.println("return a larger string that is n copies of the original string:- "+stringTimes("code", 3));
		
	}

}
