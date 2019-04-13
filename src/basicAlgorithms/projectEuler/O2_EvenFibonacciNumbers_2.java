/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, 
the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the 
even-valued terms.

10 lakhs = 1 million 
100 lakhs = 1 crore 
100 crores = 1 billion 
100 billions = 1 trillion 
100 trillions = 1 zillion....
*/


package basicAlgorithms.projectEuler;

public class O2_EvenFibonacciNumbers_2 {
	
	  public static void main(String[] args) {

	        int Num1 = 0;
	        int Num2 = 1;
	        int temp = 0;
	        int sum = 0;

	        do {
	            if (Num2 % 2 == 0) {
	                sum = sum + Num2;
	            }
	            temp = Num1 + Num2;
	            Num1 = Num2;
	            Num2 = temp;
	        } while (Num2 < 4000000);

	        System.out.println(sum);
	        
	        O2_EvenFibonacciNumbers_2 p = new O2_EvenFibonacciNumbers_2();
	        p.fab();
	        System.out.println("Fab " + p.fab());
	    }
	  
	 /* public static void main (String args[]){
	         
		  int fibonacci, fibonacci2, sum, evens;
		  fibonacci=1;
		  fibonacci2=1;
		  sum=2;
		  evens=0;
		   
		      while (fibonacci<=4000000 || fibonacci2<=4000000 || sum<=4000000)
		          {
		          if (fibonacci<=4000000 && fibonacci%2==0){evens= evens + fibonacci;
		          }
		          if (fibonacci2<=4000000 && fibonacci2%2==0){
		              evens= evens + fibonacci2;
		          }
		          if (sum<=4000000 && sum%2==0){
		              evens= evens + sum;
		  {sum=fibonacci + fibonacci2;
		  fibonacci= sum + fibonacci2;
		  fibonacci2= sum + fibonacci;
		      }
		  System.out.println(fibonacci);
		  System.out.println(fibonacci2);
		  System.out.println(sum);
		   
		      if (fibonacci>=4000000 ||
		  fibonacci2>=4000000 ||
		  sum>=4000000){
		          break;
		      }
		      }
		  }
		   
		  System.out.println("Sum of the evens under 4 million: ");
		  System.out.println(evens);
		      }*/
	  
	  public long fab(){
		  int no1 = 1;
		  int no2 = 2;
		  int tempAddtionOfTwoNos = 0;
		  
		  while(no2 < 20){
			  tempAddtionOfTwoNos = no1 + no2;
			  no1 = no2;
			  no2 = tempAddtionOfTwoNos;
			  
		  }
		return tempAddtionOfTwoNos;
		  
	  }
	
}