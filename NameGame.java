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
 * @author Kent Collins
 * @author Sarah Brunsberg
 * @version 30 September 2014
 */

import java.util.*;

public class NameGame {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter your name.");

  String startName = scan.next();
  String name = startName.toLowerCase();
  int position = findFirstVowel(name);
  
  if (position == -1) { //if there are no vowels
    System.out.println("Sorry, the name game won't work for you. Restart the program and enter a different name.");
    return; //avoids all the errors that will occur
  }
    

  String moName = name.substring(position, name.length()); //For example, “brad” becomes “ad”
  

  if (name.charAt(0) == 'b'){
  System.out.println(startName + ", " + startName + ", " + "bo-" + name.substring(1,name.length()));
  } else {
  System.out.println(startName + ", " + startName + ", " + "bo-b" + moName);
  }

  if (name.charAt(0) == 'f'){
  System.out.println("banana-fana fo-" + name.substring(1,name.length()));
  } else {
  System.out.println("banana-fana fo-f" + moName);
  }

  if (name.charAt(0) == 'm'){
  System.out.println("Fee fie mo-" + name.substring(1,name.length()));
  System.out.println(startName + "!");
  } else {
  System.out.println("Fee fie mo-m" + moName);
  System.out.println(startName + "!");
  }
 }
 
 /*
  * Locates the position of the first occurrence of a vowel
  * 
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
}
