package basicAlgorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O003_RegexMatcher {
	public static void main(String[] args) {
		/* The Java Matcher class (java.util.regex.Matcher) is used to search through a text
		   for multiple occurrences of a regular expression. You can also use a Matcher to 
		   search for the same regular expression in different texts.
		   The Java Matcher class has a lot of useful methods. I will cover the core methods 
		   of the Java Matcher class in this tutorial. For a full list, see the official JavaDoc 
		   for the Matcher class.*/
		
		/* 1. Creating a Matcher */
			String text1  = "This is the text to be searched for occurrences of the http:// pattern.";
			String patternString1 = ".*http://.*";
	        Pattern pattern1 = Pattern.compile(patternString1);
	        Matcher matcher1 = pattern1.matcher(text1);
	        System.out.println("matcher " + matcher1);
		
	    /* 2. matches() */   
	        String text2  = "This is the text to be searched for occurrences of the http:// pattern.";
			String patternString2 = ".*http://.*";
			Pattern pattern2 = Pattern.compile(patternString2);
			Matcher matcher2 = pattern2.matcher(text2);
			boolean matches2 = matcher2.matches();
			System.out.println("matches..."+matches2);
			
		/* 3. lookingAt() */	
			/* The Matcher lookingAt() method works like the matches() method with one major difference. 
			   The lookingAt() method only matches the regular expression against the beginning of the text, 
			   whereas matches() matches the regular expression against the whole text. In other words, if 
			   the regular expression matches the beginning of a text but not the whole text, lookingAt() will 
			  return true, whereas matches() will return false.*/
			
			String text3  = "This is the text to be searched for occurrences of the http:// pattern.";
	        String patternString3 = "This is the";
	        Pattern pattern3 = Pattern.compile(patternString3, Pattern.CASE_INSENSITIVE);
	        Matcher matcher3 = pattern3.matcher(text3);
	        System.out.println("lookingAt = " + matcher3.lookingAt());
	        System.out.println("matches   = " + matcher3.matches());
	    
	   /* 4. find() + start() + end() */  
	        /* The Matcher find() method searches for occurrences of the regular expressions in the text passed 
	           to the Pattern.matcher(text) method, when the Matcher was created. If multiple matches can be found
	           in the text, the find() method will find the first, and then for each subsequent call to find() it
	           will move to the next match. */
	        
	        String text4 = "This is the text which is to be searched for occurrences of the word 'is'.";
	        String patternString4 = "is";
	        Pattern pattern4 = Pattern.compile(patternString4);
	        Matcher matcher4 = pattern4.matcher(text4);

	        int count4 = 0;
	        while(matcher4.find()) {
	            count4++;
	            System.out.println("found: " + count4 + " : "
	                    + matcher4.start() + " - " + matcher4.end());
	        }
	  
	    /* 5. group() */     
	        String text5  ="John writes about this, and John writes about that,and John writes about everything. ";
	        String patternString5 = "(John)";
	        Pattern pattern5 = Pattern.compile(patternString5);
	        Matcher matcher5 = pattern5.matcher(text5);
	        while(matcher5.find()) {
	            System.out.println("found: " + matcher5.group(1));
	        }
	        
	    /* 5. replaceAll() + replaceFirst() */   
	        String text6 = "John writes about this, and John Doe writes about that, and John Wayne writes about everything.";
	        String patternString6 = "((John) (.+?)) ";
	        Pattern pattern6 = Pattern.compile(patternString6);
	        Matcher matcher6 = pattern6.matcher(text6);
	        String replaceAll6 = matcher6.replaceAll("Joe Blocks ");
	        System.out.println("replaceAll   = " + replaceAll6);
	        String replaceFirst6 = matcher6.replaceFirst("Joe Blocks ");
	        System.out.println("replaceFirst = " + replaceFirst6);
	        
	    /* appendReplacement() + appendTail() */ 
	        String text7 ="John writes about this, and John Doe writes about that, and John Wayne writes about everything.";
	        String patternString7 = "((John) (.+?)) ";
	        Pattern      pattern7      = Pattern.compile(patternString7);
	        Matcher      matcher7      = pattern7.matcher(text7);
	        StringBuffer stringBuffer7 = new StringBuffer();

	        while(matcher7.find()){
	            matcher7.appendReplacement(stringBuffer7, "Joe Blocks ");
	            System.out.println(stringBuffer7.toString());
	        }
	        matcher7.appendTail(stringBuffer7);
	        System.out.println(stringBuffer7.toString());
	}

}
