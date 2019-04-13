/*
Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. 
Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0. 

matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) → 1
matchUp({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) → 2
matchUp({"aa", "bb", "cc"}, {"", "", "ccc"}) → 1
 */
package basicAlgorithms.codingBat.ap1;

public class O22_AP1_MatchUp {

	public int matchUp(String[] a, String[] b) {
		  int res = 0;
		  for(int ctr = 0 ; ctr < a.length ; ++ctr){
			  if(a[ctr].length() > 0 && b[ctr].length() > 0 && a[ctr].charAt(0) == b[ctr].charAt(0) ){
				  ++res;
			  }
		  }
		  return res;
	}

	public static void main(String[] args) {
		/*
		matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) → 1	1	OK	    
		matchUp({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) → 2	2	OK	    
		matchUp({"aa", "bb", "cc"}, {"", "", "ccc"}) → 1	1	OK	    
		matchUp({"", "", "ccc"}, {"aa", "bb", "cc"}) → 1	1	OK	    
		matchUp({"", "", ""}, {"", "bb", "cc"}) → 0	0	OK	    
		matchUp({"aa", "bb", "cc"}, {"", "", ""}) → 0	0	OK	    
		matchUp({"aa", "", "ccc"}, {"", "bb", "cc"}) → 1	1	OK	    
		matchUp({"x", "y", "z"}, {"y", "z", "x"}) → 0	0	OK	    
		matchUp({"", "y", "z"}, {"", "y", "x"}) → 1	1	OK	    
		matchUp({"x", "y", "z"}, {"xx", "yyy", "zzz"}) → 3	3	OK	    
		matchUp({"x", "y", "z"}, {"xx", "yyy", ""}) → 2	2	OK	    
		matchUp({"b", "x", "y", "z"}, {"a", "xx", "yyy", "zzz"}) → 3	3	OK	    
		matchUp({"aaa", "bb", "c"}, {"aaa", "xx", "bb"}) → 1	1	OK
		 */

	}

}
