/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the 
string (case sensitive). 

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */
package basicAlgorithms.codingBat.string3;

public class O13_String3_EqualIsNot {

	public static boolean equalIsNot(String str) {
		  int pos = 0;
		  int res = 0;
		  while(true){
			  pos = str.indexOf("is", pos);
			  if(pos == -1){
				  break;
			  }
			  else{
				  ++res;
				  ++pos;
			  }
		  }
		  
		  pos = 0;
		  int res2 = 0;
		  while(true){
			  pos = str.indexOf("not", pos);
			  if(pos == -1){
				  break;
			  }
			  else{
				  ++res2;
				  ++pos;
			  }
		  }
		  return res == res2;
	}
	
	public static void main(String[] args) {
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("This is not"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("This is notnot"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("noisxxnotyynotxisi"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("noisxxnotyynotxsi"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("xxxyyyzzzintint"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot(""));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("isisnotnot"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("isisnotno7Not"));
		System.out.println("return true if the number of appearances of is ... "+equalIsNot("isnotis"));
		
	}

}
