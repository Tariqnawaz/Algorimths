/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
package basicAlgorithms.codingBat.warmUp1;

public class O32_MixStart {
	public static boolean mixStart(String str) {
		  // Check if string is too small
		  // (so substring() below does not go off the end)
		  if (str.length() < 3) return false;
		  
		  // Pull out length 2 string for the "ix" part
		  // (i.e. substring starting at index 1 and stopping just before 3).
		  String two = str.substring(1, 3);
		  
		  if (two.equals("ix")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to just:
		  // return(two.equals("ix"));
		}
	public static void main(String[] args) {
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart("mix snacks"));
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart("pix snacks") );
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart("piz snacks"));
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart("nix"));
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart("ni"));
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart("n"));
		System.out.println("except the 'm' can be anything, so pix 9ix :- " +mixStart(""));
	}

}
