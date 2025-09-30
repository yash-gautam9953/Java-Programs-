import java.util.*;
class Demo{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        if(str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
            sc.close();
        
    }

}

