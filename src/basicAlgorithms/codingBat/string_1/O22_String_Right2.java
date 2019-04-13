/*

Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2. 

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */
package basicAlgorithms.codingBat.string_1;

public class O22_String_Right2 {
	public static String right2(String str) {
		if(str.length() >=2){
			String first = str.substring(0,str.length()-2);
			String lastTwo = str.substring(first.length());
			return lastTwo + first ;
			}else{
				return str;
			}
		}
	public static void main(String[] args) {
		System.out.println("the last 2 chars are moved to the start..."+right2("Hello"));
		System.out.println("the last 2 chars are moved to the start..."+right2("java"));
		System.out.println("the last 2 chars are moved to the start..."+right2("Hi"));
		System.out.println("the last 2 chars are moved to the start..."+right2("code"));
		System.out.println("the last 2 chars are moved to the start..."+right2("cat"));
		System.out.println("the last 2 chars are moved to the start..."+right2("12345"));
		
	}

}
