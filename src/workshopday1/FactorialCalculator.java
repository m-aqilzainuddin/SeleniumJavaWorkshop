package workshopday1;
import java.util.Scanner;

public class FactorialCalculator {
 
    private static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }
    
	public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");

        int number = scan.nextInt();

        //negative number checker
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            
            long factorialResult = calculateFactorial(number);

            System.out.println("The factorial of " + number + " is: " + factorialResult);
        }
        scan.close();
    }
}