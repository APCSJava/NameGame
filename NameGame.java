/**
 * Provided a person's name (single word) the Name Game produces a rhyming
 * verse, as popularized by Shirley Ellis in her 1964 hit recording for Capital Records.
 * @author Monica Brendsel
 * @version 8 October 2014
 */

import java.util.Scanner;

public class NameGame {
        public static void main(String[] args) {

                System.out.print("Enter your name for the Name Game: ");

                Scanner input = new Scanner (System.in);
                String word = input.next();
                int index = findFirstVowel(word);
                String back = "";
                if (word.toLowerCase().equals("tucker") || word.toLowerCase().equals("bart") || word.toLowerCase().equals("judy") || word.toLowerCase().equals("mitch") || word.toLowerCase().equals("maggie") || word.toLowerCase().equals("alice") || word.toLowerCase().equals("danny") || word.toLowerCase().equals("ruby")) {
                System.out.println("This name is not allowed. Please try again.");
                }
                else if (index == 0 && (word.charAt(0) == 'y' || word.charAt(0) == 'Y')) {
                        back = word.substring(index+1, word.length());
                        System.out.println(word+", "+ word+", "+"bo-b"+back);
                        System.out.println("banana fanna fo-f"+back);
                        System.out.println("Fee fie mo-m"+back);
                        System.out.println(word+"!");
                }
                else if (index == 0) {
                        System.out.println(word+", "+ word+", "+"bo-b"+word);
                        System.out.println("banana fanna fo-f"+word);
                        System.out.println("Fee fie mo-m"+word);
                        System.out.println(word+"!");
                }
                else if (index == -1) {
                        System.out.println("Error");
                }
                else if ((word.charAt(0) == 'B') || (word.charAt(0) == 'b')) {
                        back = word.substring(index, word.length());
                        System.out.println(word+", "+ word+", "+"bo-"+back);
                        System.out.println("banana fanna fo-f"+back);
                        System.out.println("Fee fie mo-m"+back);
                        System.out.println(word+"!");
                }
                else if ((word.charAt(0) == 'F') || (word.charAt(0) == 'f')) {
                        back = word.substring(index, word.length());
                        System.out.println(word+", "+ word+", "+"bo-b"+back);
                        System.out.println("banana fanna fo-"+back);
                }
                 else if ((word.charAt(0) == 'M') || (word.charAt(0) == 'm')) {
                        back = word.substring(index, word.length());
                        System.out.println(word+", "+ word+", "+"bo-b"+back);
                        System.out.println("banana fanna fo-f"+back);
                        System.out.println("Fee fie mo-"+back);
                        System.out.println(word+"!");
                }


                else {
                        back = word.substring(index, word.length());
                        System.out.println(word+", "+ word+", "+"bo-b"+back);
                        System.out.println("banana fanna fo-f"+back);
                        System.out.println("Fee fie mo-m"+back);
                        System.out.println(word+"!");
                }
}      
        /*
         * Locates the position of the first occurrence of a vowel
         *
         * @param s The string to be analyzed.
         * @return      The position (index) of the first vowel or -1 if no vowels present.
         */
        public static int findFirstVowel(String s) {
                for (int i = 0; i<s.length(); i++) {
                        char letter = s.charAt(i);
                        if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u' || letter == 'y' || letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U' || letter=='Y') {
                                return i;
                        }

                }       return -1;

        }
}

