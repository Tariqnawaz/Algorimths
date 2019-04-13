/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately
preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.) 

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */
package basicAlgorithms.codingBat.string3;

public class O21_String3_NotReplace {

	public static String notReplace(String str) {
		  StringBuffer s = new StringBuffer();
		  s.append(str);
		  int pos = 0;
		  while(true){
			  pos = s.toString().indexOf("is", pos);
			  if(pos == -1){
				  break;
			  }
			  if( (pos == 0 && s.length() == 2) ||
				  (pos == 0 && !Character.isLetter(s.charAt(pos + 2))) ||
				  ((pos > 0 && !Character.isLetter(s.charAt(pos - 1))) &&	
				  (pos < s.length() - 2 && !Character.isLetter(s.charAt(pos + 2)))) ||
				  (pos == s.length() - 2 && !Character.isLetter(s.charAt(pos - 1)))){
				  s.replace(pos, pos + 2, "is not");
				  pos += 6;
				  
			  }else{
				  ++pos;
			  }
		  }
		  return s.toString();
	}

	public static void main(String[] args) {
		System.out.println(".... "+notReplace("is test") );
		System.out.println(".... "+notReplace("is-is") );
		System.out.println(".... "+notReplace("This is right"));
		System.out.println(".... "+notReplace("This is isabell"));
		System.out.println(".... "+notReplace(""));
		System.out.println(".... "+notReplace("is"));
		System.out.println(".... "+notReplace("isis"));
		System.out.println(".... "+notReplace("Dis is bliss is"));
		System.out.println(".... "+notReplace("is his"));
		System.out.println(".... "+notReplace("xis yis"));
		System.out.println(".... "+notReplace("AAAis is"));
		
	}

}
