class Parent {
    void show() {
        System.out.println("Parent ka method");
    }
}

class Child extends Parent {
    // @Override NAHI LAGAYA
    void show() {  
        System.out.println("Child ka method");
    }
}

public class java2 {
    public static void main(String[] args) {
        Parent obj = new Parent();  // Upcasting
        obj.show();  // Child ka method chalega (Overriding ka effect)
    }
}