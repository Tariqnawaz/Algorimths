/*
Euler discovered the remarkable quadratic formula:

n² + n + 41

It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. However, 
when n = 40, 402 + 40 +41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by 41.

The incredible formula  n² − 79n + 1601 was discovered, which produces 80 primes for the consecutive values n = 0 to 79. 
The product of the coefficients, −79 and 1601, is −126479.

Considering quadratics of the form:

n² + an + b, where |a| < 1000 and |b| < 1000

where |n| is the modulus/absolute value of n
e.g. |11| = 11 and |−4| = 4
Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for 
consecutive values of n, starting with n = 0.
 */
package basicAlgorithms.projectEuler;

public class OO27_QuadraticPrimes {
	public static void main(String[] args) {
		System.out.println(new OO27_QuadraticPrimes().run());
	}
	
	public String run() {
		int bestNum = 0;
		int bestA = 0;
		int bestB = 0;
		for (int a = -1000; a <= 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				int num = numberOfConsecutivePrimesGenerated(a, b);
				if (num > bestNum) {
					bestNum = num;
					bestA = a;
					bestB = b;
				}
			}
		}
		return Integer.toString(bestA * bestB);
	}
	
	
	private static int numberOfConsecutivePrimesGenerated(int a, int b) {
		for (int i = 0; ; i++) {
			int n = i * i + i * a + b;
			if (n < 0 || !Library.isPrime(n))
				return i;
		}
	}
}
