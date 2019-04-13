/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy. 

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */
package basicAlgorithms.codingBat.string3;

public class O14_String3_GHappy {

	public static boolean gHappy(String str) {
		int pos = 0;
		  while(true){
			  pos = str.indexOf("g", pos);
			  if(pos == -1){
				  break;
			  }
			  else{
				  if(pos + 2 < str.length() && str.indexOf("gg", pos + 1) == pos + 1){
					  pos += 3;
				  }
				  else if(pos + 1 < str.length() && str.indexOf("g", pos + 1) == pos + 1){
					  pos += 2;
				  }else{
					  return false;
				  }
			  }
		  }
		  return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("xxggxx"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("xxgxx"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("xxggyygxx"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("g"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("gg"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy(""));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("xxgggxyz"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("xxgggxyg"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("xxgggxygg"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("mgm"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("mggm"));
		System.out.println("Return true if all the g's in the given string are happy .. "+gHappy("yyygggxyy"));
		
		
	}

}
