package workshopday2;
import java.util.Scanner;

public class ExceptionHandling {
    
	private static double doDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }else
        	return (double) numerator / denominator;
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
        	System.out.println("DIVISION: First number will be divided by the second number.");
            System.out.print("Enter first number: ");
            int fnum = scan.nextInt();

            System.out.print("Enter second number: ");
            int snum = scan.nextInt();

            double result = doDivision(fnum, snum);

            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
