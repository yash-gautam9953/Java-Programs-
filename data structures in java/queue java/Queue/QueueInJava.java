import java.util.*;
@SuppressWarnings({ "unused", "resource" })
public class QueueInJava {

    public static class QueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[10];
        
        public void add(int val){
            if(r==arr.length-1 ){
                System.out.println("Queue is full ");
                return;
            }else{
                r++;
                size++;
                arr[r] = val;
            }
        }
        public int poll(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return 0;
            }else{
                f++;
                size--;
                return arr[f-1];
            }
        }
        public void display(){
            if(f == -1){
                System.out.println("Stack is Empty");
                return ;
            }
           for(int i=f;i<=r;i++){
            System.out.print(arr[i] + " ");
           }
           System.out.println();
            
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return 0;
            }
            return arr[f];
            
        }
        public int size(){
            return size;
        }
    }
   
    public static void main(String[] args) {
      
        QueueA q = new QueueA();
        q.add(1);
        q.add(2);
        q.display();
        System.out.println(q.r);
       
    }
    
}
