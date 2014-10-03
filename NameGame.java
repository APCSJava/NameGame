/**
 * Provided a person's name (single word) the Name Game produces a rhyming
 * verse, as popularized by Shirley Ellis in her 1964 hit recording for Capital Records.
 *
 *
 * For example, provided the name Lisa
 * "Lisa, Lisa, bo-bisa
 *  Banana fanna fo-fisa
 *  Fee fie mo-misa
 *  Lisa!"
 *
 * The exact rules are available online and indicate special situations that arise when
 * a person's name begins with one of the target substitutions (b, f, or m).
 * 
 * @author Kent Collins
 * @author <additional author: Amnah Ahmad>
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your name");
	String name = scan.nextLine();
	int vow = findFirstVowel(name);
	String back = name.substring(vow, name.length());

	if(vow == 0){
	String nameL = name.toLowerCase();
	System.out.println(name + ", " + name + ", " + "bo-b" + nameL);
	System.out.println("Banana-fana fo-f" + nameL);
	System.out.println("Fee-fi-mo-m" + nameL);
	System.out.println(name+ "!");
	}
	else if(name.charAt(0)== 'B' || name.charAt(0) == 'b'){
	System.out.println( name + ", " +  name + ", " + "bo-" + back);
	System.out.println( "Banana-fana fo-f" + back);
	System.out.println( "Fee-fi-mo-m" + back);
	System.out.println( name + "!");
	}
	else if(name.charAt(0)== 'M' || name.charAt(0) == 'm'){
	System.out.println( name + ", " +  name + ", " + "bo-b" + back);
	System.out.println( "Banana-fana fo-f" + back);
	System.out.println( "Fee-fi-mo-" + back);
	System.out.println( name + "!");
	}
	else if(name.charAt(0)== 'F' || name.charAt(0) == 'f'){
	System.out.println( name + ", " +  name + ", " + "bo-b" + back);
	System.out.println( "Banana-fana fo-" + back);
	System.out.println( "Fee-fi-mo-m" + back);
	System.out.println( name + "!");
	}
	else{
	System.out.println( name + ", " +  name + ", " + "bo-b" + back);
	System.out.println( "Banana-fana fo-f" + back);
	System.out.println( "Fee-fi-mo-m" + back);
	System.out.println( name + "!");
	}
	}
	
	/*
	 * Locates the position of the first occurrence of a vowel
	 * @param s The string to be analyzed.  
	 * @return 	The position (index) of the first vowel or -1 if no vowels present.
	 */
	public static int findFirstVowel(String s) {
	for (int i = 0; i<s.length(); i++) {
		s= s.toLowerCase();
		char letter = s.charAt(i);
	if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
}


