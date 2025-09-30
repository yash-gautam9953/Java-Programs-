import java.util.Scanner;

class OperationEven extends Thread{
    int num;

    OperationEven(int n){
        this.num = n;
    }

    public void run(){
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.print("Even :"+ i);
            }
        }
    }
}

class OperationOdd extends Thread{
    int num;

    OperationOdd(int n){
        this.num = n;
    }

    public void run(){
        for(int i=0;i<=num;i++){
            if(i%2!= 0){
                System.out.print("Odd :"+ i);
            }
        }
    }
}


class TestEvenOdd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int num = sc.nextInt();
            OperationEven e1 = new OperationEven(num);
            OperationOdd o1 = new OperationOdd(num);
            e1.start();
            o1.start();

            sc.close();

        }
}
