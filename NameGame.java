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
 * You can assume that all names include a vowel.
 * 
 * @author Kent Collins
 * @author <additional author(s); if multiple, separate with commas>
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
        Scanner original = new Scanner(System.in);
        System.out.println("Please enter the name that you would like to use: ");
        String originalWord = original.next();
        int firstVowel = findFirstVowel(originalWord);
        if(firstVowel==-1){
            System.out.println("All names have vowels.  Enter an actual name.");
            return;
        }
        String edited = originalWord.substring(firstVowel,originalWord.length());
        String startBFM = originalWord.substring(1,originalWord.length());
        boolean startsWithB = false;
        boolean startsWithF = false;
        boolean startsWithM = false;
        if(originalWord.charAt(0)=='b' || originalWord.charAt(0)=='B'){
            startsWithB = true;
        }
        if(originalWord.charAt(0)=='f' || originalWord.charAt(0)=='F'){
            startsWithF = true;
        }
        if(originalWord.charAt(0)=='m' || originalWord.charAt(0)=='M'){
            startsWithM = true;
        }
        //First line below ---------------------------------------------------------
        System.out.print(originalWord+", "+originalWord+", bo-");
        if(startsWithB){
            System.out.println(startBFM);
        }else{
            System.out.println("b"+edited);
        }
        //Second line below --------------------------------------------------------
        System.out.print("Banana fanna fo-");
        if(startsWithF){
            System.out.println(startBFM);
        }else{
            System.out.println("f"+edited);
        }
        //Third line below ---------------------------------------------------------
        System.out.print("Fee fie mo-");
        if(startsWithM){
            System.out.println(startBFM);
        }else{
            System.out.println("m"+edited);
        }
        //Last line below ----------------------------------------------------------
        System.out.println(originalWord+"!");
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
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u' || letter =='y') {
				return i;
			}
		
		}	return -1;
		
	}
}