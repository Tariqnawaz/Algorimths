/*
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score 
in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your 
helper method after your scoresSpecial() method in the JavaBat text area. 

scoresSpecial({12, 10, 4}, {2, 20, 30}) → 40
scoresSpecial({20, 10, 4}, {2, 20, 10}) → 40
scoresSpecial({12, 11, 4}, {2, 20, 31}) → 20
 */
package basicAlgorithms.codingBat.ap1;

public class O25_AP1_ScoresSpecial {

	public int scoresSpecial(int[] a, int[] b) {
		  int aa = 0;
		  int bb = 0;
		  
		  for(int i : a){
			  if(i % 10 == 0 && i > aa){
				  aa = i;
			  }
		  }
		  for(int i : b){
			  if( i % 10 == 0 && i > bb){
				  bb =i;
			  }
		  }
		  return aa + bb;
		  
	}

	public static void main(String[] args) {
		/*
		 scoresSpecial({12, 10, 4}, {2, 20, 30}) → 40	40	OK	    
			scoresSpecial({20, 10, 4}, {2, 20, 10}) → 40	40	OK	    
			scoresSpecial({12, 11, 4}, {2, 20, 31}) → 20	20	OK	    
			scoresSpecial({1, 20, 2, 50}, {3, 4, 5}) → 50	50	OK	    
			scoresSpecial({3, 4, 5}, {1, 50, 2, 20}) → 50	50	OK	    
			scoresSpecial({10, 4, 20, 30}, {20}) → 50	50	OK	    
			scoresSpecial({10, 4, 20, 30}, {20}) → 50	50	OK	    
			scoresSpecial({10, 4, 20, 30}, {3, 20, 99}) → 50	50	OK	    
			scoresSpecial({10, 4, 20, 30}, {30, 20, 99}) → 60	60	OK	    
			scoresSpecial({}, {2}) → 0	0	OK	    
			scoresSpecial({}, {20}) → 20	20	OK	    
			scoresSpecial({14, 10, 4}, {4, 20, 30}) → 40	40	OK	 
		 */

	}

}
