/*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, 
the middle letter is gone, so "zipXzap" yields "zpXzp". 

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */
package basicAlgorithms.codingBat.string2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class O27_String_ZipZap {

	public String zipZap(String str) {
		  int pos = 0;
		  List<Integer> a = new ArrayList<Integer>();
		  
		  while(true){
			  pos = str.indexOf("z", pos);
			  if(pos == -1){
				  break;
			  }
			  else{
				  if(pos + 2 < str.length() && str.indexOf("p", pos + 2) == pos + 2){
					  a.add(pos+1);
				  }
				  
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
