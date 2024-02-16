package workshopday1;

import java.util.Scanner;

public class StudentGrading {
    public String studName;
    public int studGrade;

    public static void main (String[]args){
    	Scanner scan = new Scanner(System.in);

        System.out.print("Enter student name:");
        String studName = scan.nextLine();

        System.out.print("Enter student grade:");
        int studGrade = scan.nextInt();

        System.out.println();

        System.out.print("Student name:"+studName);
        System.out.print("\nExam performance:");

        if(studGrade<40){
            System.out.print("Fail");
        }else if (studGrade>=40 && studGrade<=60){
            System.out.print("Pass");
        }else if(studGrade>=60 && studGrade<=80){
            System.out.print("Good");
        }else{
            System.out.print("Distinction");
        }
        scan.close();	
    }

}
