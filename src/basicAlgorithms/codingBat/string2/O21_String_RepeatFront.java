/*

Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, 
and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()). 

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
 */
package basicAlgorithms.codingBat.string2;

public class O21_String_RepeatFront {

		public static String repeatFront(String str, int n) {
	 		 StringBuffer s = new StringBuffer();
			  
			  for(int ctr = 0 ; ctr < n;++ctr){
				  s.append(str.substring(0,n - ctr));
			}
		
		return s.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Chocolate", 4));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Chocolate", 3));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Ice Cream", 2));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Ice Cream", 1));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Ice Cream", 0));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("xyz", 3));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("", 0));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Java", 4));
		System.out.println("return a string made of the first n characters of the string.. "+repeatFront("Java", 1));
		
	
	}

}
