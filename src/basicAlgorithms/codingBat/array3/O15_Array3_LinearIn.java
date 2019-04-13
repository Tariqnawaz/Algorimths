/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only 
a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order. 

linearIn({1, 2, 4, 6}, {2, 4}) → true
linearIn({1, 2, 4, 6}, {2, 3, 4}) → false
linearIn({1, 2, 4, 4, 6}, {2, 4}) → true
 */
package basicAlgorithms.codingBat.array3;

public class O15_Array3_LinearIn {

	public boolean linearIn(int[] outer, int[] inner) {
		  if(inner.length == 0){
			  return true;
		  }
		  boolean ok =false;
		  int i= 0;
		  for(int o = 0 ; o< outer.length;++o){
			  if(inner[i] == outer[o]){
				  ++i;
				  if(i == inner.length){
					  ok = true;
					  break;
				  }
				  continue;
			  }
			  else if(inner[i] != outer[0]){
				  continue;
			  }
		  }
		  return ok;
	}

	public static void main(String[] args) {

		/*
		linearIn({1, 2, 4, 6}, {2, 4}) → true	true	OK	    
		linearIn({1, 2, 4, 6}, {2, 3, 4}) → false	false	OK	    
		linearIn({1, 2, 4, 4, 6}, {2, 4}) → true	true	OK	    
		linearIn({2, 2, 4, 4, 6, 6}, {2, 4}) → true	true	OK	    
		linearIn({2, 2, 2, 2, 2}, {2, 2}) → true	true	OK	    
		linearIn({2, 2, 2, 2, 2}, {2, 4}) → false	false	OK	    
		linearIn({2, 2, 2, 2, 4}, {2, 4}) → true	true	OK	    
		linearIn({1, 2, 3}, {2}) → true	true	OK	    
		linearIn({1, 2, 3}, {-1}) → false	false	OK	    
		linearIn({1, 2, 3}, {}) → true	true	OK	    
		linearIn({-1, 0, 3, 3, 3, 10, 12}, {-1, 0, 3, 12}) → true	true	OK	    
		linearIn({-1, 0, 3, 3, 3, 10, 12}, {0, 3, 12, 14}) → false	false	OK	    
		linearIn({-1, 0, 3, 3, 3, 10, 12}, {-1, 10, 11}) → false	false
		 */

	}

}
