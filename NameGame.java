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
 * @author Christopher Vann
 * @version 2 October 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
		// TODO Read the name from standard input 
		// TODO Produce the required four lines of verse 
		// TODO Print the verse to standard output
		// TODO remove "to do" comments when they are "to done"
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the name you want to play The Name Game with.");
		String x = sc.next();
		String y = x.substring(findFirstVowel(x), x.length());
		int letterStart=0;
		if (x.charAt(0)=='b'||x.charAt(0)=='B'){
			letterStart=1;
		}else if(x.charAt(0)=='f'||x.charAt(0)=='F'){
			letterStart=2;
		}else if(x.charAt(0)=='m'||x.charAt(0)=='M'){
			letterStart=3;
		}
		switch (letterStart){
			case 0:
				System.out.println(x+", "+x+", bo-b"+y);
				System.out.println("Banana-fanna fo-f"+y);
				System.out.println("Fee-fi-mo--m"+y);
				System.out.println(x+"!");
				break;
                        case 1:
                                System.out.println(x+", "+x+", bo-"+y);
                                System.out.println("Banana-fanna fo-f"+y);
                                System.out.println("Fee-fi-mo--m"+y);
                                System.out.println(x+"!");
				break;
                        case 2:
                                System.out.println(x+", "+x+", bo-b"+y);
                                System.out.println("Banana-fanna fo-"+y);
                                System.out.println("Fee-fi-mo--m"+y);
                                System.out.println(x+"!");
				break;
                        case 3:
                                System.out.println(x+", "+x+", bo-b"+y);
                                System.out.println("Banana-fanna fo-f"+y);
                                System.out.println("Fee-fi-mo--"+y);
                                System.out.println(x+"!");
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
		for (int i = 0; i<s.length(); i++) {
			s = s.toLowerCase();
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
}

