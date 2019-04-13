/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range. 

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
package basicAlgorithms.codingBat.warmUp1;

public class O37_Max1020 {
	public static int max1020(int a, int b) {
		  // First make it so the bigger value is in a
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
		}	
	public static void main(String[] args) {
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(11, 19) );
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(19, 11));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(11, 9));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+ max1020(9, 21));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+ max1020(10, 21) );
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(21, 10));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(9, 11));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(23, 10));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(20, 10));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+max1020(7, 20));
	 System.out.println("return the larger value that is in the range 10..20 inclusive:- "+ max1020(17, 16));
	 
	}

}
