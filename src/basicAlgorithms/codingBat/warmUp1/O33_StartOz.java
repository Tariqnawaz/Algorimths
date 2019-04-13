/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the
 second only if it is 'z', so "ozymandias" yields "oz". 

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
package basicAlgorithms.codingBat.warmUp1;

public class O33_StartOz {
	public static String startOz(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("ozymandias:- "+startOz("ozymandias"));
		System.out.println("ozymandias:- "+startOz("bzoo"));
		System.out.println("ozymandias:- "+startOz("oxx"));
		System.out.println("ozymandias:- "+startOz("oz"));
		System.out.println("ozymandias:- "+startOz("ounce"));
		System.out.println("ozymandias:- "+startOz("o"));
		System.out.println("ozymandias:- "+startOz("abc") );
		System.out.println("ozymandias:- "+startOz(""));
		System.out.println("ozymandias:- "+startOz("zoo"));
		System.out.println("ozymandias:- "+startOz("aztec"));
		System.out.println("ozymandias:- "+startOz("zzzz"));
		
	}

}