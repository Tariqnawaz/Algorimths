/*

Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. 
So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */
package basicAlgorithms.codingBat.string2;

import java.util.HashSet;
import java.util.Set;

public class O28_String_StarOut {

	public String sameStarChar(String str) {
		int pos = 0;
		  Set<Integer> a = new HashSet<Integer>();
		  
		  while(true){
			  pos = str.indexOf("*", pos);
			  if(pos == -1){
				  break;
			  }
			  else{
				  if(pos == 0){
					  a.add(pos);
					  a.add(pos+1);
				  }
				  if(pos == str.length() - 1){
					  a.add(pos - 1);
					  a.add(pos);
				  }
				  if(pos >0 && pos < str.length() - 1){
					  a.add(pos - 1);
					  a.add(pos);
					  a.add(pos + 1);
				  }
				  
				  ++pos;
			  }
		  } 
		  StringBuffer s = new StringBuffer();
		  for(int ctr = 0 ; ctr <str.length(); ++ctr){
			  if(!a.contains(ctr)){
				  s.append(str.charAt(ctr));
			  }
		  }
		  return s.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
