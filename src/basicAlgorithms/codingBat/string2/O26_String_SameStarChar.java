/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same. 

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */
package basicAlgorithms.codingBat.string2;

public class O26_String_SameStarChar {

	public static boolean sameStarChar(String str) {
		  int pos = 0;
		  while(true){
			  pos = str.indexOf("*", pos);
			  if(pos == -1){
				  break;
			  }
			  else{
				  if(pos > 0 && pos < str.length() - 1){
					  if(str.charAt(pos - 1) != str.charAt(pos + 1)){
						  return false;
					  }
				  }
				  ++pos;
			  }
		  }
		  return true;
	}
	public static void main(String[] args) {
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("xy*yzz"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("xy*zzz"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*xa*az"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*xa*bz"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*xa*a*"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar(""));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*xa*a*a") );
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*xa*a*b"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*12*2*2"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("12*2*3*"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("abcDEF"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("XY*YYYY*Z*"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("XY*YYYY*Y*"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("12*2*3*"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("*"));
		System.out.println("Returns true if for every '*' (star) .. "+sameStarChar("**") );
		
		
	

	}

}
