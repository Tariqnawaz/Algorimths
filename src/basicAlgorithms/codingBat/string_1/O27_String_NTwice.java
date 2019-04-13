/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n. 

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */
package basicAlgorithms.codingBat.string_1;

public class O27_String_NTwice {
	/*public String nTwice(String str, int n) {
		 if(str.length() >= n){
		  String first = str.substring(0,n);
		  String last = str.substring(str.length()-n);
		  return first + last;
		  }
		  return str;
		}
*/
	public static String nTwice(String str, int n) {
		 
			 return  str.substring(0,n) + str.substring(str.length()-n);
		
	}

	public static void main(String[] args) {
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Hello", 2) );
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Chocolate", 3));
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Chocolate", 1));
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Chocolate", 0));
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Hello", 4));
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Code", 4));
	System.out.println(" return a string made of the first and last n chars..."+nTwice("Code", 2));
	
	}

}
