/*

Given two strings, word and a separator, return a big string made of count occurences of the word, separated by the separator string. 

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
package basicAlgorithms.codingBat.string2;

public class O22_String_RepeatSeparator {
	
	public static String repeatSeparator(String word, String sep, int count) {
		  if(count  == 0){
			  return "";
		  }
		  
		  StringBuffer s = new StringBuffer();
		  for( int ctr = 0 ; ctr < count -1 ; ctr++){
			  s.append(word);
			  s.append(sep);
		  }
		  s.append(word);
		  return s.toString();
	}

	public static void main(String[] args) {
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("Word", "X", 3));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("This", "And", 2));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("This", "And", 1));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("Hi", "-n-", 2));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("AAA", "", 1));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("AAA", "", 0));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("A", "B", 5));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("abc", "XX", 3));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("abc", "XX", 2));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("abc", "XX", 1));
		System.out.println(" return a big string made of count occurences of the word... "+repeatSeparator("XYZ", "a", 2));
		
	
	}

}
