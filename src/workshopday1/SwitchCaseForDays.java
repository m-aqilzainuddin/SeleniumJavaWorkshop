package workshopday1;
import java.util.Scanner;

public class SwitchCaseForDays {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //each number represent a day in a week.
        System.out.print("Each number represent a day in a week, enter a number 1-7:");
        int dayNumber = scan.nextInt();

        String dayName;
        switch (dayNumber) {
            case 1:
                //system.out.print("Sunday");
                dayName = "Sunday";
                break;
            case 2:
            	//system.out.print("Monday");
                dayName = "Monday";
                break;
            case 3:
            	//system.out.print("Tuesday");
                dayName = "Tuesday";
                break;
            case 4:
            	//system.out.print("Wednesday");
                dayName = "Wednesday";
                break;
            case 5:
            	//system.out.print("Thursday");
                dayName = "Thursday";
                break;
            case 6:
            	//system.out.print("Friday");
                dayName = "Friday";
                break;
            case 7:
            	//system.out.print("Saturday");
                dayName = "Saturday";
                break;
            default:
            	//system.out.print("Invalid day number");
                dayName = "Invalid day number";
        }

        System.out.println("The day corresponding to " + dayNumber + " is: " + dayName);
        scan.close();
    }

}
