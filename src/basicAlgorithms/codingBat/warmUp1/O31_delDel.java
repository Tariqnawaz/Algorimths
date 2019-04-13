/*
 Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged. 

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
package basicAlgorithms.codingBat.warmUp1;

public class O31_delDel {
	public static String delDel(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
		    // First char + rest of string starting at 4
		    return str.substring(0, 1) + str.substring(4);
		  }
		  // Otherwise return the original string.
		  return str;
		}
	
	public static void main(String[] args) {
		System.out.println(" return the string unchanged:- "+delDel("adelbc"));
		System.out.println(" return the string unchanged:- "+delDel("adelHello"));
		System.out.println(" return the string unchanged:- "+delDel("adedbc") );
		System.out.println(" return the string unchanged:- "+delDel("abcdel"));
		System.out.println(" return the string unchanged:- "+delDel("add") );
		System.out.println(" return the string unchanged:- "+delDel("ad") );
		System.out.println(" return the string unchanged:- "+delDel("a"));
		System.out.println(" return the string unchanged:- "+delDel(""));
		System.out.println(" return the string unchanged:- "+delDel("del"));
		System.out.println(" return the string unchanged:- "+delDel("adel"));
		System.out.println(" return the string unchanged:- "+delDel("aadelbb"));
		}

}
