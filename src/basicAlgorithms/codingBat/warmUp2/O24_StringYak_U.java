/*

Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. 
The "yak" strings will not overlap. 

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
package basicAlgorithms.codingBat.warmUp2;

public class O24_StringYak_U {
	public static String stringYak(String str) {
		  String result = "";
		  
		  for (int i=0; i<str.length(); i++) {
		    // Look for i starting a "yak" -- advance i in that case
		    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		      i =  i + 2;
		    } else { // Otherwise do the normal append
		      result = result + str.charAt(i);
		    }
		  }
		  
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return a version where all the yak are removed.."+stringYak("yakpak"));
		System.out.println("return a version where all the yak are removed.."+stringYak("pakyak"));
		System.out.println("return a version where all the yak are removed.."+stringYak("yak123ya"));
		System.out.println("return a version where all the yak are removed.."+stringYak("yak"));
		System.out.println("return a version where all the yak are removed.."+stringYak("yakxxxyak"));
		System.out.println("return a version where all the yak are removed.."+stringYak("HiyakHi"));
		System.out.println("return a version where all the yak are removed.."+stringYak("xxxyakyyyakzzz"));
	
	}

}
