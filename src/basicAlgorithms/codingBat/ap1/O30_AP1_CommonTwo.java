/*

Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. 
The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order. 

commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) → 2
commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) → 3
commonTwo({"a", "b", "c"}, {"a", "b", "c"}) → 3
 */
package basicAlgorithms.codingBat.ap1;

import java.util.HashSet;
import java.util.Set;

public class O30_AP1_CommonTwo {

	public int commonTwo(String[] a, String[] b) {
		  int res = 0;
		  Set<String> aa = new HashSet<String>();
		  Set<String> bb = new HashSet<String>();
		  
		  for(String s : a){
			  aa.add(s);
		  }
		  for(String s : b){
			  bb.add(s);
		  }
		  for(String s : aa){
			  if(bb.contains(s)){
				  res++;
			  }
		  }
		return res;  
	}

	public static void main(String[] args) {
		/*
		commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) → 2	2	OK	    
		commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) → 3	3	OK	    
		commonTwo({"a", "b", "c"}, {"a", "b", "c"}) → 3	3	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"a", "b", "c"}) → 3	3	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"a", "b", "b", "b", "c"}) → 3	3	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"a", "b", "b", "c", "c"}) → 3	3	OK	    
		commonTwo({"b", "b", "b", "b", "c"}, {"a", "b", "b", "b", "c"}) → 2	2	OK	    
		commonTwo({"a", "b", "c", "c", "d"}, {"a", "b", "b", "c", "d", "d"}) → 4	4	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"b", "b", "b"}) → 1	1	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"c", "c"}) → 1	1	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"b", "b", "b", "x"}) → 1	1	OK	    
		commonTwo({"a", "a", "b", "b", "c"}, {"b", "b"}) → 1	1	OK	    
		commonTwo({"a"}, {"a", "b"}) → 1	1	OK	    
		commonTwo({"a"}, {"b"}) → 0	0	OK	    
		commonTwo({"a", "a"}, {"b", "b"}) → 0	0	OK	    
		commonTwo({"a", "b"}, {"a", "b"}) → 2	2	OK	
		 */

	}

}
