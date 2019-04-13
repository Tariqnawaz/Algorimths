/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". 

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
package basicAlgorithms.codingBat.string_1;

public class O11_String_HelloName {

	public static String helloName(String name) {
		  return "Hello " + name +"!";
		}
	
	public static void main(String[] args) {
		System.out.println(" return a greeting ..."+helloName("Bob"));
		System.out.println(" return a greeting ..."+helloName("Alice"));
		System.out.println(" return a greeting ..."+helloName("X"));
		System.out.println(" return a greeting ..."+helloName("Dolly"));
		System.out.println(" return a greeting ..."+helloName("Alpha"));
		System.out.println(" return a greeting ..."+helloName("Omega"));
		System.out.println(" return a greeting ..."+helloName("Goodbye"));
		System.out.println(" return a greeting ..."+helloName("ho ho ho"));
		System.out.println(" return a greeting ..."+helloName("xyz!"));
		System.out.println(" return a greeting ..."+helloName("Hello"));
	}

}
