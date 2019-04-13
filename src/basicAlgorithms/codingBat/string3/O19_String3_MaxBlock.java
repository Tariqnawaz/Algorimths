/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same. 

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */
package basicAlgorithms.codingBat.string3;

public class O19_String3_MaxBlock {
	
	public static int maxBlock(String str) {
		  boolean first = true;
		  char old = 0;
		  int count = 0;
		  int max = 0;
		  
		  for(Character c :str.toCharArray()){
			  if(first){
				  old = c;
				  first = false;
				  count = 1;
			  }
			  else{
				  if(old == c){
					  ++count;
				  }else{
					  if(count > max){
						  max = count;
					  }
					  count = 1;
					  old = c;
				  }
			  }
		  }
		  if(count > max){
			  max = count;
		  }
		  return max;
	}

	
	public static void main(String[] args) {
		System.out.println(" return the length of the largest block in the string..."+maxBlock("hoopla"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("abbCCCddBBBxx"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock(""));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("xyz"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("xxyz"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("xyzz"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("abbbcbbbxbbbx"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("XXBBBbbxx"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("XXBBBBbbxx"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("XXBBBbbxxXXXX"));
		System.out.println(" return the length of the largest block in the string..."+maxBlock("XX2222BBBbbXX2222"));
	
	}

}
