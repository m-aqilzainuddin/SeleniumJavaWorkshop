package workshopday2;

import java.util.Scanner;

public class Circle {

	public  double circleRadius;
	public  String circleColor;
	public static double pi = 3.142;
	
	public static double calculateCircleArea(double radius) {
		return pi * Math.pow(radius, 2);
	}

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter circle color:");
        String circleColor = scan.nextLine();
        
        System.out.print("Enter circle radius:");
        double radius = scan.nextDouble();

        System.out.println();
        double circleArea = calculateCircleArea(radius);
        System.out.println("The circle color is:"+circleColor+"\nThe area of the circle is:"+circleArea);
    	scan.close();
	}
}