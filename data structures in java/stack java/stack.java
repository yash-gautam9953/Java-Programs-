public class stack {
    @SuppressWarnings("unused")
    public static class Stack{
        private int[] arr = new int[10];
        private int top = -1;

        void push(int data){
            if(top > arr.length){
                System.out.println("Stack is Overflow ! ");
            }else{
                top++;
                arr[top]=data;
            }
        }
        void display(){
            if(top == -1){
                System.out.println("Stack is Empty ! ");
            }else{
            System.out.print("Stack Elements are : [");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i] + "," );
            }
            System.out.print("]");
            System.out.println();
        }
        }
        boolean isFull(){
            if(top == (arr.length-1)){
                return true;
            }else{
                return false;
            }
        }
        boolean isEmpty(){
            if(top == -1 || arr.length == 0){
                return true;
            }else{
                return false;
            }
        }
        int size(){
            return top +1;
        }
        int peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return 0;
            }else{
                return arr[top];
            }
        }
        int pop(){
            if(top == -1){
                System.out.println("Stack is Empty !");
                return 0;
            }else{
                top --;
                return arr[top+1];
            }
        }
    }

    public static void main(String[] args) {
       Stack st = new Stack();
       st.push(5);
       st.push(10);
       st.push(50);
       st.push(100);
       st.display();
       st.pop();
       st.display();
       
    }
}
