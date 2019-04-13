/*
Given a string, return a string where for every char in the original, there are two chars. 

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
package basicAlgorithms.codingBat.string2;

public class O11_String_DoubleChar_toCharArray {
	/*public static String doubleChar(String str) {
		  String result = "";
		  for(int i =0 ; i<str.length(); i++){
		    result += str.substring(i,i+1) + str.substring(i,i+1);
		  }
		  return result;
		}*/
	/*coding bat solution*/
	public static String doubleChar(String str) {
		  
		  StringBuffer b = new StringBuffer();
		  for(char c : str.toCharArray()){
		     b.append(c);
		     b.append(c);
		  }
		  return b.toString();
		}
	public static void main(String[] args) {
		System.out.println("return a string where for every char in the original.."+doubleChar("The"));
		System.out.println("return a string where for every char in the original.."+doubleChar("AAbb"));
		System.out.println("return a string where for every char in the original.."+doubleChar("Hi-There"));
		System.out.println("return a string where for every char in the original.."+doubleChar("Word!"));
		System.out.println("return a string where for every char in the original.."+doubleChar("!!"));
		System.out.println("return a string where for every char in the original.."+doubleChar(""));
		System.out.println("return a string where for every char in the original.."+doubleChar("a"));
		System.out.println("return a string where for every char in the original.."+doubleChar("aa"));
		
	}

}
