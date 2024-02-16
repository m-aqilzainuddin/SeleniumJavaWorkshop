package workshopday1;
import java.util.Scanner;

public class SumOfTwoNumber {
	
	public static int sumOfTwo(int num1, int num2) {
        return num1 + num2;
    }
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number:");
        int number1 = scan.nextInt();

        System.out.print("Enter second number:");
        int number2 = scan.nextInt();

        int sum = number1+number2;
        System.out.println("The sum of two number is:"+sum);
     
        System.out.println();
        //---------------------------------------------------------------//
        
        //by using method.
        System.out.print("Enter the first number:");
        int number3 = scan.nextInt();

        System.out.print("Enter the second number:");
        int number4 = scan.nextInt();

        int result = sumOfTwo(number3, number4);

        System.out.println("The sum of two number is:" + result);
        scan.close();
    }
}
