/*
Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return 
a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]  
(See also: FizzBuzz Code) 

fizzArray2(4) → {"0", "1", "2", "3"}
fizzArray2(10) → {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
fizzArray2(2) → {"0", "1"}
 */
package basicAlgorithms.codingBat.array2;

public class O22_Array2_FizzArray2 {

	public String[] fizzArray2(int n) {
		  String[] a = new String[n];
		  for(int ctr = 0; ctr < n ; ++ctr){
			  a[ctr] = (new Integer(ctr)).toString();
		  }
		  return a;
	}
	
	public static void main(String[] args) {
		/*
		fizzArray2(4) → {"0", "1", "2", "3"}	{"0", "1", "2", "3"}	OK	    
		fizzArray2(10) → {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}	{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}	OK	    
		fizzArray2(2) → {"0", "1"}	{"0", "1"}	OK	    
		fizzArray2(1) → {"0"}	{"0"}	OK	    
		fizzArray2(0) → {}	{}	OK	    
		fizzArray2(7) → {"0", "1", "2", "3", "4", "5", "6"}	{"0", "1", "2", "3", "4", "5", "6"}	OK	    
		fizzArray2(9) → {"0", "1", "2", "3", "4", "5", "6", "7", "8"}	{"0", "1", "2", "3", "4", "5", "6", "7", "8"}	OK	    
		fizzArray2(11) → {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}
		 */
	}

}
