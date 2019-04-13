/*
 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2. 

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
package basicAlgorithms.codingBat.string_1;

public class O15_String_ExtraEnd {

	public static String extraEnd(String str) {
		  String lastTwo ="";
		  if(str.length() >= 2){
		   lastTwo = str.substring(str.length()-2);
		  }else{
		   lastTwo = str;
		  }
		  return lastTwo + lastTwo + lastTwo;
		}
	
	public static void main(String[] args) {
		System.out.println("return a new string made of 3 copies.."+extraEnd("Hello"));
		System.out.println("return a new string made of 3 copies.."+extraEnd("ab") );
		System.out.println("return a new string made of 3 copies.."+extraEnd("Hi") );
		System.out.println("return a new string made of 3 copies.."+extraEnd("Candy"));
		System.out.println("return a new string made of 3 copies.."+extraEnd("Code") );

	}

}
