class Vehicle{

	private String brand;
	protected int speed;
	public String type;

	Vehicle(String b , int s,String t){
		this.brand = b;
		this.speed = s;
		this.type = t;
	}

	String getBrand(){
		return this.brand;
	}

}
class Car extends Vehicle{

	Car(String b , int s,String t){
		
		super(b,s,t);
	}

	void ShowDetails(){
		System.out.println("Brand : " + getBrand());
		System.out.println("Speed : " + speed);
		System.out.println("Type : " + type);
	}
}

class TestVehicle{
	public static void main(String[] args){

		Car c1 = new Car("Swift",120,"Maruti Suzuki");
		c1.ShowDetails();
		
	}
}