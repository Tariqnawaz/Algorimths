/*
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

package basicAlgorithms.projectEuler;

public class O1_MultipleOf_3_N_5 {
	
	public int calculateSum(){
		int sum = 0;
		for(int i = 1 ; i<=1000 ;i++){
			if(i%3==0 || i%5==0){
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		O1_MultipleOf_3_N_5 m = new O1_MultipleOf_3_N_5();
		m.calculateSum();
		System.out.println("Total sum is " + m.calculateSum());
	}
}
