public class NameGameTester {

// implementation provided -- use as is
   public static void main(String[] args) {
      NameGame johnny = new NameGame("Johnny");
      String johnnyLyrics = johnny.getLyrics();
      System.out.println(johnnyLyrics);
     
      NameGame marsha = new NameGame("Marsha");
      String marshaLyrics = marsha.getLyrics();
      System.out.println(marshaLyrics);
     
     // a for-each loop processes run time arguments, if any
      for (String s: args) {
         NameGame game = new NameGame(s);
         String lyrics = game.getLyrics();
         System.out.println(lyrics);
      }
   }
}