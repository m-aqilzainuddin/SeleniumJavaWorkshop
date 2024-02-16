package workshopday2;

public class Vehicle {

	public int speed;
	public int mileage;
	
	public Vehicle(int speed, int mileage){
		this.speed = speed;
		this.mileage = mileage;
	}
	
	public double getSpeed() {
		return speed;
	}
	public int getMileage() {
		return mileage;
	}
	
	public void display() {
		System.out.println("Speed: " + speed + " km/h");
        System.out.println("Mileage: " + mileage + " km");
	}
}
