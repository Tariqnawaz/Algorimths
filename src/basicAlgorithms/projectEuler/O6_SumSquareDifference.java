/*
The sum of the squares of the first ten natural numbers is,

1(2) + 2(2) + ... + 10(2) = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 
*/


package basicAlgorithms.projectEuler;

public class O6_SumSquareDifference {
	
	/*
	// first condition (it worked applied)
	static long squareOfFirstHndred ;
	static int sumOfAllNumbers ;
	static long squareOfAllNumbers;
	public static void main(String[] args){
		int i = 0;
		for(i = 1;i<=100;i++){
			System.out.println("Square of " + i + " = " + i*i);
			squareOfFirstHndred += i * i;
			
			sumOfAllNumbers +=i;
		}
		squareOfAllNumbers = sumOfAllNumbers * sumOfAllNumbers;
		long differnNumber = squareOfAllNumbers - squareOfFirstHndred;
		System.out.println("Square of the first hundred Total is " + i + " = " + squareOfFirstHndred);
		System.out.println("Sum of All numbers " + i + " = " + sumOfAllNumbers);
		System.out.println("Square of All numbers " + i + " = " + squareOfAllNumbers);
		System.out.println("Difference Between Sum and square is = "  + differnNumber );
	}
	// first condition ends
*/
	
	int sumSquares(){
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		return sum;
	}
	
	int squareSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum * sum;
	}
	public static void main(String[] args){
		O6_SumSquareDifference s = new O6_SumSquareDifference();
		s.squareSum();
		s.sumSquares();
		Long diff = (long) (s.squareSum()-s.sumSquares());
		System.out.println(" sum of square " +s.sumSquares());
		System.out.println(" square of sum " +s.squareSum());
		System.out.println(" difference beteween " + diff);
	}
	
}
