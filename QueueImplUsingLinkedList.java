class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class QueueImplUsingLinkedList {
    Node rear=null;
    Node front=null;
    //ENQUEUE OPERATION
    public void enqueue(int element){
        Node newNode=new Node(element);
        if(rear==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        System.out.println("Elemenet Inserted:"+element);
    }  

    //DEQUEUE OPERATION
    public int dequeue(){
        if(front==null){
            System.out.println("queue underflow");
            return -1;
        }
        int element=front.data;
        front=front.next;

        if(front==null){
            rear=null;
        }
        return element;
    }

    //Display 
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        QueueImplUsingLinkedList  queue=new QueueImplUsingLinkedList();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(" Qequeue element:"+queue.dequeue());

        System.out.println("Queue elements:");

        queue.display();

    } 
}
