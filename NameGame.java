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
 * @author Nikolas Huth
 * @author <additional author(s); if multiple, separate with commas>
 * @version 30 September 2014
 */

import java.util.Scanner;

public class NameGame {
	public static void main(String[] args) {
		String firstLn = "bo-b";
		String scndLn = "bannana-fana-fo-f";
		String thrdLn = "fee-fi-mo-m";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input a name with no caps: ");
		String input = scan.nextLine();
		String first = input.substring(0,1);
		
		int checkVowel = findFirstVowel(input);
		if(checkVowel == 0) {
			System.out.println(input +" "+input+" "+firstLn+input);
			System.out.println(scndLn+input);
			System.out.println(thrdLn+input);
			System.out.println(input);
		}
		else if(first.equals("b")) {
			String y = input.substring(checkVowel, input.length());
			System.out.println(input +" "+input+" "+"bo-"+y);
			System.out.println(scndLn+y);
			System.out.println(thrdLn+y);
			System.out.println(input);
		}
		else if(first.equals("f")) {
			String y = input.substring(checkVowel, input.length());
			System.out.println(input +" "+input+firstLn+y);
			System.out.println("Bannana-fanna-fo-"+y);
			System.out.println(thrdLn+y);
			System.out.println(input);
		}
		else if(first.equals("m")) {
			String y = input.substring(checkVowel, input.length());
			System.out.println(input +" "+input+firstLn+y);
			System.out.println(scndLn+y);
			System.out.println("fee-fi-mo-"+y);
			System.out.println(input);
		}
		else {
			String y = input.substring(checkVowel, input.length());
			System.out.println(input +" "+input+" "+firstLn+y);
			System.out.println(scndLn+y);
			System.out.println(thrdLn+y);
			System.out.println(input);
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
}

