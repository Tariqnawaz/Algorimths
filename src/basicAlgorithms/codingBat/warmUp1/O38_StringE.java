/*
Return true if the given string contains between 1 and 3 'e' chars. 

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
package basicAlgorithms.codingBat.warmUp1;

public class O38_StringE {
	public static boolean stringE(String str) {
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		    // alternately: str.substring(i, i+1).equals("e")
		  }

		  return (count >= 1 && count <= 3);
		}
	public static void main(String[] args) {
		System.out.println("Return true if the given string contains between 1 and 3 'e' chars:- "+stringE("Hello"));
		System.out.println("Return true if the given string contains between 1 and 3 'e' chars:- "+stringE("Heelle") );
		System.out.println("Return true if the given string contains between 1 and 3 'e' chars:- "+stringE("Heelele"));
		System.out.println("Return true if the given string contains between 1 and 3 'e' chars:- "+stringE("Hll"));
		System.out.println("Return true if the given string contains between 1 and 3 'e' chars:- "+stringE("e"));
		System.out.println("Return true if the given string contains between 1 and 3 'e' chars:- "+stringE(""));
		
	}

}
