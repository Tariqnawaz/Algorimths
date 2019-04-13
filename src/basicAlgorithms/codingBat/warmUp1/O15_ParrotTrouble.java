/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and
the hour is before 7 or after 20. Return true if we are in trouble. 

parrotTrouble(true, 6) = true
parrotTrouble(true, 7) = false
parrotTrouble(false, 6) = false
 */

package basicAlgorithms.codingBat.warmUp1;

public class O15_ParrotTrouble {
	static boolean talking = true;
	
	public static boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
	}
	public static void main(String[] args) {
		System.out.println("Return true if we are in trouble:- " +parrotTrouble(talking, 7));
		System.out.println("Return true if we are in trouble:- " +parrotTrouble(talking, 15));
		System.out.println("Return true if we are in trouble:- " +parrotTrouble(talking, 6));
		System.out.println("Return true if we are in trouble:- " +parrotTrouble(talking, 23));
		System.out.println("Return true if we are in trouble:- " +parrotTrouble(talking, 20));
		System.out.println("Return true if we are in trouble:- " +parrotTrouble(talking, 11));
	}

}
