/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. 

makes10(9, 10) = true
makes10(9, 9) = false
makes10(1, 9) = true
 */


package basicAlgorithms.codingBat.warmUp1;

public class O16_Makes10 {
	public boolean makes10(int a, int b) {
		if( a == 10){
			return true;
			}else if(b == 10){
			return true;
			}else if(a + b == 10){
			return true;
			}
			return false;
		}
	/* coding bat solution
	 public boolean makes10(int a, int b) {
	  return (a == 10 || b == 10 || a+b == 10);
	}
	 */
	public static void main(String[] args) {
		O16_Makes10 d = new O16_Makes10();
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(9, 10));
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(9, 9) );
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(1, 9));
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(10, 1));
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(10, 10));
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(8, 2));
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(8, 8));
		System.out.println("return true if one if them is 10 or if their sum is 10.:- " +d.makes10(10, 42));
		
	}

}
