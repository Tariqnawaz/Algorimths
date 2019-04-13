/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, 
return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code) 

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */
package basicAlgorithms.codingBat.logic1;

public class O27_logic1_FizzString {

	public String fizzString(String str) {
		  if(str.length() < 1){
			  return str;
		  }
		  if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b'){
			  return "FizzBuzz";
		  }
		  if(str.charAt(0) == 'f'){
			  return "Fizz";
		  }
		  if(str.charAt(str.length() - 1) == 'b'){
			  return "Buzz";
		  }
		  return str;
	}

	public static void main(String[] args) {
		/*
		fizzString("fig") → "Fizz"	"Fizz"	OK	    
		fizzString("dib") → "Buzz"	"Buzz"	OK	    
		fizzString("fib") → "FizzBuzz"	"FizzBuzz"	OK	    
		fizzString("abc") → "abc"	"abc"	OK	    
		fizzString("fooo") → "Fizz"	"Fizz"	OK	    
		fizzString("booo") → "booo"	"booo"	OK	    
		fizzString("ooob") → "Buzz"	"Buzz"	OK	    
		fizzString("fooob") → "FizzBuzz"	"FizzBuzz"	OK	    
		fizzString("f") → "Fizz"	"Fizz"	OK	    
		fizzString("b") → "Buzz"	"Buzz"	OK	    
		fizzString("abcb") → "Buzz"	"Buzz"	OK	    
		fizzString("Hello") → "Hello"	"Hello"	OK	    
		fizzString("Hellob") → "Buzz"	"Buzz"	OK	    
		fizzString("af") → "af"	"af"	OK	    
		fizzString("bf") → "bf"	"bf"	OK	    
		fizzString("fb") → "FizzBuzz"	"FizzBuzz"
		 */

	}

}
