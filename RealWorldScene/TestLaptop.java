class Laptop{
	
	String brand;
	String processor;
	int ramsize;

	Laptop(){
		brand = "";
		processor = "";
		ramsize=0;
	}

	Laptop(String b,String p,int rs){
		brand=b;
		processor=p;
		ramsize=rs;
	}

	void displayLaptopSpecs(){
		System.out.println("Brand : " + brand);
		System.out.println("Processor : " + processor);
		System.out.println("Ram Size: " + ramsize);
	}

	void upgradeRam(int rs){
		if(rs > ramsize || rs < ramsize){
			ramsize = rs;
			System.out.println();
			System.out.println("Ram Upgraded .......");
			System.out.println();
			displayLaptopSpecs();
		}else{
			System.out.println("Invalid request ....");
		}
	}

}

class TestLaptop{

	public static void main(String[] args){

		System.out.println();

		Laptop l1 = new Laptop("Victus HP","Intel I5 13gen",8);
		l1.displayLaptopSpecs();
		System.out.println();
		l1.upgradeRam(16);
		System.out.println();

	}
}