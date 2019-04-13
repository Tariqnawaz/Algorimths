/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2. 

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi
 */
package basicAlgorithms.codingBat.string_1;

public class O21_String_Left2 {
	public static String left2(String str) {
		  if(str.length() >= 2){
		  String firstTwo = str.substring(0,2);
		  String last = str.substring(firstTwo.length());
		  return last + firstTwo ;
		  }else{
		   return str;
		  }
		}

	public static void main(String[] args) {
		System.out.println("the first 2 chars are moved to the end.."+left2("Hello") );
		System.out.println("the first 2 chars are moved to the end.."+left2("java"));
		System.out.println("the first 2 chars are moved to the end.."+left2("Hi"));
		System.out.println("the first 2 chars are moved to the end.."+left2("code"));
		System.out.println("the first 2 chars are moved to the end.."+left2("cat"));
		System.out.println("the first 2 chars are moved to the end.."+left2("12345"));
		System.out.println("the first 2 chars are moved to the end.."+left2("Chocolate"));
		System.out.println("the first 2 chars are moved to the end.."+left2("bricks"));
		
	}

}
