package workshopday2;

public class Car extends Vehicle{

	public String carBrand;
	public int carPrice;
	
	public Car(int speed, int milage, String carBrand, int carPrice){
		super(speed,milage);
		this.carBrand = carBrand;
		this.carPrice = carPrice;
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	public int getCarPrice() {
		return carPrice;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Car Brand:"+carBrand);
		System.out.println("Car Price:"+carPrice);
	}
}
