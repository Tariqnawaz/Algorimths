package basicAlgorithms.projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class O31_PrimeFactorOfGivenNumber {
	
	/*public static void main(String[] args){
		
		System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int count = 0;
        for(int i = 2 ;i<=number;i++){
        	
        	while(number % 2 == 0){
        		 number /= i;
        		 count++;
        	}
        	if (count == 0) {
                continue;
            }
        	System.out.println(i+ "**" + count);
        }
        
	}*/
	
	public static List<Integer> primeFactors(int number) {  
		  int n = number;  
		  List<Integer> primeFactors = new ArrayList<Integer>();  
		  for (int i = 2; i <= n; i++) {  
		   while (n % i == 0) {  
		    primeFactors.add(i);  
		    n /= i;  
		   }  
		  }  
		  return primeFactors;  
		 }  
		  
		 public static void main(String[] args) {  
		  System.out.println("Primefactors of 15 are : ");  
		  System.out.printf("%s %n",primeFactors(20));  
		  
		  System.out.println("Primefactors of 48 are :");  
		  System.out.printf("%s %n",primeFactors(48));  
		  
		  System.out.println("Primefactors of 91");  
		  System.out.printf("%s %n",primeFactors(91));  
		 }
		  

}
