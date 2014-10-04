/**
 * Provided a person's name (single word) the Name Game produces a rhyming
 * verse, as popularized by Shirley Ellis in her 1964 hit recording for Capital Records.
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
 * @author Doug Heynderickx
 * @version 02 October 2014
 */

import java.util.Scanner;

public class NameGame {
 /*
  * Locates the position of the first occurrence of a vowel
  * @param s The string to be analyzed.  
  * @return  The position (index) of the first vowel or -1 if no vowels present.
  */
 public static int findFirstVowel(String s) {
  for (int i = 0; i<s.length(); i++) {
   char letter = s.charAt(i);
   if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
    return i;
   }
  } return -1;
 }
public static void main (String[] args) {
 System.out.println("Please enter the name you would like to sing");
 Scanner userInput = new Scanner(System.in);
 String nameInput = userInput.next();
 char firstChar = nameInput.charAt(0);
 String newName = " "; 
 int cutPoint = findFirstVowel(nameInput);

 if(cutPoint == 0) {
 System.out.println(nameInput + ", " + nameInput + " bo-b" + nameInput);
 System.out.println("Bannana-fana fo-f" + nameInput);
 System.out.println("Fee-fi-mo-m" + nameInput);
 System.out.println(nameInput + "!");
 return;
}
 newName = nameInput.substring(cutPoint , nameInput.length());
 
 if (firstChar == 'b'){
 System.out.println(nameInput + ", " + nameInput + " bo-" + newName);
 System.out.println("Bannana-fana fo-f" + newName);
 System.out.println("Fee-fi-mo-m" + newName);
 System.out.println(nameInput + "!"); 
 } else if (firstChar == 'f') {
 System.out.println(nameInput + ", " + nameInput + " bo-b" + newName);
 System.out.println("Bannana-fana fo-" + newName);
 System.out.println("Fee-fi-mo-m" + newName);
 System.out.println(nameInput + "!");
 } else if (firstChar == 'm') {
 System.out.println(nameInput + ", " +  nameInput + " bo-b" + newName);
 System.out.println("Bannana-fana fo-f" + newName);
 System.out.println("Fee-fi-mo-" + newName);
 System.out.println(nameInput + "!");
 } else {
 System.out.println(nameInput + ", " + nameInput + " bo-b" + newName);
 System.out.println("Bannana-fana fo-f" + newName);
 System.out.println("Fee-fi-mo-m" + newName);
 System.out.println(nameInput + "!");
 }
}
 }
