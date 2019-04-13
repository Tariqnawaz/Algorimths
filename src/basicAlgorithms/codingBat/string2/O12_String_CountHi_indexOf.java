/*
Return the number of times that the string "hi" appears anywhere in the given string. 

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
package basicAlgorithms.codingBat.string2;

public class O12_String_CountHi_indexOf {
	/*public static int countHi(String str) {
		  int count = 0;
		  if(str.length() < 2){
		    return 0;
		  }
		  for(int i = 0 ; i < str.length() ; i++){
		    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
		      count++;
		    }
		  }
		  return count;
		}*/
	/*coding bat solution*/
	public static  int countHi(String str) {
		  int pos = 0;
		    int res = 0;
		    while(true){
			     pos = str.indexOf("hi" , pos);
			     if(pos == -1){
			       break;
			     }else{
			      ++res;
			      ++pos;
			     }
		     }
		  return res ;
		}
	public static void main(String[] args) {
	System.out.println("Return the number of times that the string hi appears... "+countHi("abc hi ho"));
	System.out.println("Return the number of times that the string hi appears... "+countHi("ABChi hi"));
	System.out.println("Return the number of times that the string hi appears... "+countHi("hihi"));
	System.out.println("Return the number of times that the string hi appears... "+countHi("hiHIhi"));
	System.out.println("Return the number of times that the string hi appears... "+countHi(""));
	System.out.println("Return the number of times that the string hi appears... "+countHi("h"));
	System.out.println("Return the number of times that the string hi appears... "+countHi("hi"));
	System.out.println("Return the number of times that the string hi appears... "+countHi("Hi is no HI on ahI"));
	
	}

}
