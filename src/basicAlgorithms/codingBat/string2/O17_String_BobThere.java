/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char. 

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */
package basicAlgorithms.codingBat.string2;

public class O17_String_BobThere {
	
	public static boolean bobThere(String str) {
		   int pos = 0;
				  boolean res = false;
						    while(true){
							     pos = str.indexOf("b" , pos);
							     if(pos == -1){
							       break;
							     }else{
							    	 if(pos + 2  < str.length() && str.indexOf("b" , pos + 2) == pos + 2){
							    		 res = true;
							    		 break;
							    	 }
							      ++pos;
							     }
						     }
						  return res ;
		}

	public static void main(String[] args) {
		System.out.println("Return true if the given string contains a bob... " +bobThere("abcbob"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("b9b"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("bac") );
		System.out.println("Return true if the given string contains a bob... " +bobThere("bbb"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("abcdefb"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("123abcbcdbabxyz"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("b12"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("b1b"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("b12b1b"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("bbc"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("bbb"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("bb"));
		System.out.println("Return true if the given string contains a bob... " +bobThere("b"));
		
		
	}

}
