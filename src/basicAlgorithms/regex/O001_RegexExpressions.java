package basicAlgorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O001_RegexExpressions {

	public static void main(String[] args) {
		
		/**   first Example  **/
		/* 1. Question : The regular expression just checks for an occurrence of the string http://. */
		String text = "The erajdfklj sfjksdjf kjfj http:// sfdsfjdkf http://";
		String pattern = ".*http://.*"; /* here write a string between (.*) this and test for the pattern  */
		
		boolean matcher = Pattern.matches(pattern, text); /*static method to check if the regular expression (pattern) matches the text. 
		If the regular expression matches the text, then Pattern.matches() returns true. If the regular expression does not match the text Pattern.matches() returns false.*/
		System.out.println("matcher..."+matcher);
		
		/**   second Example  **/
		/* 2. Question :  Matcher class to locate multiple occurrences of the substring "is" inside a text: */
		
		/*String text2 = "This is the text which is to be searched for occurrences of the word 'is'.";
		String  patternString2 = "is";
		Pattern pattern2 = Pattern.compile(patternString2);
		Matcher matcher2 = pattern2.matcher(text2);
		Integer count = 0;
		while(matcher2.find()){
			count++;
			System.out.println("Count is :" + count);
		}*/
		
		String text2 = "abcdefghijkabcdefghijkabcdefgabcd";
		String patternString2 ="bcd";
		Pattern pattern2 = Pattern.compile(patternString2);
		Matcher matcher2 = pattern2.matcher(text2);
		Integer count2 = 0;
		while(matcher2.find()){
			count2++;
			System.out.println("Count2 :"+count2);
		}
		
		
		

	}

}
