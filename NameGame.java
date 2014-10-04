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
 * @author Roxy Sammons
 * @version 4 October 2014
 */

import java.util.Scanner;

public class NameGame {
  
  /*
   * Locates the position of the first occurrence of a vowel
   * 
   * @param s The string to be analyzed.  
   * @return  The position (index) of the first vowel or -1 if no vowels present.
   */
  
  public static int findFirstVowel(String s) {
    s=s.toLowerCase();
    for (int i = 0; i<s.length(); i++) {
      char letter = s.charAt(i);
      if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
        return i;
      }
      
    } return -1;
    
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a name:");
    String name = input.next();
    int positionVowel = findFirstVowel(name);
    String partName = name.substring(1, name.length());
    
    if (positionVowel == 0) {
      System.out.println(name + ", " + name + ", bo-b" + name );
      System.out.println("Banana fanna fo-f" + name );
      System.out.println("Fee fie mo-m" + name );
      System.out.println(name + "!");
    } else if (name.charAt(0) == 'b') {
      System.out.println(name + ", " + name + ", bo-" + partName );
      System.out.println("Banana fanna fo-f" + partName );
      System.out.println("Fee fie mo-m" + partName );
      System.out.println(name + "!"); 
    } else if (name.charAt(0) == 'f') {
      System.out.println(name + ", " + name + ", bo-b" + partName );
      System.out.println("Banana fanna fo-" + partName );
      System.out.println("Fee fie mo-m" + partName );
      System.out.println(name + "!"); 
    } else if (name.charAt(0) == 'm') {
      System.out.println(name + ", " + name + ", bo-b" + partName );
      System.out.println("Banana fanna fo-f" + partName );
      System.out.println("Fee fie mo-" + partName );
      System.out.println(name + "!"); 
    } else {
      System.out.println(name + ", " + name + ", bo-b" + partName );
      System.out.println("Banana fanna fo-f" + partName );
      System.out.println("Fee fie mo-m" + partName );
      System.out.println(name + "!");
    }
    
  }
}
