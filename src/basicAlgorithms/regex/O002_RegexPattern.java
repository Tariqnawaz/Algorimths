package basicAlgorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O002_RegexPattern {
	public static void main (String args[]){
		/*1. Pattern.matches() example*/
		/* The easiest way to check if a regular expression pattern matches a text is to use */
		
		String text1 = "This is the text to be searched for occurrences of the pattern.";
		String patternString1 = ".*for.*";
		boolean pattern = Pattern.matches(patternString1, text1);
		System.out.println("Pattern matches true or false : "+pattern);
		
		/*2. Pattern.compile() example*/
		/* If you need to match a text against a regular expression pattern more than one time, 
		  you need to create a Pattern instance using the Pattern.compile() method. */
		
		String text2 = "This is the text to be searched for occurrences of the http:// pattern.";
		String patternString2 = "the";
		//Pattern pattern2 = Pattern.compile(patternString2); or
		/* You can also use the Pattern.compile() method to compile a Pattern using special flags. */
		Pattern pattern2 = Pattern.compile(patternString2, Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher(text2);
		Integer count2 = 0;
		while(matcher2.find()){
			count2++;
			System.out.println("count of is : "+count2);
		}
		
		/*3. Pattern.split() example*/
		/* The split() method in the Pattern class can split a text into an array of String's, using the 
		   regular expression (the pattern) as delimiter. */
		String text3 = "A sep Text sep With sep Many sep Separators";
        String patternString3 = "sep";
        Pattern pattern3 = Pattern.compile(patternString3);
        String[] split3 = pattern3.split(text3);
        System.out.println("split.length = " + split3.length);
        for(String element : split3){
            System.out.println("element = " + element);
        }
        
        /*4. Pattern.pattern() example*/
		/* The pattern() method of the Pattern class simply returns the pattern string (regular expression)
		   that the Pattern instance was compiled from. */
        String patternString4 = "sep";
        Pattern pattern4 = Pattern.compile(patternString4);
        
        String pattern5 = pattern4.pattern();
	}
}
