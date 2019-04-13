/*
Given a string, return true if it ends in "ly". 

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
package basicAlgorithms.codingBat.string_1;

public class O26_StringEndsLy_EndsWithMethod {
	/*public boolean endsLy(String str) {
		if(str.length() < 2){
		return false;
		}

		  if( str.length() > 0 && str.charAt(str.length() -2) == 'l' &&  str.charAt(str.length()-1) == 'y' )
		  {
		  return true;
		  }
		  return false;
		}*/
	/*
	 * coding bat solution below
	 */
	public static boolean endsLy(String str) {
		if(str.length() < 2){
			return false;
		}
		  //return str.substring(str.length()-2).equals("ly"); or
		return str.endsWith("ly");
		}
	public static void main(String[] args) {
		System.out.println("return true if it ends in ly.. "+endsLy("oddly"));
		System.out.println("return true if it ends in ly.. "+endsLy("y"));
		System.out.println("return true if it ends in ly.. "+endsLy("oddy"));
		System.out.println("return true if it ends in ly.. "+endsLy("oddl"));
		System.out.println("return true if it ends in ly.. "+endsLy("olydd"));
		System.out.println("return true if it ends in ly.. "+endsLy("ly"));
		System.out.println("return true if it ends in ly.. "+endsLy(""));
		System.out.println("return true if it ends in ly.. "+endsLy("falsey"));
		
	}

}
