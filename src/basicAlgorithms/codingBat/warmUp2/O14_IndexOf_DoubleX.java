/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". 

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
package basicAlgorithms.codingBat.warmUp2;

public class O14_IndexOf_DoubleX {
	static boolean doubleX(String str) {
		  int getIndexX =str.indexOf("x");
		   if (getIndexX  == -1) return false; // no "x" at all
		   if (getIndexX +1 >= str.length()) return false; // check i+1 in bounds?
		  if(str.substring(getIndexX , getIndexX+2).equals("xx")){
		  return true;
		  }
		  return false;
		}
	/*
	 boolean doubleX(String str) {
	  int i = str.indexOf("x");
	  if (i == -1) return false; // no "x" at all
	
	  // Is char at i+1 also an "x"?
	  if (i+1 >= str.length()) return false; // check i+1 in bounds?
	  return str.substring(i+1, i+2).equals("x");
	  
	  // Another approach -- .startsWith() simplifies the logic
	  // String x = str.substring(i);
	  // return x.startsWith("xx");
	}
	 */
	public static void main(String[] args) {
	System.out.println("return true if the first instance of x in the string is immediately followed by another x" +doubleX("axxbb"));
	System.out.println("return true if the first instance of  in the string is immediately followed by another x" +doubleX("axxbb") );
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("xxxxx"));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("xaxxx"));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("aaaax"));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX(""));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("abc"));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("x"));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("xx"));
	System.out.println("return true if the first instance of x  in the string is immediately followed by another x" +doubleX("xax"));
	
	}

}
