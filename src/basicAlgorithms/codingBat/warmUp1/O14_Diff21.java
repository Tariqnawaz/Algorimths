/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 

diff21(19) = 2
diff21(10) = 11
diff21(21) = 0
 */

package basicAlgorithms.codingBat.warmUp1;

public class O14_Diff21 {
	public int diff21(int n) {
		int diffr = 0;
		  
		  if(n > 21){
		    diffr = n - 21;
		    diffr = diffr * 2;
		  }else{
		    diffr = 21 - n;
		  }
		  return diffr;
	}
	
	/*  coding bat solution 
	 public int diff21(int n) {
	  if (n <= 21) {
	    return 21 - n;
	  } else {
	    return (n - 21) * 2;
	  }
	}
	 */
	public static void main(String[] args) {
		O14_Diff21 d = new O14_Diff21();
		System.out.println("difference of n:- " + d.diff21(15));
		System.out.println("difference of n:- " + d.diff21(20));
		System.out.println("difference of n:- " + d.diff21(27));
		System.out.println("difference of n:- " + d.diff21(31));
	}

}
