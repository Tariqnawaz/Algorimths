/*
 Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
 (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char)
 tests if a char is an alphabetic letter.) 

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */
package basicAlgorithms.codingBat.string3;

public class O11_String3_CountYz {

	public static int countYZ(String str) {
		 int pos = 0;
		 int res = 0;
		 str = str.toUpperCase();
		 
		 while(true){
			 pos = str.indexOf("Y", pos);
			 if(pos == str.length() - 1){
				 ++res;
			 }
			 if(pos == -1){
				 break;
			 }
			 else{
				 if(pos + 1 < str.length() && !Character.isLetter(str.charAt(pos + 1))){
					 ++res;
				 }
				 ++pos;
			 }
		 }
		 while(true){
			 pos = str.indexOf("Z", pos);
			 if(pos == str.length() - 1){
				 ++res;
			 }
			 if(pos == -1){
				 break;
			 }
			 else{
				 if(pos + 1 < str.length() && !Character.isLetter(str.charAt(pos + 1))){
					 ++res;
				 }
				 ++pos;
			 }
		 }
		 return res;
	}

	public static void main(String[] args) {
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("fez day"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("day fez"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("day fyyyz"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("day yak"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("day:yak"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("!!day--yaz!!"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("yak zak"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("DAY abc XYZ"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("aaz yyz my"));
		System.out.println("count the number of words ending in 'y' or 'z'.. "+countYZ("y2bz"));
		
	}

}
