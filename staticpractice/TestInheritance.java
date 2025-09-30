class {
	String name;
	int age;

	Teacher(){
		this.name= " ";
		this.age = 0;
	}

	Teacher(String n,int a){
		this.name = n;
		this.age = a;

	}

	void displayTeacherInfo(){
		System.out.println("------------------  TEACHER INFO  ----------------------------");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

class Student extends Teacher{
	String name;
	int age;

	Student(String tn,int ta,String sn,int sa){
		super(tn,ta);
		this.name = sn;
		this.age = sa;

	}

	void displayStudentInfo(){
		System.out.println("------------------  STUDENT INFO  ----------------------------");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}



class TestInheritance{

	public static void main(String[] args){
		
		Student s1 = new Student("Shiraz khurana", 28 ,"Yash Gautam" , 18);

	
		s1.displayTeacherInfo();
		s1.displayStudentInfo();
		

	}
}