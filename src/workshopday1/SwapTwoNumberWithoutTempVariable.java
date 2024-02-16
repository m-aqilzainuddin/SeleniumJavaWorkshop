package workshopday1;
import java.util.Scanner;

public class SwapTwoNumberWithoutTempVariable {	
	
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("Enter first number:");
		int number1 = scan.nextInt();

		System.out.print("Enter second number:");
		int number2 = scan.nextInt();

		System.out.println("Before Swap the Value");
		System.out.println("Number1 = "+number1 +"\nNumber 2 ="+number2);

		//swapping method
		number1 = number1 + number2;
		number2 =  number1 - number2;
		number1 = number1 - number2;
		System.out.println();

		System.out.println("After Swap the Value");
		System.out.println("Number1 = "+number1 +"\nNumber 2 ="+number2);
		
		scan.close();	
	}
	
}
