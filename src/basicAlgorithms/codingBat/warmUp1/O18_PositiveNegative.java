/*
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative. 

posNeg(1, -1, false) = true
posNeg(-1, 1, false) = true
posNeg(-4, -5, true) = true
 */

package basicAlgorithms.codingBat.warmUp1;

public class O18_PositiveNegative {
	
	public static boolean posNeg(int a, int b, boolean negative) {
		if(negative && a <0 && b <0){
			return true;
		}else if(!negative && (a < 0 && b >0)){
			return true;
		}
		else if(!negative && (a > 0 && b <0)){
			return true;
		}
		return false;
	}
	/* coding bat solution
	 public boolean posNeg(int a, int b, boolean negative) {
	  if (negative) {
	    return (a < 0 && b < 0);
	  }
	  else {
	    return ((a < 0 && b > 0) || (a > 0 && b < 0));
	  }
	}
	 */
	public static void main(String[] args) {
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-1, 1, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-4, -5, true));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-4, -5, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-4, 5, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-4, 5, true));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(1, 1, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-1, -1, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(1, -1, true));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(1, 1, true));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-1, -1, true));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(5, -5, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-6, 6, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-5, -6, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-2, -1, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(1, 2, false));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-5, 6, true));
		System.out.println("posNeg(int a, int b, boolean negative):-" + posNeg(-5, -5, true));
		}

}
