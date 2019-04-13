/*
 In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
 */
package basicAlgorithms.projectEuler;

public class OO31_CoinSums {
	public static void main(String[] args) {
		System.out.println(new OO31_CoinSums().run());
	}
	
	
	private static final int TOTAL = 200;
	private static int[] COINS = {1, 2, 5, 10, 20, 50, 100, 200};
	
	public String run() {
		// Knapsack problem. ways[i][j] is the number of ways to use
		// any of the first i coin values to form an unordered sum of j.
		int[][] ways = new int[COINS.length + 1][TOTAL + 1];
		ways[0][0] = 1;
		for (int i = 0; i < COINS.length; i++) {
			for (int j = 0; j <= TOTAL; j++)
				ways[i + 1][j] = ways[i][j] + (j >= COINS[i] ? ways[i + 1][j - COINS[i]] : 0);  // Dynamic programming
		}
		return Integer.toString(ways[COINS.length][TOTAL]);
	}
}
