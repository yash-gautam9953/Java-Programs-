class Student{
	
	String name;
	String rollno;
	double grade;

	Student(){
		name = "";
		rollno = "";
		grade=0;
	}

	Student(String n,String r,double g){
		name=n;
		rollno=r;
		grade=g;
	}

	void displayDetails(){
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + rollno);
		System.out.println("Grade : " + grade);
	}

	void updateGrade(double g){
		grade = g;
		System.out.println();
		System.out.println("Garde Upadted .......");
		System.out.println();
		displayDetails();
	}

}

class TestStudent{

	public static void main(String[] args){

		System.out.println();

		Student st1 = new Student("Yash Gautam","235/ICS/067",8.88);
		st1.displayDetails();
		System.out.println();
		st1.updateGrade(7.82);
		System.out.println();

	}
}