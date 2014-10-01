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
 * @author Rep Woroch
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {

		System.out.println("Welcome to the Name Game! To play, just enter in a name and we will create a fun song!");
		
		Scanner scnr = new Scanner(System.in);
		String inputName = scnr.next().toLowerCase();

		int vowelIndex = NameGame.findFirstVowel(inputName);

		//Check for a vowel.
		if (vowelIndex == -1) {
			System.out.println("Please enter a name with a vowel. Sorry :(");
		}
		
		else {
			//Check if it begins with a vowel.
			if (vowelIndex == 0) {
				System.out.println(inputName + ", " + inputName + ", " + "bo-" + "b" + inputName);
				System.out.println("Banana fanna fo-" + "f" + inputName);
				System.out.println("Fee fie mo-" + "m" + inputName);
				System.out.println(inputName + "!");
				return;
			}

			if (inputName.charAt(0) == 'b') {
				String nameBody = inputName.substring(1, inputName.length());
				
				System.out.println(inputName + ", " + inputName + ", " + "bo-" + nameBody);
				System.out.println("Banana fanna fo-" + "f" + nameBody);
				System.out.println("Fee fie mo-" + "m" + nameBody);
				System.out.println(inputName + "!");
				return;
			}
			
			else if (inputName.charAt(0) == 'f') {
				String nameBody = inputName.substring(1, inputName.length());
				
				System.out.println(inputName + ", " + inputName + ", " + "bo-" + "b" + nameBody);
				System.out.println("Banana fanna fo-" + nameBody);
				System.out.println("Fee fie mo-" + "m" + nameBody);
				System.out.println(inputName + "!");
				return;
			}
			
			else if (inputName.charAt(0) == 'm') {
				String nameBody = inputName.substring(1, inputName.length());
				
				System.out.println(inputName + ", " + inputName + ", " + "bo-" + "b" + nameBody);
				System.out.println("Banana fanna fo-" + "f" + nameBody);
				System.out.println("Fee fie mo-" + nameBody);
				System.out.println(inputName + "!");
				return;
			}
			
			else {
				String nameBody = inputName.substring(vowelIndex, inputName.length());
				
				System.out.println(inputName + ", " + inputName + ", " + "bo-" + "b" + nameBody);
				System.out.println("Banana fanna fo-" + "f" + nameBody);
				System.out.println("Fee fie mo-" + "m" + nameBody);
				System.out.println(inputName + "!");
				return;
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
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
}

