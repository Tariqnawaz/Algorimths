/*
Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, 
make a new array of the correct length, and then copy over the correct strings. 

wordsWithout({"a", "b", "c", "a"}, "a") → {"b", "c"}
wordsWithout({"a", "b", "c", "a"}, "b") → {"a", "c", "a"}
wordsWithout({"a", "b", "c", "a"}, "c") → {"a", "b", "a"}
 */
package basicAlgorithms.codingBat.ap1;

import java.util.ArrayList;
import java.util.List;

public class O24_AP1_WordsWithout {

	public String[] wordsWithout(String[] words, String target) {
		  List<String> l = new ArrayList<String>();
		  for(String s : words){
			  if(!s.equals(target)){
				  l.add(s);
			  }
		  }
		  String[] res = new String[l.size()];
		  for(int ctr = 0 ; ctr < res.length;++ctr){
			  res[ctr] = l.get(ctr);
		  }
		  return res;
	}

	public static void main(String[] args) {
		/*
		wordsWithout({"a", "b", "c", "a"}, "a") → {"b", "c"}	{"b", "c"}	OK	    
		wordsWithout({"a", "b", "c", "a"}, "b") → {"a", "c", "a"}	{"a", "c", "a"}	OK	    
		wordsWithout({"a", "b", "c", "a"}, "c") → {"a", "b", "a"}	{"a", "b", "a"}	OK	    
		wordsWithout({"b", "c", "a", "a"}, "b") → {"c", "a", "a"}	{"c", "a", "a"}	OK	    
		wordsWithout({"xx", "yyy", "x", "yy", "x"}, "x") → {"xx", "yyy", "yy"}	{"xx", "yyy", "yy"}	OK	    
		wordsWithout({"xx", "yyy", "x", "yy", "x"}, "yy") → {"xx", "yyy", "x", "x"}	{"xx", "yyy", "x", "x"}	OK	    
		wordsWithout({"aa", "ab", "ac", "aa"}, "aa") → {"ab", "ac"}	{"ab", "ac"}	OK	
		 */

	}

}
