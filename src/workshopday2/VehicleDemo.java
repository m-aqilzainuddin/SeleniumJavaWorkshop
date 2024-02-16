package workshopday2;

public class VehicleDemo {

	public static void main (String []args) {
		Car myCar = new Car(28,35000,"BMW",340000);
		Bike myBike = new Bike(26,28000,"Ducati V4S",48000);
		
		System.out.println("Car Details");
		myCar.display();
		
		System.out.println();
		
		System.out.println("Bike Details");
		myBike.display();
	}
}
