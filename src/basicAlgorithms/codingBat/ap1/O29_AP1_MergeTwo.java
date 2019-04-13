/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements 
from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" 
solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array. 

mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}
 */
package basicAlgorithms.codingBat.ap1;

public class O29_AP1_MergeTwo {

	public String[] mergeTwo(String[] a, String[] b, int n) {
		  int apos = 0;
		  int bpos = 0;
		  String[] r =new String[n];
		  int rpos = 0;
		  while(true){
			  if(a[apos].compareTo(b[bpos]) < 0){
				  r[rpos] = a[apos];
				  ++apos;
				  ++rpos;
			  }
			  else if(a[apos].compareTo(b[bpos]) > 0){
				  r[rpos] = b[apos];
				  ++bpos;
				  ++rpos;
			  }
			  else {
				  r[rpos] = a[apos];
				  ++apos;
				  ++rpos;
				  ++bpos;
			  }
			  
			  if(rpos == n){
				  break;
			  }
			  
			  if(bpos == n){
				  for(int ctr = apos;ctr < n;++ctr){
					  r[rpos] = a[apos];
					  ++rpos;
					  if(rpos == n){
						  break;
					  }
				  }
			  }
			  if(rpos == n){
				  break;
			  }
			  
			  if(apos == n){
				  for(int ctr = bpos;ctr < n;++ctr){
					  r[rpos] = b[ctr];
					  ++rpos;
					  if(rpos == n){
						  break;
					  }
				  }
			 }
			  if(rpos == n){
				  break;
			  }
		 }
			 return r;
			 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
