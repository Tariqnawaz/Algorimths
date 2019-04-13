/*

We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs --
 2 for A and 1 for x. Recursively compute the number of pairs in the given string. 

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1
 */
package basicAlgorithms.codingBat.recursion1;

public class O31_Recursion1_CountPairs {

	public int countPairs(String str) {
		if(str.length() < 3){
			  return 0;
		  }
		  if(str.subSequence(0,1).equals(str.subSequence(2,3)) ){
			  return 1 + countPairs(str.substring(1));
		  }
		  return countPairs(str.substring(1));
	}

	public static void main(String[] args) {
		/*
		countPairs("axa") → 1	1	OK	    
		countPairs("axax") → 2	2	OK	    
		countPairs("axbx") → 1	1	OK	    
		countPairs("hi") → 0	0	OK	    
		countPairs("hihih") → 3	3	OK	    
		countPairs("ihihhh") → 3	3	OK	    
		countPairs("ihjxhh") → 0	0	OK	    
		countPairs("") → 0	0	OK	    
		countPairs("a") → 0	0	OK	    
		countPairs("aa") → 0	0	OK	    
		countPairs("aaa") → 1	1	OK
		 */

	}

}