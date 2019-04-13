/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks. 

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
package basicAlgorithms.codingBat.string_1;

public class O42_String_DaFront {
	
	public static String deFront(String str) {    
		  if(str.equals("a")){
		   return str;
		  }
		  if(str.length() < 2){
		  return "";
		  }
		  
		  String res = str.substring(2);
		  
		  if(str.charAt(1) == 'b'){
		  res = "b" + res;
		  }
		  if(str.charAt(0) == 'a'){
		   res = "a" + res;
		  }
		  return res;
		}
	public static void main(String[] args) {
		System.out.println(" return a version without the first 2 chars... "+deFront("Hello"));
		System.out.println(" return a version without the first 2 chars... "+deFront("java"));
		System.out.println(" return a version without the first 2 chars... "+deFront("away"));
		System.out.println(" return a version without the first 2 chars... "+deFront("axy"));
		System.out.println(" return a version without the first 2 chars... "+deFront("abc"));
		System.out.println(" return a version without the first 2 chars... "+deFront("xby"));
		System.out.println(" return a version without the first 2 chars... "+deFront("ab"));
		System.out.println(" return a version without the first 2 chars... "+deFront("ax"));
		System.out.println(" return a version without the first 2 chars... "+deFront("axb"));
		System.out.println(" return a version without the first 2 chars... "+deFront("aaa"));
		System.out.println(" return a version without the first 2 chars... "+deFront("xbc"));
		System.out.println(" return a version without the first 2 chars... "+deFront("bbb"));
		System.out.println(" return a version without the first 2 chars... "+deFront("bazz"));
		System.out.println(" return a version without the first 2 chars... "+deFront("ba"));
		System.out.println(" return a version without the first 2 chars... "+deFront("abxyz"));
		System.out.println(" return a version without the first 2 chars... "+deFront("hi"));
		System.out.println(" return a version without the first 2 chars... "+deFront("his"));
		System.out.println(" return a version without the first 2 chars... "+deFront("xz"));
		System.out.println(" return a version without the first 2 chars... "+deFront("zzz"));
	}

}
