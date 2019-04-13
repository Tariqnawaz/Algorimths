package basicAlgorithms.codingBat.warmUp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pelindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*****1.*******/
		StringBuffer sb = new StringBuffer();
		//System.out.println(sb.append("ANNA12").toString().equals(sb.reverse().toString()) ? "Pelindrom" : "Not Pelindrom");
		/*****2.*******/
		int n = 12;
		System.out.println( (n % 3 == 0 && n % 5 == 0) ? "Tomcat" : (n %  3 == 0 ) ? "Tom" : (n %  5 == 0 ) ? "cat" : n);
		/*****3.*******/
		/*String name = "TariqaarereaAAa1 "; // count no of aa
		int count = 0;
		for(int i = 0 ; i < name.length() ; i++){
			if(name.toLowerCase().charAt(i) == 'a'){
				count++;
			}
		}
		System.out.println("count"+count);*/
		/*****4.*******/
		int count = 0;
		Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("Tariqaarereaa1");
        
        while(matcher.find()){
        	count++;
        }
        System.out.println("count..."+count);
		/*****5.****fabonacci***/
		/*int number = 10;
		int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        System.out.println("fibonacci.."+fibonacci);*/
		
		
		/*****6.*******/
		/*int count = 0;
		Integer[] a = { 1 , 2 , 3 , 4 , 5 , 9 , 11};
		
		Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(a);
        
        while(matcher.find()){
        	count++;
        }
        System.out.println("count..."+count);*/
		
		
	}

}
