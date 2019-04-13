/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, 
and then recur on what's inside them. 

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
 */
package basicAlgorithms.codingBat.recursion1;

public class O37_Recursion1_NestParen {

	public boolean nestParen(String str) {
		  if(str.length() == 0){
			  return true;
		  }
		  if(str.length() < 2){
			  return false;
		  }
		  if(str.subSequence(0,1).equals("(") && str.subSequence(str.length() - 1,str.length()).equals(")")){
			  return true && nestParen(str.substring(1,str.length()-1));
		  }else{
			  return false;
		  }
		  
	}

	public static void main(String[] args) {
		/*
		nestParen("(())") → true	true	OK	    
		nestParen("((()))") → true	true	OK	    
		nestParen("(((x))") → false	false	OK	    
		nestParen("((())") → false	false	OK	    
		nestParen("((()()") → false	false	OK	    
		nestParen("()") → true	true	OK	    
		nestParen("") → true	true	OK	    
		nestParen("(yy)") → false	false	OK	    
		nestParen("(())") → true	true	OK	    
		nestParen("(((y))") → false	false	OK	    
		nestParen("((y)))") → false	false	OK	    
		nestParen("((()))") → true	true	OK	    
		nestParen("(())))") → false	false	OK	    
		nestParen("((yy())))") → false	false	OK	    
		nestParen("(((())))") → true	true	OK
		 */

	}

}
