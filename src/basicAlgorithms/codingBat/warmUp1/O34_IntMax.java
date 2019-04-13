/*
Given three int values, a b c, return the largest. 

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
package basicAlgorithms.codingBat.warmUp1;

public class O34_IntMax {
	public static int intMax(int a, int b, int c) {
		  int max;
		  
		  // First check between a and b
		  if (a > b) {
		    max = a;
		  } else {
		    max = b;
		  }
		  
		  // Now check between max and c
		  if (c > max) {
		    max = c;
		  }
		  
		  return max;
		  
		  // Could use the built in Math.max(x, y) function which selects the larger
		  // of two values.
		}
	
	public static void main(String[] args) {
		System.out.println("return the largest:- " +intMax(1, 2, 3));
		System.out.println("return the largest:- " +intMax(1, 3, 2));
		System.out.println("return the largest:- " +intMax(3, 2, 1) );
		System.out.println("return the largest:- " +intMax(9, 3, 3));
		System.out.println("return the largest:- " +intMax(3, 9, 3));
		System.out.println("return the largest:- " +intMax(3, 3, 9));
		System.out.println("return the largest:- " +intMax(8, 2, 3));
		System.out.println("return the largest:- " +intMax(-3, -1, -2));
		System.out.println("return the largest:- " +intMax(6, 2, 5));
		System.out.println("return the largest:- " +intMax(5, 6, 2));
		
		}

}
