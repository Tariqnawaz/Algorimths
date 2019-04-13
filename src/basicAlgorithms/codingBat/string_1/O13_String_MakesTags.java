/*

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround 
the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". 

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
package basicAlgorithms.codingBat.string_1;

public class O13_String_MakesTags {
	
	public static String makeTags(String tag, String word) {
		  return "<" + tag + ">" + word + "</" + tag + ">";
		}
	public static void main(String[] args) {
		System.out.println(" create the HTML string with tags around the word.."+makeTags("i", "Yay"));
		System.out.println(" create the HTML string with tags around the word.."+makeTags("i", "Hello"));
		System.out.println(" create the HTML string with tags around the word.."+makeTags("cite", "Yay") );
		System.out.println(" create the HTML string with tags around the word.."+makeTags("address", "here"));
		System.out.println(" create the HTML string with tags around the word.."+makeTags("body", "Heart"));
		System.out.println(" create the HTML string with tags around the word.."+makeTags("i", "i"));
		System.out.println(" create the HTML string with tags around the word.."+makeTags("i", ""));
		
	}

}
