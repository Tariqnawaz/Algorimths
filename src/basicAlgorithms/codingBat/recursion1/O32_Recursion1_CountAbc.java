/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string. 

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
 */
package basicAlgorithms.codingBat.recursion1;

public class O32_Recursion1_CountAbc {

	public int countAbc(String str) {
		  if(str.length() < 3){
			  return 0;
		  }
		  int res = 0;
		  if(str.subSequence(0,3).equals("abc")){
			  ++res;
		  }
		  if(str.subSequence(0,3).equals("aba")){
			  ++res;
		  }
		  return res + countAbc(str.substring(1));
	}

	public static void main(String[] args) {
		/*
		countAbc("abc") → 1	1	OK	    
		countAbc("abcxxabc") → 2	2	OK	    
		countAbc("abaxxaba") → 2	2	OK	    
		countAbc("ababc") → 2	2	OK	    
		countAbc("abxbc") → 0	0	OK	    
		countAbc("aaabc") → 1	1	OK	    
		countAbc("hello") → 0	0	OK	    
		countAbc("") → 0	0	OK	    
		countAbc("ab") → 0	0	OK	    
		countAbc("aba") → 1	1	OK	    
		countAbc("aca") → 0	0	OK	    
		countAbc("aaa") → 0	0	OK	
		 */

	}

}
