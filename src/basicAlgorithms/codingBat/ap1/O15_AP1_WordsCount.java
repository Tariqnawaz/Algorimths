/*
Given an array of strings, return the count of the number of strings with the given length. 

wordsCount({"a", "bb", "b", "ccc"}, 1) → 2
wordsCount({"a", "bb", "b", "ccc"}, 3) → 1
wordsCount({"a", "bb", "b", "ccc"}, 4) → 0
 */
package basicAlgorithms.codingBat.ap1;

public class O15_AP1_WordsCount {

	public int wordsCount(String[] words, int len) {
		  int res = 0;
		  for(String s : words){
			  if(s.length() == len ){
				  ++res;
			  }
		  }
		  return res;
	}

	public static void main(String[] args) {
		/*
		wordsCount({"a", "bb", "b", "ccc"}, 1) → 2	2	OK	    
		wordsCount({"a", "bb", "b", "ccc"}, 3) → 1	1	OK	    
		wordsCount({"a", "bb", "b", "ccc"}, 4) → 0	0	OK	    
		wordsCount({"xx", "yyy", "x", "yy", "z"}, 1) → 2	2	OK	    
		wordsCount({"xx", "yyy", "x", "yy", "z"}, 2) → 2	2	OK	    
		wordsCount({"xx", "yyy", "x", "yy", "z"}, 3) → 1	1	OK
		 */

	}

}
