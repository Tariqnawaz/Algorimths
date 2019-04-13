/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last
2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring). 

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
package basicAlgorithms.codingBat.warmUp2;

public class O17_SubString_Last2 {
	
	public static int last2(String str) {
		  // Screen out too-short string case.
		  if (str.length() < 2) return 0;
		  
		  String end = str.substring(str.length()-2);
		  // Note: substring() with 1 value goes through the end of the string
		  int count = 0;
		  
		  // Check each substring length 2 starting at i
		  for (int i=0; i<str.length()-2; i++) {
		    String sub = str.substring(i, i+2);
		    if (sub.equals(end)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
		}
	public static void main(String[] args) {
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("hixxhi") );
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("xaxxaxaxx"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("axxxaaxx"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("xxaxxaxxaxx"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("xaxaxaxx"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("xxxx"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("13121312"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("11212"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("13121311"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("1717171"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("hi"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2("h"));
		System.out.println("return the count of the number of times that a substring length 2 appears "+last2(""));
		
	}

}
