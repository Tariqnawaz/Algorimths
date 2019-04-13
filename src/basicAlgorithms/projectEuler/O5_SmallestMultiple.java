/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

package basicAlgorithms.projectEuler;

public class O5_SmallestMultiple {
	public static void main(String[] args){
		long c = 21;
		while (1==1)
		{
		    boolean all = true;
		    for (int i = 1; i < 21; i++)
		    {
		        all = true;
		        if ( c % i != 0 )
		        {
		            all = false;
		            break;
		        }
		    }
		    if ( all )
		    {
		        System.out.println( c );
		        System.exit(0);
		    }

		    c++;
		}
		
		/*boolean flag = true;
        long num = 21 ; // did not start from 1. If you want you can start from 1.
        int count = 0;
        while (flag) {
 
             
            for (int i = 1; i <= 20;) {
                if (num % i == 0) {
                    count++;
                    i++;
                } else {
                    i++;
 
                }
 
 
            }
            if (count == 20) {
                System.out.println(num);
                flag = false;
            } else {
                 
                num++;
                 
            }
        }*/
	}
	//the number is 232792560
}
