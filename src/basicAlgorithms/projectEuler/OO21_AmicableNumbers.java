/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000.

 */
package basicAlgorithms.projectEuler;

public class OO21_AmicableNumbers {
		
	public static void main(String[] args) {
		System.out.println(new OO21_AmicableNumbers().run());
	}
	
	
	public String run() {
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (isAmicable(i))
				sum += i;
		}
		return Integer.toString(sum);
	}
	
	
	private static boolean isAmicable(int n) {
		int m = divisorSum(n);
		return m != n && divisorSum(m) == n;
	}
	
	
	private static int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
}
