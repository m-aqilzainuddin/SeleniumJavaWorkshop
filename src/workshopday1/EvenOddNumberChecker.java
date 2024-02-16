package workshopday1;
import java.util.Scanner;

public class EvenOddNumberChecker {
    
	private static boolean isEven(int num) {
        return num % 2 == 0;
    }
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");

        int number = scan.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        scan.close();
    }
}
