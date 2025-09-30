class Student{

	String name;
	String rollNo;
	int persentage;

	Student(String name,String rollNo,int persentage){
		this.name=name;
		this.rollNo=rollNo;
		this.persentage=persentage;
	}

	void displayStudentDetails(){
		System.out.println("Name : " + this.name);
		System.out.println("Roll No : " + this.rollNo);
		System.out.println("Persentage : " + this.persentage);
	}
}


class javaYash{

	public static void main(String[] args){

		Student s1=new Student("Yash Gautam","235/ICS/067",79);
		s1.displayStudentDetails();

	}
}

