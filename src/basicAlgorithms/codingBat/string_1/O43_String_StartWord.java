/*
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first 
char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1. 

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */
package basicAlgorithms.codingBat.string_1;

public class O43_String_StartWord {

	public static String startWord(String str, String word) {
		  
		  if(word.length() > str.length()){
		    return "";
		  }
		  
		  for(int ctr = 1 ; ctr < word.length() ; ++ctr){
		    if(str.charAt(ctr) != word.charAt(ctr)){
		      return "";
		    }
		  }
		  return str.substring(0,word.length());
		}


	public static void main(String[] args) {
		System.out.println("return the front of the string.. "+startWord("hippo", "hi"));
		System.out.println("return the front of the string.. "+startWord("hippo", "xip"));
		System.out.println("return the front of the string.. "+startWord("hippo", "i") );
		System.out.println("return the front of the string.. "+startWord("hippo", "ix"));
		System.out.println("return the front of the string.. "+startWord("h", "ix"));
		System.out.println("return the front of the string.. "+startWord("", "i"));
		System.out.println("return the front of the string.. "+startWord("hip", "zi"));
		System.out.println("return the front of the string.. "+startWord("hip", "zip"));
		System.out.println("return the front of the string.. "+startWord("hip", "zig"));
		System.out.println("return the front of the string.. "+startWord("h", "z"));
		System.out.println("return the front of the string.. "+startWord("hippo", "xippo"));
		System.out.println("return the front of the string.. "+startWord("hippo", "xyz"));
		System.out.println("return the front of the string.. "+startWord("hippo", "hip"));
		System.out.println("return the front of the string.. "+startWord("kitten", "cit"));
		System.out.println("return the front of the string.. "+startWord("kit", "cit"));
		
	
	}

}
