class Person{

	String name;
	int age;

	Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}

	void ShowDetails(){
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}

}
class Employee extends Person{

	Employee(String name, int age){
		
		super(name,age);
	}

	void ShowDetails(){
		super.ShowDetails();
	}

}

class TestPerson{
	public static void main(String[] args){

		Employee e1 = new Employee("Yash Gautam",18);
		e1.ShowDetails();
		
	}
}