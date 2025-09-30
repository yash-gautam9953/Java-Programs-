class Static{
	static String name;
	static int age;
	static String rollno;

	Static(String n,int a,String r){
		name = n;
		age = a;
		rollno = r;
	}

	static void displayInfo(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Roll No. : " + rollno);
	}

	static{

		System.out.println("Static Block Invocked ! ");
	}

}

class TestStatic{

	public static void main(String[] yash){

		Static.name="yash";
		Static.age=18;
		Static.rollno="067";
		Static.displayInfo();

		
	}
}