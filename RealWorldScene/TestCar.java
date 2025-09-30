class Car{

	String brand;
	String model;
	int year;

	
	Car(String b,String m,int y){
		brand = b;
		model= m;
		year = y;
	}

	void DisplayInfo(){
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
	}
	void StartEngine(){
		System.out.println("Engine Start ..........");
	}
	void StopEngine(){
		System.out.println("Engine Stop ..........");
	}


}
class TestCar{

	public static void main(String[] args){

		System.out.println();

		Car car1 = new Car("Grand I10","Hyundai",2015);
		car1.DisplayInfo();
		System.out.println();
		car1.StartEngine();
		System.out.println();
		car1.StopEngine();

		System.out.println();

	}
}