/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap. 

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */
package basicAlgorithms.codingBat.string3;

public class O15_String3_CountTriple {

	public  static int countTriple(String str) {
		  int res = 0;
		  for(int ctr = 0; ctr < str.length() - 2 ;++ctr){
			  if(str.charAt(ctr) == str.charAt(ctr + 1) && str.charAt(ctr + 1) == str.charAt(ctr + 2)){
				  ++res;
			  }
			  
		  }
		  return res;
	}

	public static void main(String[] args) {
		System.out.println("Return the number of triples in the given string... "+countTriple("abcXXXabc"));
		System.out.println("Return the number of triples in the given string... "+countTriple("xxxabyyyycd"));
		System.out.println("Return the number of triples in the given string... "+countTriple("a"));
		System.out.println("Return the number of triples in the given string... "+countTriple(""));
		System.out.println("Return the number of triples in the given string... "+countTriple("XXXabc"));
		System.out.println("Return the number of triples in the given string... "+countTriple("XXXXabc"));
		System.out.println("Return the number of triples in the given string... "+countTriple("XXXXXabc"));
		System.out.println("Return the number of triples in the given string... "+countTriple("222abyyycdXXX"));
		System.out.println("Return the number of triples in the given string... "+countTriple("abYYYabXXXXXab"));
		System.out.println("Return the number of triples in the given string... "+countTriple("abYYXabXXYXXab"));
		
	}

}
