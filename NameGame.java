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
 * @author <Rebecca Brunsberg>
 * @version 2nd October 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
		
		// TODO Produce the required four lines of verse 
		// TODO Print the verse to standard output
		// TODO remove "to do" comments when they are "to done"
		
	  Scanner userInput = new Scanner(System.in);
	  String input = userInput.next();
	  String inputLowerCase = input.toLowerCase();
	  
	  int vowelIndex=findFirstVowel(input);
	  String afterVowel = input.substring(vowelIndex, input.length());
	  
	  char firstChar=input.charAt(0);
	  
	  switch (char c) {
	  	case 'b':
	  		System.out.println();
	  		break;
	  }
	  
	  }
	  
	  }
		
		
	}
	
	/*
	 * Locates the position of the first occurrence of a vowel
	 * 
	 * @param s The string to be analyzed.  
	 * @return 	The position (index) of the first vowel or -1 if no vowels present.
	 */
	public static int findFirstVowel(String s) {
		s=s.toLowerCase();
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
	public static char beginChar(String s) {
		return s.charAt(0);
		
	
	}
}

