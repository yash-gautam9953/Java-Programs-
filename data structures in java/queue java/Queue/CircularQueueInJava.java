
    import java.util.*;
@SuppressWarnings({ "unused"})
public class CircularQueueInJava {

    public static class QueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        
        public void add(int val){
            if(size==arr.length){
                System.out.println("Queue is full ");
            }else if(size == 0){
                f = r = 0;
                arr[0]=val;
            }else if(r<arr.length-1){
                arr[++r] = val;
            }else if(r == arr.length-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }
        public int poll(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                int val = arr[f];
                if(f == arr.length-1) f=0;
                else f++;
                size--;
                return val;
            }
        }
        public void display(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return ;
            }
            else if(f <= r){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i] + " ");
               }
           }else{
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i] + " ");
               }
            for(int i=0;i<=r;i++){
                System.out.print(arr[i] + " ");
               }
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
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
       
    }
    
}



