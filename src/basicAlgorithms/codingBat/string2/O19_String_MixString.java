/*
Given two strings, A and B, create a bigger string made of the first char of A, the first char of B, the second char of A, the second char of B, 
and so on. Any leftover chars go at the end of the result. 

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
package basicAlgorithms.codingBat.string2;

public class O19_String_MixString {

	public static String mixString(String a, String b) {
		  StringBuffer s = new StringBuffer();
		  
		  for(int ctr = 0 ; ctr < Math.min(a.length(), b.length());++ctr){
			  s.append(a.charAt(ctr));
			  s.append(b.charAt(ctr));
		  }
		  if(a.length() > b.length()){
			  s.append(a.substring(b.length()));
		  }else{
			  s.append(b.substring(a.length()));
		  }
		  return s.toString();
	}

	
	public static void main(String[] args) {
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("abc", "xyz"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("Hi", "There"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("xxxx", "There"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("xxx", "X"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("2/", "27 around"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("", "Hello"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("Abc", ""));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("", ""));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("a", "b"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("ax", "b"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("a", "bx"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("So", "Long"));
		System.out.println("Given two strings, A and B, create a bigger string made of the first char .. " +mixString("Long", "So"));
		
	}

}
