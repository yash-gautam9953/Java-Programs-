class Employee {
    String name;
    int empID;
    double salary;

    Employee() {
        this.name = "";
        this.empID = 0;
        this.salary = 0.0;
    }

    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }


    Employee(Employee obj) {
        this.name = obj.name;
        this.empID = obj.empID;
        this.salary = obj.salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Salary: Rs. " + salary);
    }
}


class test2{
    public static void main(String[] yash) {
    
        Employee ramesh = new Employee();

        Employee mohan = new Employee("Mohan", 1023, 50000);

        Employee mohancopy = new Employee(mohan);

        
        System.out.println("----------  Ramesh Details  ----------");
        ramesh.displayDetails();

        System.out.println("----------  Mohan Details  ----------");
        mohan.displayDetails();

        System.out.println("----------   Copy Mohan Details  ----------");
        mohancopy.displayDetails();
    }
}
