/*
Given a string, return true if the string starts with "hi" and false otherwise. 

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
package basicAlgorithms.codingBat.warmUp1;

public class O26_StartHi {
	public static boolean startHi(String str) {
		  if(str.length() >=2){
		  String checkHi = str.substring(0,2);
		  if(checkHi.equals("hi")){
		   return true;
		  }
		  }
		  return false;
		}
		/* coding bat solution
			 public boolean startHi(String str) {
		  // First test if the string is not at least length 2
		  // (so the substring() below does not go past the end).
		  if (str.length() < 2) return false;
		  
		  // Pull out the string of the first two chars
		  String firstTwo = str.substring(0, 2);
		  
		  // Test if it is equal to "hi"
		  if (firstTwo.equals("hi")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to: return(firstTwo.equals("hi"));
		}
	 */
	public static void main(String[] args) {
	System.out.println("return true if the string starts with hi:- "+startHi("hi"));
	System.out.println("return true if the string starts with hi:- "+startHi("hi"));
	System.out.println("return true if the string starts with hi:- "+startHi("hello hi"));
	System.out.println("return true if the string starts with hi:- "+startHi("he"));
	System.out.println("return true if the string starts with hi:- "+startHi("h"));
	System.out.println("return true if the string starts with hi:- "+startHi(""));
	System.out.println("return true if the string starts with hi:- "+startHi("ho hi"));
	System.out.println("return true if the string starts with hi:- "+startHi("hi ho"));
	}

}
