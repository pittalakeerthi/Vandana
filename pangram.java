package alphabets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence: ");
	        String input = scanner.nextLine();
	        boolean isPangram = isPangram(input);
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	        // Convert the input to lowercase to handle case-insensitivity
	        input = input.toLowerCase();

	        // Create a set to store the unique letters in the input
	        Set<Character> uniqueLetters = new HashSet<>();

	        // Iterate through each character in the input
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is an alphabet letter (a to z)
	            if (ch >= 'a' && ch <= 'z') {
	                // Add the letter to the set
	                uniqueLetters.add(ch);

	                // If all 26 unique letters are found, it's a pangram
	                if (uniqueLetters.size() == 26) {
	                    return true;
	                }
	            }
	        }

	        // If after iterating the set contains all 26 letters, it's a pangram
	        return uniqueLetters.size() == 26;
	    }
	}



