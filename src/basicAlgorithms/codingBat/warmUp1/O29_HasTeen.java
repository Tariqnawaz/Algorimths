
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen. 

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true

 */
package basicAlgorithms.codingBat.warmUp1;
public class O29_HasTeen {
	public static boolean hasTeen(int a, int b, int c) {
		  if ((a >=13 && a <= 19) || (b >=13 && b <= 19) ||(c >=13 && c <= 19) ){
		  return true;
		  }
		    return false;
		}
	/*coding bat solution
	 public boolean hasTeen(int a, int b, int c) {
	  // Here it is written as one big expression,
	  // vs. a series of if-statements.
	  return (a>=13 && a<=19) ||
	         (b>=13 && b<=19) ||
	         (c>=13 && c<=19);
	}
	 */
	public static void main(String[] args) {
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(13, 20, 10));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(20, 19, 10));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(20, 10, 13));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(1, 20, 12) );
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(19, 20, 12));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(12, 20, 19) );
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(12, 9, 20));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(12, 18, 20));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(14, 2, 20));
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(4, 2, 20) );
		System.out.println("if it is in the range 13..19 inclusive return  true:- " +hasTeen(11, 22, 22));
		}

}
