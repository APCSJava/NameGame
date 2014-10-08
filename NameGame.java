import java.util.Scanner;
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
 * @author Sophia Zorek
 * @version 8 October 2014
 */
public class NameGame
{
	// create scanner object for use to input string name
    public static void main(String[] args){
        System.out.println("Enter a name in lowercase!");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        
       // if the name starts with a vowel do this algorithm 
        if(findFirstVowel(name) == 0) {
           
            System.out.println(name + ", " + name + ", " + "bo-b" +name);
            System.out.println("Banana fanna fo-f" + name);
            System.out.println("Fee fi mo-m" + name);
            System.out.println(name+ "!");
        
        }
      // if name starts with b m or f follow exception algorithm by removing said b m or f
       else if (name.charAt(0) == 'b' || name.charAt(0) == 'm' || name.charAt(0) == 'f') {
           
        String nameAlt = name.substring(1,name.length());
        System.out.println(nameAlt);
        System.out.println(name + ", " + name + ", " + "bo-" + nameAlt);
        System.out.println("Banana fanna fo-" + nameAlt);
        System.out.println("Fee fi mo-" + nameAlt);
        System.out.println(name+ "!");
           
        
       }
       
      // if name starts with a y perform algorithm that removes first y
     
      else if(findFirstY(name) == 0){
         
                System.out.println(name + ", " + name + ", " + "bo-b" +name.substring(1, name.length()));
                System.out.println("Banana fanna fo-f" + name.substring(1, name.length()));
                System.out.println("Fee fi mo-m" + name.substring(1, name.length()));
         System.out.println(name.substring(1, name.length())+ "!");  
            
            
    
       }
      // if name has a y and does no have any other vowel remove all consonants before y 
      else if (findFirstY(name) >=1 && findFirstVowel(name) == -1) {
          
          String nameAlt = name.substring(findFirstY(name), name.length());                
           
           System.out.println(name + ", " + name + ", " + "bo-b" +nameAlt);
              
           System.out.println("Banana fanna fo-f" + nameAlt);
                System.out.println("Fee fi mo-m" + nameAlt);
                System.out.println(name+ "!");
           
    
       }
       
      else {
      
           // if name does not have any of above exception follow this algorithm     
                String nameAlt = name.substring(findFirstVowel(name), name.length());                
                System.out.println(name + ", " + name + ", " + "bo-b" +nameAlt);
                
                System.out.println("Banana fanna fo-f" + nameAlt);
                System.out.println("Fee fi mo-m" + nameAlt);
                System.out.println(name+ "!");
           
	        }
         }
        
    
       
    
    
   
   

   public static int findFirstVowel(String s) {
       for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		   }	return -1;
		
   }
	   
	 
	 public static int findFirstY(String s) {
        for (int i = 0; i<s.length(); i++) {
                char letter = s.charAt(i);
                if (letter=='y') {
                    return i;
                }
        } 
        return -1;
    
    }
}
