public class QueueLL {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class QueueLinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add( int data){
            Node temp = new Node(data);
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next =temp;
                tail=temp;
            }
            size++;
        
        }
        public void display(){
            Node temp = head;
            System.out.print("Queue Elements are : ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }else{
                int val = head.data;
                head = head.next;
                return val;
            }
        }
        
    }
    
    public static void main(String[] args) {

        QueueLinkedList q= new QueueLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.remove());
        q.display();
        
        
    }
}

