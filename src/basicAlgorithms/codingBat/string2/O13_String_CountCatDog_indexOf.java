/*
Return true if the string "cat" and "dog" appear the same number of times in the given string. 

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

package basicAlgorithms.codingBat.string2;

public class O13_String_CountCatDog_indexOf {
	
	public static boolean catDog(String str) {
		int pos = 0;
		int res = 0;
			 while(true){
				pos = str.indexOf("cat" , pos);
				if(pos == -1){
					break;
				}else{
					++res;
					 ++pos;
				}
			}
		 pos = 0;
		 int res2 = 0;
		    while(true){
			     pos = str.indexOf("dog" , pos);
			     if(pos == -1){
			       break;
			     }else{
			      ++res2;
			      ++pos;
			     }
		     }
		  return res == res2;
		}
	public static void main(String[] args) {
		System.out.println("Return true if the string cat and dog.. "+catDog("catdog"));
		System.out.println("Return true if the string cat and dog.. "+catDog("catcat"));
		System.out.println("Return true if the string cat and dog.. "+catDog("1cat1cadodog"));
		System.out.println("Return true if the string cat and dog.. "+catDog("catxxdogxxxdog"));
		System.out.println("Return true if the string cat and dog.. "+catDog("catxdogxdogxcat"));
		System.out.println("Return true if the string cat and dog.. "+catDog("catxdogxdogxca"));
		System.out.println("Return true if the string cat and dog.. "+catDog("dogdogcat"));
		System.out.println("Return true if the string cat and dog.. "+catDog("dogogcat"));
		System.out.println("Return true if the string cat and dog.. "+catDog("dog"));
		System.out.println("Return true if the string cat and dog.. "+catDog("cat"));
		System.out.println("Return true if the string cat and dog.. "+catDog("ca"));
		System.out.println("Return true if the string cat and dog.. "+catDog("c"));
		System.out.println("Return true if the string cat and dog.. "+catDog(""));
		
		
	}

}
