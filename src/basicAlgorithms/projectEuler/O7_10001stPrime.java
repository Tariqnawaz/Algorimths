/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/



package basicAlgorithms.projectEuler;

public class O7_10001stPrime {

	//1st condition starts
	public static void main(String[] args){
		int k= 1 ;
		int i =3;
		 
		   while(k!=10001)
		   {
		   if(checkPrime(i))
		    {
		    k++;
		     
		    }
		   i++;
		   }
		   System.out.println(i-1); 
		    
		  }
		  
		 public static boolean checkPrime(int a)
		 {
		  boolean flag = true;
		  for(int i = 2 ; i < a ; i ++ )
		  {
		  if(a % i == 0 )
		  {
		  flag = false;
		  break;
		  }
		   
		  }
		  return flag;
		//1st condition ends
		
		
		
	}
}
