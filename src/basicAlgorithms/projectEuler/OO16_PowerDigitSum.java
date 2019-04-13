/*
2-->15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2-->1000?
*/
package basicAlgorithms.projectEuler;

import java.math.BigInteger;

public class OO16_PowerDigitSum {
	public static void main(String[] args) {
		System.out.println(new OO16_PowerDigitSum().run());
	}
	
	public String run() {
		String temp = BigInteger.ONE.shiftLeft(1000).toString();
		int sum = 0;
		for (int i = 0; i < temp.length(); i++)
			sum += temp.charAt(i) - '0';
		return Integer.toString(sum);
	}
}
