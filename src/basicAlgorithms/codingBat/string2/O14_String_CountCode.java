/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count. 

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
package basicAlgorithms.codingBat.string2;

public class O14_String_CountCode {

	/*public int countCode(String str) { // this showed an exception 
		  int count = 0;
		  if(str.length() < 4){
		    return 0;
		  }
		  
		  for(int i = 0 ; i<str.length() ; i++){
		    if(str.charAt(i) =='c' && str.charAt(i+1) =='o' && str.charAt(i+3)=='e'){ // here exception occure
		     count++;
		    }else{
		      
		    }
		  }
		  return count;
		}*/
	
	/*coding bat solution*/
	public static int countCode(String str) {
		int pos = 0;
	    int res = 0;
	    while(true){
		     pos = str.indexOf("co" , pos);
		     if(pos == -1){
		       break;
		     }else{
		    	 if( pos + 3 < str.length()  && str.indexOf("e" , pos + 3) == pos + 3){
					++res;
		    	 }
				    ++pos;
				    }
			     }
			return res ;
		}
	public static void main(String[] args) {
	System.out.println("Return the number of times that the string code appears... "+countCode("aaacodebbb"));	
	System.out.println("Return the number of times that the string code appears... "+countCode("codexxcode"));
	System.out.println("Return the number of times that the string code appears... "+countCode("cozexxcope"));
	System.out.println("Return the number of times that the string code appears... "+countCode("cozfxxcope"));
	System.out.println("Return the number of times that the string code appears... "+countCode("xxcozeyycop"));
	System.out.println("Return the number of times that the string code appears... "+countCode("cozcop"));
	System.out.println("Return the number of times that the string code appears... "+countCode("abcxyz"));
	System.out.println("Return the number of times that the string code appears... "+countCode("code"));
	System.out.println("Return the number of times that the string code appears... "+countCode("ode"));
	System.out.println("Return the number of times that the string code appears... "+countCode("c"));
	System.out.println("Return the number of times that the string code appears... "+countCode(""));
	System.out.println("Return the number of times that the string code appears... "+countCode("AAcodeBBcoleCCccoreDD"));
	
	
	}

}
