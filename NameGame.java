/**
 * Provided a person's name (single word) the Name Game produces a rhyming
 * verse, as popularized by Shirley Ellis in her 1964 hit recording for Capital Records.
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
		
	  Scanner userInput = new Scanner(System.in);
	 
	  //taking and storing user input 
	  System.out.println("\nPlease enter a name:");
	  String input = userInput.next();
	  input = Character.toUpperCase(input.charAt(0)) + input.substring(1, input.length()).toLowerCase();
	  
	  //find first vowel and split word (to take part after vowel)
	  int vowelIndex=findFirstVowel(input);
	  String afterVowel = input.substring(vowelIndex, input.length());
	  
	  char firstChar = Character.toLowerCase(input.charAt(0)); //converts first char to lowercase
	  
	  System.out.println(""); //extra line

	  switch (firstChar) { //prints out final lyrics
	  	case 'b':
	  		System.out.println(input+", "+ input+", bo-" +afterVowel);
	  		System.out.println("Banana-fana fo-f- " + afterVowel);
	  		System.out.println("Fee-fi-mo-m- " + afterVowel);
	  		System.out.println(input +"!");
	  		break;
	  	case 'm':
	  		System.out.println(input+", "+ input+", bo-b- " +afterVowel);
	  		System.out.println("Banana-fana fo-f- " + afterVowel);
	  		System.out.println("Fee-fi-mo- " + afterVowel);
	  		System.out.println(input +"!");
	  		break;
	  	case 'f':
	  		System.out.println(input+", "+ input+", bo-b-" +afterVowel);
	  		System.out.println("Banana-fana fo- " + afterVowel);
	  		System.out.println("Fee-fi-mo-m- " + afterVowel);
	  		System.out.println(input +"!");
	  		break;
	  	default:
	  		System.out.println(input+", "+ input+", bo-b- " +afterVowel);
	  		System.out.println("Banana-fana fo-f- " + afterVowel);
	  		System.out.println("Fee-fi-mo-m- " + afterVowel);
	  		System.out.println(input +"!");
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
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u'||(letter=='y' && i!=0)) {
				return i;
			}
		
		}	return -1;
		
	}
	
}

