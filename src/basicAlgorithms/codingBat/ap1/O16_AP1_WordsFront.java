/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length. 

wordsFront({"a", "b", "c", "d"}, 1) → {"a"}
wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}
wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
 */
package basicAlgorithms.codingBat.ap1;

public class O16_AP1_WordsFront {

	public String[] wordsFront(String[] words, int n) {
		  String [] w = new String[n];
		  for(int ctr = 0 ; ctr < w.length; ++ctr){
			  w[ctr] = words[ctr];
		  }
		  return w;
	}

	public static void main(String[] args) {
		/*
		wordsFront({"a", "b", "c", "d"}, 1) → {"a"}	{"a"}	OK	    
		wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}	{"a", "b"}	OK	    
		wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}	{"a", "b", "c"}	OK	    
		wordsFront({"a", "b", "c", "d"}, 4) → {"a", "b", "c", "d"}	{"a", "b", "c", "d"}	OK	    
		wordsFront({"Hi", "There"}, 1) → {"Hi"}	{"Hi"}	OK	    
		wordsFront({"Hi", "There"}, 2) → {"Hi", "There"}	{"Hi", "There"}	OK
		 */

	}

}
