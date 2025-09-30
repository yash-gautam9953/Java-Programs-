import java.util.Scanner;
public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("Division is :" + c);
        }
        catch(ArithmeticException e){
            System.out.println("you can't able to Divide these numbers !");
        }

        
    }
}
