/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz"
must differ by at most one. This problem is harder than it looks. 

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */
package basicAlgorithms.codingBat.string2;

public class O24_String_XyzMiddle {

	public static boolean xyzMiddle(String str) {
		  if(str.length() < 3){
			  return false;
		  }
		  
		  return (str.substring(str.length() / 2 - 1 , str.length() / 2 + 2).equals("xyz")) || (str.length() % 2 == 0 && str.substring(str.length() / 2 - 2 ,
				  str.length() / 2 + 1).equals("xyz"));
	}
	public static void main(String[] args) {
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AAxyzBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AxyzBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AxyzBBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AxyzBBBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AAAxyzB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AAAxyzBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AAAAxyzBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("AAAAAxyzBBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("1x345xyz12x4"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("xyzAxyzBBB"));
		System.out.println("we'll say that the number of chars to the left and right of the... " +xyzMiddle("xyzAxyzBxyz"));
	

	}

}
