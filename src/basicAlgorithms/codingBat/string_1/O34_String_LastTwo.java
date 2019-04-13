/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign". 

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
package basicAlgorithms.codingBat.string_1;

public class O34_String_LastTwo {
	public static String lastTwo(String str) {
		  if(str.length() >=2){
		 return str.substring(0,str.length()-2) + str.substring(str.length() - 1)+ str.substring(str.length()-2 ,  str.length()-1);
		  }
		  return str;
		}
	public static void main(String[] args) {
		System.out.println("return a new string where the last 2 chars... "+lastTwo("coding"));
		System.out.println("return a new string where the last 2 chars... "+lastTwo("cat"));
		System.out.println("return a new string where the last 2 chars... "+lastTwo("ab"));
		System.out.println("return a new string where the last 2 chars... "+lastTwo("a"));
		System.out.println("return a new string where the last 2 chars... "+lastTwo(""));

	
	}

}
