/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string. 

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

 */
package basicAlgorithms.codingBat.recursion1;

public class O21_Recursion1_CountHi {

	public int countHi(String str) {
		 if(str.length() < 2){
			  return 0;
		  }
		  if(str.substring(0,2).equals("hi")){
			  return 1 + countHi(str.substring(2));
		  } else{
			  return countHi(str.substring(1));
		  }
	}

	public static void main(String[] args) {
		/*
		countHi("xxhixx") → 1	1	OK	    
		countHi("xhixhix") → 2	2	OK	    
		countHi("hi") → 1	1	OK	    
		countHi("hihih") → 2	2	OK	    
		countHi("h") → 0	0	OK	    
		countHi("") → 0	0	OK	    
		countHi("ihihihihih") → 4	4	OK	    
		countHi("ihihihihihi") → 5	5	OK	    
		countHi("hiAAhi12hi") → 3	3	OK	    
		countHi("xhixhxihihhhih") → 3	3	OK	    
		countHi("ship") → 1	1	OK
		 */

	}

}
