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
 * @author Felicia Grable
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please put in a name:");
		String name = scan.next();
		name = name.toLowerCase();

		int vowel = findFirstVowel(name);

		if (vowel == -1) {
		  System.out.println("Please put in name with vowel.");
 		} else if (vowel == 0) {
		  System.out.println(name + ", " + name + ", bo-b" + name + "," );
		  System.out.println("Banana-fana fo-f" + name);
		  System.out.println("Fee-fi-mo-m" + name);
		  System.out.println(name + "!");
		} else if (vowel >= 1) {
		  if (name.charAt(0) == 'b'){
			name = name.substring(1, name.length());
			System.out.println("b" + name + ", " + "b" + name + ", bo-" + name + "," );
                 	System.out.println("Banana-fana fo-f" + name);
                  	System.out.println("Fee-fi-mo-m" + name);
                  	System.out.println("b" + name + "!");

		  } else if (name.charAt(0) == 'f') {
			name = name.substring(1, name.length());
                        System.out.println("f" + name + ", " + "f" + name + ", bo-b" + name + "," );
                        System.out.println("Banana-fana fo-" + name);
                        System.out.println("Fee-fi-mo-m" + name);
                        System.out.println("f" + name + "!");

		  } else if (name.charAt(0) == 'm') {
			name = name.substring(1, name.length());
                        System.out.println("m" + name + ", " + "m" + name + ", bo-b" + name + "," );
                        System.out.println("Banana-fana fo-f" + name);
                        System.out.println("Fee-fi-mo-" + name);
                        System.out.println("m" + name + "!");

		  } else {
                        System.out.println(name + ", " +  name + ", bo-b" + name.substring(vowel, name.length()) + "," );
                        System.out.println("Banana-fana fo-f" + name.substring(vowel, name.length()));
                        System.out.println("Fee-fi-mo-m" + name.substring(vowel, name.length()));
                        System.out.println(name + "!");

		  }
		}
		// TODO Produce the required four lines of verse 
		// TODO Print the verse to standard output
		// TODO remove "to do" comments when they are "to done"
	}
	
	/*
	 * Locates the position of the first occurrence of a vowel
	 * 
	 * @param s The string to be analyzed.  
	 * @return 	The position (index) of the first vowel or -1 if no vowels present.
	 */
	public static int findFirstVowel(String s) {
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
}

