/*

Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed. 

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
package basicAlgorithms.codingBat.warmUp2;

public class O22_String_StringX_U {
	/*public String stringX(String str) {
		  String firstChar = str.substring(0,1);
		  String lastChar = str.substring(str.length()-1);  
		  String midChar = str.substring(firstChar.length() , str.length()-1);
		  String removeX = "";
		  for(int i=0 ; i<midChar.length() ;i++){
		  if(!midChar.charAt(i).equals("x")){
		   removeX += midChar.charAt(i);
		  }
		  }
		  return firstChar + removeX + lastChar;
		}*/
	public static String stringX(String str) {
		  String result = "";
		  for (int i=0; i<str.length(); i++) {
		    // Only append the char if it is not the "x" case
		    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
		    }
		  }
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return a version where all the x have been removed.."+stringX("xxHxix"));
		System.out.println("return a version where all the x have been removed.."+stringX("abxxxcd"));
		System.out.println("return a version where all the x have been removed.."+stringX("xabxxxcdx"));
		System.out.println("return a version where all the x have been removed.."+stringX("xKittenx"));
		System.out.println("return a version where all the x have been removed.."+stringX("Hello"));
		System.out.println("return a version where all the x have been removed.."+stringX("xx"));
		System.out.println("return a version where all the x have been removed.."+stringX("x"));
		System.out.println("return a version where all the x have been removed.."+stringX(""));
	}

}
