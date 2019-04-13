/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is 
more difficult because it uses arrays. 

wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}
 */
package basicAlgorithms.codingBat.ap1;

import java.util.ArrayList;
import java.util.List;

public class O17_AP1_WordsWithoutList {

	public List wordsWithoutList(String[] words, int len) {
		  List<String> l = new ArrayList<String>();
		  for(String s : words){
			  if(s.length() != len){
				  l.add(s);
			  }
		  }
		  return l;
	}

	public static void main(String[] args) {
		/*
		wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}	{"bb", "ccc"}	OK	    
		wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}	{"a", "bb", "b"}	OK	    
		wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}	{"a", "bb", "b", "ccc"}	OK	    
		wordsWithoutList({"xx", "yyy", "x", "yy", "z"}, 1) → {"xx", "yyy", "yy"}	{"xx", "yyy", "yy"}	OK	    
		wordsWithoutList({"xx", "yyy", "x", "yy", "z"}, 2) → {"yyy", "x", "z"}	{"yyy", "x", "z"}	OK
		 */

	}

}
