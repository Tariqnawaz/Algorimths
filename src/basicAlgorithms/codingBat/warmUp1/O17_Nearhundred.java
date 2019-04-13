/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 

nearHundred(93) = true
nearHundred(90) = true
nearHundred(89) = false
 */

package basicAlgorithms.codingBat.warmUp1;

public class O17_Nearhundred {
	
	public static boolean nearHundred(int n) {
		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}
	public static void main(String[] args) {
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(93));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(90));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(89));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(110));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(111)); 
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(121));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(0));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(5));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(189));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(190));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(200));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(210));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(211));
	 System.out.println("computes the absolute value of a number:- " +  nearHundred(290));
	}

}
