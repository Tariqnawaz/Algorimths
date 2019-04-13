/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

package basicAlgorithms.projectEuler;
 
public class OO10_SummationOfPrimes {
	public static void main(String[] args){
		  //define limit
        int limit = 100;
        long sum = 0 ; 
        System.out.println("Prime numbers between 1 and " + limit);
       
        //loop through the numbers one by one
        for(int i=1; i < 2000000; i++){
               
                boolean isPrime = true;
               
                //check to see if the number is prime
                for(int j=2; j < i ; j++){
                       
                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        //System.out.print(i + " ");
                sum= sum + i;
                System.out.println("sum is " +sum);
        }
	}
}

