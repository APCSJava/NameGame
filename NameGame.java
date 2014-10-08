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
 * @author Duncan Khosla, Stefan Chao
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
 public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
                System.out.println("What's your name. Use capital letters to start please");
                String name = scan.next();
                // TODO Produce the required four lines of verse
                String first = name.substring(0,1);
		String rest;

                if(first.equals("a")||first.equals("e")||first.equals("i")||first.equals("o")||first.equals("u"))
{
first = "B";
rest = name.substring(1,name.length());
}
else{
first = name.substring(0, findFirstVowel(name));
rest = name.substring(findFirstVowel(name),name.length());

}
//-----------------------------------------------------------------------------------------------

                if(first.substring(0,1).equals("B")){
                System.out.println(name+", "+name+ ", " + "bo-"+name.substring(1,name.length()));

 }
if(name.equals("Fitch"))
{
	System.out.println(name +", "+name+", bo-******");
}
	else
{
System.out.println(name+", "+name+ ", " + "bo-b"+rest);
}


//------------------------------------------------------------------------------------------------ 
if(first.substring(0,1).equals("F")){
                System.out.println("bannana fanna fo-"+name.substring(1,name.length()));

 }
if(name.equals("Tucker")||name.equals("Danny")||name.equals("Bart"))
{
	System.out.println("bannana fanna fo-******");
}
	else
{
System.out.println("bannana fanna fo-f"+rest);
}

//----------------------------------------------------------------------------------------------
                if(first.substring(0,1).equals("M")){
                System.out.println("Fee-fi-mo-"+name.substring(1,name.length()));

 }
	else
{
                System.out.println("Fee-fi-mo-m"+rest);
}

//-----------------------------------------------------------------------------------------------------
System.out.println(name +"!");
}

//--------------------------------------------------------
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
