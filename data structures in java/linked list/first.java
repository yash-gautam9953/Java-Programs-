public class first {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        node head=null;
        node tail = null;
        int size=0;
        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
           tail=temp;
           size++;
        }
        void display(){
            node temp = head; 
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.println();
        }
        void insertstart(int data){
            node temp = new node(data);
            if(head == null){
                tail=temp;
            }else{
                temp.next=head;
            }
            head = temp;
            size++;
        }
        void insertAtIdx(int data,int idx){
            node temp = new node(data);
            node iteration = head;
            if(idx == size){
                insertAtEnd(data);
                return;
            }else if(idx == 0){
                insertstart(data);
                return;
            }else if(idx<0 || idx > size){
                System.out.println("Wrong index");
                return;
            }
            for(int i=0;i<idx-1;i++){
                iteration = iteration.next;
            }
            temp.next=iteration.next;
            iteration.next=temp;
            size++;
        }
        void getElementAtIdx(int idx){
            node temp=head;
            int i=0;
            if(idx<0 || idx >= size){
                System.out.println("Wrong index");
                return;
            }
            while(i != idx){
                temp = temp.next;
                i++;
            }
            System.out.println("the element at "+idx +" is : "+temp.data);
        }
        void deleteAtIdx(int idx){
            
            if(idx==0){
                head =head.next;
                return;
            }else if(idx<0 || idx >= size){
                System.out.println("Wrong index");
                return;
            }
            node temp =head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
   public static void main(String[] args) {
        linkedList ll= new linkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3); 
        ll.insertstart(0);
        ll.insertAtIdx(4, 4);
        ll.display();
        ll.deleteAtIdx(5);
        ll.display();
        
    
   }

}



