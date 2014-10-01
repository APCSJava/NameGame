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
 * @author Calvin Bohner
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {

int vowel = 0; 
String name = ""; 

Scanner input = new Scanner(System.in);

System.out.println("Please input your name.");
name = input.nextLine();

vowel = findFirstVowel(name);

name = name.toLowerCase(); 

String aftvowel = name.substring(vowel, name.length());

if (name.charAt(0) == 'b'){

System.out.println(name + ", " + name + ", bo-" + aftvowel  );

}
else{
System.out.println(name + ", " + name + ", bo-b" + aftvowel);
} 

if(name.charAt(0) == 'f'){
System.out.println("Banana fanna fo-" + aftvowel );
}
else {
System.out.println("Banana fanna fo-f" + aftvowel);
}


if(name.charAt(0) == 'm'){ 
System.out.println("Fee fie mo-" + aftvowel );

}

else{

System.out.println("Fee fie mo-m"+ aftvowel);
}
System.out.println(name + "!");

		// TODO Read the name from standard input 
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
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u' || letter == 'y') {
				return i;
			}
		
		}	return -1;
		
	}
}

