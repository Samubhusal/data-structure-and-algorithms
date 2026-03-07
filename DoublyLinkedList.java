public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head != null) {
            head.prev = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at specific position
    void insertAtPosition(int value, int pos) {
        Node newNode = new Node(value);

        if (pos == 1) {
            insertAtBeginning(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position not found");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(5);
        list.insertAtPosition(15, 2);
    }
}