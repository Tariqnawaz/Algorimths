/*
A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic 
 permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?	
 */
package basicAlgorithms.projectEuler;

public class OO24_LexicographicPermutations {
	public static void main(String[] args) {
		System.out.println(new OO24_LexicographicPermutations().run());
	}
	
	
	public String run() {
		// Initialize
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
			array[i] = i;
		
		// Permute
		for (int i = 0; i < 999999; i++) {
			if (!Library.nextPermutation(array))
				throw new AssertionError();
		}
		
		// Format output
		String ans = "";
		for (int i = 0; i < array.length; i++)
			ans += array[i];
		return ans;
	}
	
}
