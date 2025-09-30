class Animal{

	void MakeSound(){
		System.out.println("Animal Sound Invoke");
	}
}
class Dog extends Animal{

	void MakeSound(){
		System.out.println("Dog Sound Invoke");
	}
}

class TestAnimal{
	public static void main(String[] args){

		Dog d1 = new Dog();
		d1.MakeSound();
	}
}