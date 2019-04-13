/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". 
If either string is length 0, use '@' for its missing char. 

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@" 
 */
package basicAlgorithms.codingBat.string_1;

public class O32_String_LastChar {
	public static String lastChars(String a, String b) {
		  String aa = "";
		  String bb = "";
		  if(a.length() > 0){
		  aa = a.substring(0,1);
		  }else{
		   aa = "@";
		  }
		  
		  if(b.length() > 0){
		  bb = b.substring(b.length()-1);
		  }else{
		   bb = "@";
		  }
		  
		  return aa + bb;
		}
	/*
	 * coding bat solution
	 public String lastChars(String a, String b) {
		 a = a + "@";
		 b = "@" + b;
		 return a.substring(0,1) + b.substring(b.length()-1);
		  
	 }
	 */
	public static void main(String[] args) {
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("last", "chars") );
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("yo", "java"));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("hi", ""));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("", "hello"));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("", ""));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("kitten", "hi"));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("k", "zip"));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("kitten", ""));
		System.out.println("return a new string made of the first char of a and the last char of b.. "+lastChars("kitten", "zip"));
		
	}

}
