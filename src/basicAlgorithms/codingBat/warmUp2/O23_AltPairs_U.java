
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien". 

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
package basicAlgorithms.codingBat.warmUp2;
public class O23_AltPairs_U {

	public static String altPairs(String str) {
		  String result = "";
		  
		  // Run i by 4 to hit 0, 4, 8, ...
		  for (int i=0; i<str.length(); i += 4) {
		    // Append the chars between i and i+2
		    int end = i + 2;
		    if (end > str.length()) {
		      end = str.length();
		    }
		    result = result + str.substring(i, end);
		  }
		  
		  return result;
		}
	public static void main(String[] args) {
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("kitten") );
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("Chocolate") );
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("CodingHorror"));
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("yak"));
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("ya"));
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("y"));
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs(""));
		System.out.println("return a string made of the chars at indexes 0,1, 4,5, 8,9 ..."+altPairs("ThisThatTheOther"));
		
		
	}

}
