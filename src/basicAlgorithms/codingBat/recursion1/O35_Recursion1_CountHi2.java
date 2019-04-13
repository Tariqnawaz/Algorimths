/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them. 

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
 */
package basicAlgorithms.codingBat.recursion1;

public class O35_Recursion1_CountHi2 {

	public int countHi2(String str) {
		 if(str.length() < 3){
			 if(str.equals("hi")){
				 return 1;
			 }
			 return 0;
		 }
		 if(str.subSequence(str.length() - 2 ,str.length()).equals("hi") && !str.substring(str.length() - 3 ,str.length() - 2).equals("x")){
			 return 1 +countHi2(str.substring(0, str.length() - 2));
		 }
		 return countHi2(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		/*
		countHi2("ahixhi") → 1	1	OK	    
		countHi2("ahibhi") → 2	2	OK	    
		countHi2("xhixhi") → 0	0	OK	    
		countHi2("hixhi") → 1	1	OK	    
		countHi2("hixhhi") → 2	2	OK	    
		countHi2("hihihi") → 3	3	OK	    
		countHi2("hihihix") → 3	3	OK	    
		countHi2("xhihihix") → 2	2	OK	    
		countHi2("xxhi") → 0	0	OK	    
		countHi2("hixxhi") → 1	1	OK	    
		countHi2("hi") → 1	1	OK	    
		countHi2("xxxx") → 0	0	OK	    
		countHi2("h") → 0	0	OK	    
		countHi2("x") → 0	0	OK	    
		countHi2("") → 0	0	OK	    
		countHi2("Hellohi") → 1	1	OK	  
		 */

	}

}
