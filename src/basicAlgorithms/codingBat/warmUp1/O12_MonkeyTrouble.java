/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if
neither of them is smiling. Return true if we are in trouble. 

monkeyTrouble(true, true) = true
monkeyTrouble(false, false) = true
monkeyTrouble(true, false) = false
 */

package basicAlgorithms.codingBat.warmUp1;

public class O12_MonkeyTrouble {
	static boolean a = true;
	static boolean b = true;
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return ( (aSmile && bSmile) || (!aSmile && !bSmile));
	}
	public static void main(String[] args) {
		System.out.println("Return true if we are in trouble:- " + monkeyTrouble(a, b));
	}

}
