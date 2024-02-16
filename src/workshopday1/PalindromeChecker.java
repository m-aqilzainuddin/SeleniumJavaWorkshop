package workshopday1;

import java.util.Scanner;

public class PalindromeChecker {

    private static boolean isPalindrome(String str) {
        
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
	public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = scan.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
        scan.close();
    }
}