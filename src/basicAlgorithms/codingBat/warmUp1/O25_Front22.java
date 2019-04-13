/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there. 

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab" 
 */
package basicAlgorithms.codingBat.warmUp1;

public class O25_Front22 {
	public static String front22(String str) {
		  if(str.length()>=2){
		  String front = str.substring(0,2);
		  return front + str + front ;
		  }
		  return str + str + str;
		}
	
	/*
	 public String front22(String str) {
	  // First figure the number of chars to take
	  int take = 2;
	  if (take > str.length()) {
	    take = str.length();
	  }
	  
	  String front = str.substring(0, take);
	  return front + str + front;
	}
	 */
	public static void main(String[] args) {
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("kitten"));
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("Ha"));
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("abc"));
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("ab"));
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("a"));
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("") );
	System.out.println("return the string with the 2 chars added at both the front and back:- "+front22("Logic"));
	}

}
