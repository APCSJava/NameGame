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
 * @author Rohan Prasad, Tristan Burke.
 * @version 2014, October 2
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a name to Name-Game-ify:");
		String name = scnr.next(); 
		String nmLower = name.toLowerCase();
		if (nmLower.substring(0,1).equals("b")) {
			String noConsonant = name.substring(findFirstVowel(name),name.length());
			System.out.println(name + ", " + name + ", " + "bo-" + noConsonant);
			System.out.println("Banana-fana fo-f" + noConsonant);
			System.out.println("Fee-fi-mo-m" + noConsonant);
			System.out.println(name + "!");
		}
		else if (nmLower.substring(0,1).equals("m")) {
                        String noConsonant = name.substring(findFirstVowel(name),name.length());
                        System.out.println(name + ", " + name + ", " + "bo-b" + noConsonant);
                        System.out.println("Banana-fana fo-f" + noConsonant);
                        System.out.println("Fee-fi-mo-" + noConsonant);
                        System.out.println(name + "!");
                }
		else if (nmLower.substring(0,1).equals("f") || nmLower.substring(0,2).equals("ph")) {
                        String noConsonant = name.substring(findFirstVowel(name),name.length());
                        System.out.println(name + ", " + name + ", " + "bo-b" + noConsonant);
                        System.out.println("Banana-fana fo-" + noConsonant);
                        System.out.println("Fee-fi-mo-m" + noConsonant);
                        System.out.println(name + "!");
                }
		else {
                        String noConsonant = name.substring(findFirstVowel(name),name.length());
                        System.out.println(name + ", " + name + ", " + "bo-b" + noConsonant);
                        System.out.println("Banana-fana fo-f" + noConsonant);
                        System.out.println("Fee-fi-mo-m" + noConsonant);
                        System.out.println(name + "!");
                }
	}
	
	/*
	 * Locates the position of the first occurrence of a vowel
	 * 
	 * @param s The string to be analyzed.  
	 * @return 	The position (index) of the first vowel or -1 if no vowels present.
	 */
	public static int findFirstVowel(String s) {
		s = s.toLowerCase();
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
}

