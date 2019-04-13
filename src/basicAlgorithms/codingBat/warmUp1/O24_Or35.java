/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod 

or35(3) → true
or35(10) → true
or35(8) → false
 */
package basicAlgorithms.codingBat.warmUp1;

public class O24_Or35 {
	public static boolean or35(int n) {
		  if(n%3==0 || n%5==0){
		  return true;
		  }
		  return false;
		}
	/*coding bat solution
	 public boolean or35(int n) {
	  return (n % 3 == 0) || (n % 5 == 0);
	}
	 */
	public static void main(String[] args) {
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(3));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(10));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(8));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(15));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(5));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(9));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(4));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(7));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(6));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(17));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(18));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(29));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(20));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(21));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(22));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(45));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(99));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(100));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(101));
		System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5:- " +or35(121));
	
	}

}
