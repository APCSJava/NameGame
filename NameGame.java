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

import java.util.*;

public class NameGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ("Please insert any name please");
    Boolean done = false;
    
    while (!done) {
      String name = input.next();
      name = name.toLowerCase();
      int position = findFirstVowel(name);
      String moName = name.substring(position,name.length());
      String firstLetter = name.substring (0,1);
      
      Boolean specialNames = firstLetter.equals("b") || firstLetter.equals("f") || firstLetter.equals("m");
      
      if (specialNames == true) {
        System.out.println (name + ", " + name + ", " + "bo-b" + name.substring(1,name.length()));
        System.out.println ("Banana fana fo-f" + name.substring(1,name.length()));
        System.out.println ("Fee fie mo-b" + name.substring(1,name.length()));
        System.out.println (name + "!");
        
        done = true;
        
      } else if (specialNames == false) {
        System.out.println (name + ", " + name + ", " + "bo-" +  "b" + moName);
        System.out.println ("Banana fanna fo-" + "f" + moName);
        System.out.println ("Fee fie mo-" + "m" + moName);
        System.out.println (name + "!");
        
        done = true;
        
      } else {
        System.out.println ("Please write a name, what you wrote isn't really a name");
      }
      
    }
  }
  
  public static int findFirstVowel(String s) {
    for (int i = 0; i<s.length(); i++) {
      char letter = s.charAt(i);
      if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
        return i;
      }
      
    }       return -1;
    
  }
}

