/*

Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not. 

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */
package basicAlgorithms.codingBat.string2;

public class O16_String_XyzThere {
	
	public static boolean xyzThere(String str) {
		  int pos = 0;
		  boolean res = false;
				    while(true){
					     pos = str.indexOf("xyz" , pos);
					     if(pos == -1){
					       break;
					     }else{
					    	 if(!(pos -1 > -1 && str.indexOf("." , pos - 1) == pos -1)){
					    		 res = true;
					    	 }
					      ++pos;
					     }
				     }
				  return res ;
		}

	public static void main(String[] args) {
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("abcxyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("abc.xyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("xyz.abc"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("abcxy"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("xyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("xy"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("x"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("") );
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("abc.xyzxyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("abc.xxyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere(".xyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("12.xyz"));
		System.out.println("Return true if the given string contains an appearance of xyz ... " +xyzThere("12xyz"));
		
		
	}

}
