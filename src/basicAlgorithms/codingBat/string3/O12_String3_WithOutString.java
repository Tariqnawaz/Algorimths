/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x". 

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */
package basicAlgorithms.codingBat.string3;

import java.util.ArrayList;
import java.util.List;

public class O12_String3_WithOutString {

	public static String withoutString(String base, String remove) {
		  String base2 = base.toUpperCase();
		  String remove2 = remove.toUpperCase();
		  List<Integer> a = new ArrayList<Integer>();
		  
		  int pos = 0;
		  
		  while(true){
			  pos = base2.indexOf(remove2, pos);
			  if(pos == -1){
				  break;
			  }else{
				  a.add(pos);
				  pos += remove.length();
			  }
		  }
		  for(int ctr = a.size() - 1 ; ctr >= 0 ; --ctr ){
			  StringBuffer s = new StringBuffer();
			  s.append(base.substring(0, a.get(ctr)));
			  s.append(base.substring( a.get(ctr) + remove.length()));
			  base = s.toString();
		  }
		  return base;
	}
	
	public static void main(String[] args) {
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("Hello there", "llo"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("Hello there", "e"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("Hello there", "x"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("This is a FISH", "IS"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("THIS is a FISH", "is"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("THIS is a FISH", "iS"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("abxxxxab", "xx"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("abxxxab", "xx"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("abxxxab", "x"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("xxx", "x"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("xxx", "xx"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("xyzzy", "Y"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("", "x"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("abcabc", "b"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("AA22bb", "2"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("1111", "1"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("1111", "11"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("MkjtMkx", "Mk"));
		System.out.println("return a version of the base string where all instances of the remove.. "+withoutString("Hi HoHo", "Ho"));
		
	}

}
