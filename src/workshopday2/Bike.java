package workshopday2;

public class Bike extends Vehicle{
	public String bikeBrand;
	public int bikePrice;
	
	public Bike(int speed, int milage, String bikeBrand, int bikePrice){
		super(speed,milage);
		this.bikeBrand = bikeBrand;
		this.bikePrice = bikePrice;
	}
	
	public String getBikeBrand() {
		return bikeBrand;
	}
	public int getBikePrice() {
		return bikePrice;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Bike Brand:"+bikeBrand);
		System.out.println("Bike Price:"+bikePrice);
	}
}
