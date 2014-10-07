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
 * @author <additional author(s); if multiple, separate with commas>
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
		// TODO Read the name from standard input 
		// TODO Produce the required four lines of verse 
		// TODO Print the verse to standard output
		// TODO remove "to do" comments when they are "to done"
		
		Scanner nameFind = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = nameFind.next();
		int index = findFirstVowel(name);
		if(index == -1){
			System.out.println("Please enter a name with a vowel");
		}else if(index == 0){
			System.out.println(name + " " + name + "bo b" + name);
			System.out.println("Banana fana fo f" + name);
			System.out.println("fee fi mo m" + name);
		}else{
			if(name.charAt(0) == 'B'){
				String b = name.substring(index, name.length());
				System.out.println(name + " " + name + "bo " + name);
				System.out.println("Banana fana fo f" + b);
				System.out.println("fee fi mo m" + b);
			}else if(name.charAt(0) == 'F'){
				String f = name.substring(index, name.length());
				System.out.println(name + " " + name + "bo b" + f);
				System.out.println("Banana fana fo " + name);
				System.out.println("fee fi mo m" + f);
			}else if(name.charAt(0) == 'M'){
				String m = name.substring(index, name.length());
				System.out.println(name + " " + name + "bo b" + m);
				System.out.println("Banana fana fo f" + m);
				System.out.println("fee fi mo " + name);
			}else{
				String y = name.substring(1, name.length());
				System.out.println(name + " " + name + "bo b" + y);
				System.out.println("Banana fana fo f" + y);
				System.out.println("fee fi mo m" + y);
			}
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
}

