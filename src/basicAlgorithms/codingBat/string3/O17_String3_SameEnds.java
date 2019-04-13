
/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab". 

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */
package basicAlgorithms.codingBat.string3;

public class O17_String3_SameEnds {
	
	public static String sameEnds(String string) {
		String s = "";
				  for(int ctr = 1; ctr < string.length() / 2 + 1;++ctr){
					  if(string.substring(0,ctr).equals(string.substring(string.length() - ctr)) && string.substring(0,ctr).length() > s.length() ){
						 s = string.substring(0, ctr);
					  }
					  
				  }
				  return s;
		}
	public static void main(String[] args) {
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("abXYab"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("xx"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("xxx"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("xxxx"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("javaXYZjava"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("javajava"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("xavaXYZjava"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("Hello! and Hello!"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("x"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds(""));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("abcb"));
		System.out.println("return the longest substring that appears at both the beginning and end.. "+sameEnds("mymmy"));
		
	}

}
