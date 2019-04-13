/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string. 

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
package basicAlgorithms.codingBat.string_1;

public class O35_String_SeeColor {
	public static String seeColor(String str) {

		  if(str.length() >= 3 && str.substring(0,3).equals("red")){
		    return str.substring(0,3);
		  }
		  if(str.length() >= 4 && str.substring(0,4).equals("blue")){
		    return str.substring(0,4);
		  }
		  return "";
		}
	public static void main(String[] args) {
		System.out.println("return that color string... "+seeColor("redxx"));
		System.out.println("return that color string... "+seeColor("xxred"));
		System.out.println("return that color string... "+seeColor("blueTimes"));
		System.out.println("return that color string... "+seeColor("NoColor"));
		System.out.println("return that color string... "+seeColor("red"));
		System.out.println("return that color string... "+seeColor("re"));
		System.out.println("return that color string... "+seeColor("blu"));
		System.out.println("return that color string... "+seeColor("blue"));
		System.out.println("return that color string... "+seeColor("a"));
		System.out.println("return that color string... "+seeColor(""));
		System.out.println("return that color string... "+seeColor("xyzred"));
		

	}

}
