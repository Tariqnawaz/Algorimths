/*
 We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both. 

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
package basicAlgorithms.codingBat.warmUp1;

public class O30_LoneTeen {
	public static boolean loneTeen(int a, int b) {
		  // Store teen-ness in boolean local vars first. Boolean local
		  // vars like this are a little rare, but here they work great.
		  boolean aTeen = (a >= 13 && a <= 19);
		  boolean bTeen = (b >= 13 && b <= 19);
		  
		  return (aTeen && !bTeen) || (!aTeen && bTeen);
		  // Translation: one or the other, but not both.
		  // Alternately could use the Java xor operator, but it's obscure.
		}
	
	public static void main(String[] args) {
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(13, 99));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(21, 19) );
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(13, 13));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(14, 20));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(20, 15));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(16, 17));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(16, 9));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(16, 18));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(13, 19));
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(13, 20) );
		System.out.println("return true if one or the other is teen, but not both.:- "+loneTeen(6, 18));
		
		
	}

}
