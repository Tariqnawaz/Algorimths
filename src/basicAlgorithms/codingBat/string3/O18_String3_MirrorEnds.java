/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more 
characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the 
string "abXYZba" has the mirror end "ab". 

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
package basicAlgorithms.codingBat.string3;

public class O18_String3_MirrorEnds {

	public static String mirrorEnds(String string) {
		  String  s = "";
		  for(int ctr = 1; ctr < string.length() + 1 ;++ctr){
			  if(string.substring(0,ctr).equals(new StringBuilder(string.substring(string.length() - ctr)).reverse().toString()) && string.substring(0,ctr).length() > s.length()){
				  s = string.substring(0,ctr);
			  }
			  
		  }
		  return s;
	}

	public static void main(String[] args) {
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("abXYZba"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("abca"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("aba"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("abab"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("xxx"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("xxYxx"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("Hi and iH"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("x"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds(""));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("123and then 321"));
		System.out.println("zero or more characters at the very begining .. "+mirrorEnds("band andab"));
		
		
	}

}
