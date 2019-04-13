/*
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars. 

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */
package basicAlgorithms.codingBat.string_1;

public class O31_String_AtFirst {
	public static String atFirst(String str) {
		if(str.length()>=2){
		return str.substring(0,2);
		}else if(str.length()>=1){
		 return str+ "@";
		}
		return "@@";
		}
	
	public static void main(String[] args) {
		System.out.println("return a string length 2 made of its first 2 chars.."+atFirst("hello"));
		System.out.println("return a string length 2 made of its first 2 chars.."+atFirst("hi"));
		System.out.println("return a string length 2 made of its first 2 chars.."+atFirst("h"));
		System.out.println("return a string length 2 made of its first 2 chars.."+atFirst(""));
		System.out.println("return a string length 2 made of its first 2 chars.."+atFirst("kitten"));
		System.out.println("return a string length 2 made of its first 2 chars.."+atFirst("java"));
		
		

	}

}
