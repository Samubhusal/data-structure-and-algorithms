class Node{
    int data;
    //Node node;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DynamicListLinkedList{

    public static void main(String[] args){
        Node head=new Node(20);
        Node second=new Node(40);
        Node third=new Node(60);

        head.next=second;
        second.next=third;

        Node temp=head;
        System.out.println("Element are :");

        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
