/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" 
yields "(abc)". 

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
 */
package basicAlgorithms.codingBat.recursion1;

public class O36_Recursion1_ParenBit {

	public String parenBit(String str) {
		  if(!str.subSequence(0,1).equals("(")){
			  return parenBit(str.substring(1));
		  }
		  if(!str.subSequence(str.length() - 1,str.length()).equals(")")){
			  return parenBit(str.substring(0 , str.length() - 1));
		  }
		  return str;
	}

	public static void main(String[] args) {
		/*
		parenBit("xyz(abc)123") → "(abc)"	"(abc)"	OK	    
		parenBit("x(hello)") → "(hello)"	"(hello)"	OK	    
		parenBit("(xy)1") → "(xy)"	"(xy)"	OK	    
		parenBit("not really (possible)") → "(possible)"	"(possible)"	OK	    
		parenBit("(abc)") → "(abc)"	"(abc)"	OK	    
		parenBit("(abc)xyz") → "(abc)"	"(abc)"	OK	    
		parenBit("(abc)x") → "(abc)"	"(abc)"	OK	    
		parenBit("(x)") → "(x)"	"(x)"	OK	    
		parenBit("()") → "()"	"()"	OK	    
		parenBit("res (ipsa) loquitor") → "(ipsa)"	"(ipsa)"	OK	    
		parenBit("hello(not really)there") → "(not really)"	"(not really)"	OK	    
		parenBit("ab(ab)ab") → "(ab)"	"(ab)"	OK
		 */

	}

}
