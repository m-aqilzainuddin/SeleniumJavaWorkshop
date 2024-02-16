package workshopday1;
import java.util.Scanner;

public class MinMaxElementInArray {
	 public static void main(String[] args) {
	        
		 Scanner scan = new Scanner(System.in);

		 System.out.print("Enter the size of the array: "); 
		 int size = scan.nextInt();

		 int[] array = new int[size];

		 System.out.println("Enter the elements of the array:");
   
		 for (int i = 0; i < size; i++) { 
			 System.out.print("Element " + (i + 1) + ": "); 
			 array[i] = scan.nextInt();
		 }
	        
		 findMaxMin(array);
		 scan.close();
	    }

	    private static void findMaxMin(int[] arr) {
	        
	    	if (arr.length == 0) {
	    		System.out.println("Array is empty.");
	            return;
	        }

	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }

	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("Maximum element in the array: " + max);
	        System.out.println("Minimum element in the array: " + min);
	    }
}
