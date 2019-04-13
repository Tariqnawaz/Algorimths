/*

Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, 
and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 
23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod) 

fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
 */
package basicAlgorithms.codingBat.logic1;

public class O28_logic1_FizzString2 {

	public String fizzString2(int n) {
		  if( n % 3 == 0 &&  n  % 5 == 0){
			  return "FizzBuzz!";
		  }
		  if( n % 3 == 0){
			  return "Fizz!";
		  }
		  if(n  % 5 == 0){
			  return "Buzz!";
		  }
		  return Integer.toString(n) + "!";
	}

	public static void main(String[] args) {
		/*
		fizzString2(1) → "1!"	"1!"	OK	    
		fizzString2(2) → "2!"	"2!"	OK	    
		fizzString2(3) → "Fizz!"	"Fizz!"	OK	    
		fizzString2(4) → "4!"	"4!"	OK	    
		fizzString2(5) → "Buzz!"	"Buzz!"	OK	    
		fizzString2(6) → "Fizz!"	"Fizz!"	OK	    
		fizzString2(7) → "7!"	"7!"	OK	    
		fizzString2(8) → "8!"	"8!"	OK	    
		fizzString2(9) → "Fizz!"	"Fizz!"	OK	    
		fizzString2(15) → "FizzBuzz!"	"FizzBuzz!"	OK	    
		fizzString2(16) → "16!"	"16!"	OK	    
		fizzString2(18) → "Fizz!"	"Fizz!"	OK	    
		fizzString2(19) → "19!"	"19!"	OK	    
		fizzString2(21) → "Fizz!"	"Fizz!"	OK	    
		fizzString2(44) → "44!"	"44!"	OK	    
		fizzString2(45) → "FizzBuzz!"	"FizzBuzz!"	OK	    
		fizzString2(100) → "Buzz!"	"Buzz!"	OK	
		 */

	}

}
