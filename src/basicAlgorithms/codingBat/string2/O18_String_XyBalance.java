/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. 
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced. 

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
package basicAlgorithms.codingBat.string2;

public class O18_String_XyBalance {
	
	public static boolean xyBalance(String str) {
		int pos = 0;
		 		    while(true){
					     pos = str.indexOf("x" , pos);
					     if(pos == -1){
					       break;
					     }
					     if(str.indexOf("y" , pos) == -1){
					    	 return false;
					     }
					      ++pos;
					  }
				  return true ;
		
		/*int x = 0;
		  for(char c : str.toCharArray()){
			  if((c == 'x' ) &&  (x > -1)){
				  ++x;
			  }else{
				  return false;
			  }
			  
			  if((c == 'y' ) &&  (x > 1)){
				  --x;
			  }else{
				  return false;
			  }
			  
		  }
		  return x == 0;*/
		
	}
	public static void main(String[] args) {
		System.out.println("String is xy-balanced if.. " +xyBalance("aaxbby"));
		System.out.println("String is xy-balanced if.. " +xyBalance("aaxbb"));
		System.out.println("String is xy-balanced if.. " +xyBalance("yaaxbb"));
		System.out.println("String is xy-balanced if.. " +xyBalance("yaaxbby"));
		System.out.println("String is xy-balanced if.. " +xyBalance("xaxxbby"));
		System.out.println("String is xy-balanced if.. " +xyBalance("xaxxbbyx"));
		System.out.println("String is xy-balanced if.. " +xyBalance("xxbxy"));
		System.out.println("String is xy-balanced if.. " +xyBalance("xxbx"));
		System.out.println("String is xy-balanced if.. " +xyBalance("bbb"));
		System.out.println("String is xy-balanced if.. " +xyBalance("bxbb"));
		System.out.println("String is xy-balanced if.. " +xyBalance("bxyb"));
		System.out.println("String is xy-balanced if.. " +xyBalance("xy"));
		System.out.println("String is xy-balanced if.. " +xyBalance("y"));
		System.out.println("String is xy-balanced if.. " +xyBalance("x"));
		System.out.println("String is xy-balanced if.. " +xyBalance(""));
		
		
	
	}

}
