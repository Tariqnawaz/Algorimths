/*
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
package basicAlgorithms.projectEuler;

import java.math.BigInteger;

public class OO25_1000DigitFibonacciNumber {
	public static void main(String[] args) {
		System.out.println(new OO25_1000DigitFibonacciNumber().run());
	}
	
	
	private static final int DIGITS = 1000;
	
	public String run() {
		BigInteger lowerthres = BigInteger.TEN.pow(DIGITS - 1);
		BigInteger upperthres = BigInteger.TEN.pow(DIGITS);
		BigInteger prev = BigInteger.ONE;
		BigInteger cur = BigInteger.ZERO;
		int i = 0;
		while (true) {
			// At this point, prev = fibonacci(i - 1) and cur = fibonacci(i)
			if (cur.compareTo(lowerthres) >= 0)
				return Integer.toString(i);
			else if (cur.compareTo(upperthres) >= 0)
				throw new RuntimeException("Not found");
			
			BigInteger temp = cur.add(prev);
			prev = cur;
			cur = temp;
			i++;
		}
	}
}
