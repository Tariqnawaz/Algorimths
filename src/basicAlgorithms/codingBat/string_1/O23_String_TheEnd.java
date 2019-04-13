/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty. 

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
package basicAlgorithms.codingBat.string_1;

public class O23_String_TheEnd {
	public static String theEnd(String str, boolean front) {
		  if(front){
		  return str.substring(0,1);
		  }else{
		  return str.substring(str.length()-1);
		  }
		  
		}

	public static void main(String[] args) {
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("Hello", true));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("Hello", false));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("oh", true));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("oh", false));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("x", true));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("x", false));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("java", true));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("chocolate", false));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("1234", true));
		System.out.println("eturn a string length 1 from its front, unless front is false.."+theEnd("code", false));
		
	}

}
