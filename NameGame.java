/***
* Starter code for the NameGame
* 1 - add a field to store the location of the initial vowel
* 2 - implement the constructor
* 3 - implement, in turn, the B, F and M line methods
* TEST FREQUENTLY as you develop
* USE BREAKPOINTS and the debugger to identify errors
* 4 - add enhancements and refinements, discuss
**/
public class NameGame {

   private String name; // different for each instance
   // TODO use a field to store the location of first vowel
   
   
   // constructor
   public NameGame(String s){
     //TODO  - initialize all fields
   }
   
   // TODO implement this method correctly
   private String buildBLine() {
      return "TODO - B line\n";
   }
   
   // TODO implement this method correctly
   private String buildFLine() {
      return "TODO - F line\n";
   }
   
   // TODO implement this method correctly
   private String buildMLine() {
      return "TODO - M line\n";
   }
   
   // returns the complete verse
   // implementation provided -- use as is
   public String getLyrics() {
      String start = "Let's do "+name+":\n"; // first line
      String b = buildBLine();
      String f = buildFLine();
      String m = buildMLine();
      String end = name + "!";
      return start + b + f + m + end;
   }
   
   // returns the position of the first vowel or -1 if no vowels present.
   // implementation provided -- use as is
   public int findFirstVowel() {
      String lower = name.toLowerCase();
      for (int i = 0; i<lower.length(); i++) {
         String s = lower.substring(i, i+1);
         if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
            return i;
         }
      }	
      return -1;
   }
}

