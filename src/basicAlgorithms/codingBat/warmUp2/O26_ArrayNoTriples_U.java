/*

Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples. 

noTriples({1, 1, 2, 2, 1}) → true
noTriples({1, 1, 2, 2, 2, 1}) → false
noTriples({1, 1, 1, 2, 2, 2, 1}) → false
 */
package basicAlgorithms.codingBat.warmUp2;

public class O26_ArrayNoTriples_U {
	
	/*public boolean noTriples(int[] nums) {
		  for(int i = 0 ; i<nums.length ; i++){
		    if(nums[i] == nums[i + 1] == nums[i + 2]){
		      return true;
		    }
		  }
		        return false;
		}*/
	public static boolean noTriples(int[] nums) {
		  // Iterate < length-2, so can use i+1 and i+2 in the loop.
		  // Return false immediately if every seeing a triple.
		  for (int i=0; i < (nums.length-2); i++) {
		    int first = nums[i];
		    if (nums[i+1]==first && nums[i+2]==first) return false;
		  }
		  
		  // If we get here ... no triples.
		  return true;
		}
	public static void main(String[] args) {
		//out put
		
		/*
		 noTriples({1, 1, 2, 2, 1}) → true	true	OK	    
		noTriples({1, 1, 2, 2, 2, 1}) → false	false	OK	    
		noTriples({1, 1, 1, 2, 2, 2, 1}) → false	false	OK	    
		noTriples({1, 1, 2, 2, 1, 2, 1}) → true	true	OK	    
		noTriples({1, 2, 1}) → true	true	OK	    
		noTriples({1, 1, 1}) → false	false	OK	    
		noTriples({1, 1}) → true	true	OK	    
		noTriples({1}) → true	true	OK	    
		noTriples({}) → true
		 */
		
	}

}
