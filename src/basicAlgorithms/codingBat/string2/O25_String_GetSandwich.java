/*

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the 
given string, or return the empty string "" if there are not two pieces of bread. 

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */
package basicAlgorithms.codingBat.string2;

public class O25_String_GetSandwich {

	public static String getSandwich(String str) {
		  int pos = 0;
		  boolean first = false;
		  int pos1 =-1;
		  int pos2 =-1;
		  
		  while(true){
			  pos = str.indexOf("bread", pos);
			  if(!first){
				  pos1 = pos;
				  first  = true;
			  }
			  if(pos == -1){
				  break;
			  }else{
				  pos2 = pos;
				  ++pos;
			  }
		  }
		  if(pos1 == pos2){
			  return  "";
		  }
		  return  str.substring(pos1+5, pos2);
	}

	
	public static void main(String[] args) {
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("breadjambread"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("xxbreadjambreadyy"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("xxbreadyy"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("xxbreadbreadjambreadyy"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("breadAbread"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("breadbread"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("abcbreaz") );
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("xyz"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("") );
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("breadbreaxbread"));
		System.out.println("Return the string that is between the first and last appearance of bread ..  "+getSandwich("breaxbreadybread"));
		
	
	}

}
