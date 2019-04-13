/*

Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, 
so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged. 

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */
package basicAlgorithms.codingBat.string_1;

public class O41_String_WithOut2 {
	public  static String without2(String str) {
		  if(str.length() >= 2){
		    if(str.substring(0,2).equals(str.substring(str.length()-2))){
		       return str.substring(2);
		    }else{
		       return str;
		    }
		  }
		  if(str.length() == 2){
		  return "";
		  }
		  return str;
		}

	/* coding bat solution
	 public String without2(String str) {
	 	if(str.length() < 2){
		   return str;
		}
		 if(str.substring(0,2).equals(str.substring(str.length()-2))){
		       return str.substring(2);
		    }
		  return str;
		} 
	 */
	public static void main(String[] args) {
		System.out.println("return a string without the substring at the beginning.. "+without2("HelloHe"));
		System.out.println("return a string without the substring at the beginning.. "+without2("HelloHi"));
		System.out.println("return a string without the substring at the beginning.. "+without2("Hi"));
		System.out.println("return a string without the substring at the beginning.. "+without2("Chocolate"));
		System.out.println("return a string without the substring at the beginning.. "+without2("xxx"));
		System.out.println("return a string without the substring at the beginning.. "+without2("xx"));
		System.out.println("return a string without the substring at the beginning.. "+without2("x"));
		System.out.println("return a string without the substring at the beginning.. "+without2(""));
		
	
	}

}
