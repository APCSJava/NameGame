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
	  
	  System.out.println("Please enter a name:");
	  String input = userInput.next();
	  
	  int vowelIndex=findFirstVowel(input);
	  String afterVowel = input.substring(vowelIndex, input.length());
	  
	  char firstChar=input.charAt(0);
	  
	  switch (firstChar) {
	  	case 'b':
	  		System.out.println(input+", "+ input+", bo-" +afterVowel);
	  		System.out.println("Banana-fana fo-f " + afterVowel);
	  		System.out.println("Fee-fi-mo--m " + afterVowel);
	  		System.out.println(input +"!");
	  		break;
	  	case 'm':
	  		System.out.println("testing m");
	  		break;
	  	case 'f':
	  		System.out.println("testing f");
	  		break;
	  	default:
	  		System.out.println("testing else");
	  		break;
	  		
	  		
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
	
}

