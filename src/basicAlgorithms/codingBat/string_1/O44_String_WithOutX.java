/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
package basicAlgorithms.codingBat.string_1;

public class O44_String_WithOutX {

	public static String withoutX(String str) {
		  if(str.equals("x")){
		    return "";
		  }
		  if(str.length() < 2){
		   return str;
		  }
		  if(str.charAt(1) == 'x'){
		   str = str.substring(0 , 1) + str.substring(2);
		  }
		  if(str.length() < 1){
		   return str;
		  }
		  if(str.charAt(0) == 'x'){
		   str =  str.substring(1);
		  }
		  return str;
		}
	public static void main(String[] args) {
		System.out.println("return the string without those x chars.. "+withoutX("xHix"));
		System.out.println("return the string without those x chars.. "+withoutX("xHi"));
		System.out.println("return the string without those x chars.. "+withoutX("Hxix"));
		System.out.println("return the string without those x chars.. "+withoutX("Hi"));
		System.out.println("return the string without those x chars.. "+withoutX("xxHi"));
		System.out.println("return the string without those x chars.. "+withoutX("Hix"));
		System.out.println("return the string without those x chars.. "+withoutX("xaxbx"));
		System.out.println("return the string without those x chars.. "+withoutX("xaxbx"));
		System.out.println("return the string without those x chars.. "+withoutX("xx"));
		System.out.println("return the string without those x chars.. "+withoutX("x"));
		System.out.println("return the string without those x chars.. "+withoutX(""));
		System.out.println("return the string without those x chars.. "+withoutX("Hello"));
		
	
	}

}
