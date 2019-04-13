/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes
to the bottom right corner.
How many such routes are there through a 20×20 grid?
*/

package basicAlgorithms.projectEuler;

public class OO15_LatticePaths {
	public static void main(String[] args) {
		System.out.println(new OO15_LatticePaths().run());
	}
	
	
	public String run() {
		return Library.binomial(40, 20).toString();
	}
}
