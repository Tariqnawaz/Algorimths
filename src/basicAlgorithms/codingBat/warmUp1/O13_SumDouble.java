/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum. 

sumDouble(1, 2) = 3
sumDouble(3, 2) = 5
sumDouble(2, 2) = 8
 
 */

package basicAlgorithms.codingBat.warmUp1;

public class O13_SumDouble {
	public int sumDouble(int a, int b) {
		
		int c = a + b ;
		if(a == b){
			c = c * 2;
		}
		return c;
	}
	
	public static void main(String[] args) {
		O13_SumDouble s = new O13_SumDouble();
		s.sumDouble(1, 3);
		s.sumDouble(2, 2);
		System.out.println("Double sum sumDouble(1, 3):- " + s.sumDouble(1, 3));
		System.out.println("Double sum sumDouble(2, 2):- " + s.sumDouble(2, 2));
		System.out.println("Double sum sumDouble(4, 5):- " + s.sumDouble(4, 5));
		System.out.println("Double sum sumDouble(5, 5):- " + s.sumDouble(5, 5));
	}

}
