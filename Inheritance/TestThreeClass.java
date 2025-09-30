class Animal{

	void eat(){
		System.out.println("Eating ..........");
	}

}

class Memmal extends Animal{
	void breathe(){
		System.out.println("Breathing ..........");
	}
}

class Human extends Memmal{
	void speak(){
		System.out.println("Speaking ..........");
	}
}


class TestThreeClass{

	public static void main(String[] args){

		Human h1 = new Human();
		h1.eat();
		h1.breathe();
		h1.speak();
		
	}
}